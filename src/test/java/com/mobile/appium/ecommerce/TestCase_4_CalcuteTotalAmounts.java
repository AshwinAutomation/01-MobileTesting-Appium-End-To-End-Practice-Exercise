package com.mobile.appium.ecommerce;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mobile.appium.testbase.EcommerceTestBase;

import io.appium.java_client.AppiumBy;

public class TestCase_4_CalcuteTotalAmounts extends EcommerceTestBase {

	@Test
	public void validateCalculateTotalAmounts() throws InterruptedException {
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Laurence");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brazil\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Brazil']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		// driver.findElement(By.xpath("(//android.widget.TextView[@text='ADD TO CART'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.attributeContains(
				driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
		double sum = 0;
		// validate multiple product price
		// com.androidsample.generalstore:id/productPrice
		List<WebElement> productsPrice = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
		int prodcutCounts = productsPrice.size();
		for (int i = 0; i < prodcutCounts; i++) {
			String pricesOfProduct = productsPrice.get(i).getText();
			String productAmount = pricesOfProduct.substring(1);
			double expectedAmount = Double.parseDouble(productAmount);
			sum = sum+expectedAmount;
		}
		String overallAmount = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		String overallproductAmount = overallAmount.substring(1);
		double actualSum = Double.parseDouble(overallproductAmount);
		System.out.println(actualSum);
		Assert.assertEquals(sum, actualSum);
	}

}
