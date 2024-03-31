package com.mobile.appium.ecommerce;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.mobile.appium.testbase.EcommerceTestBase;
import io.appium.java_client.AppiumBy;

public class Testcase_3_ValidateParticularShoeFromAddToCart extends EcommerceTestBase{

	@Test
	public void validateShoeFromAddTocart() throws InterruptedException {
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Laurence");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brazil\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Brazil']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Nike Blazer Mid '77\"));"));
		List<WebElement> productElements = driver.findElements(By.id("com.androidsample.generalstore:id/productName"));
		int productCount = productElements.size();
		System.out.println("productList :" + productCount);
		for (int i = 0; i < productCount; i++) {
			WebElement productList = productElements.get(i);
			String productName = productList.getText();
			System.out.println("productName : " + productName);
			if (productName.equals("Nike Blazer Mid '77")) {
				System.out.println("inside if");
				driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
			}
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
		String shoeName = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		System.out.println("shoeName : " + shoeName);
	}
}
