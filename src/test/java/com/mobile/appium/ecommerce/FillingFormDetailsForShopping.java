package com.mobile.appium.ecommerce;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.mobile.appium.testbase.EcommerceTestBase;
import io.appium.java_client.AppiumBy;

public class FillingFormDetailsForShopping extends EcommerceTestBase {

	@Test
	public void FillShoppingFormDetails() throws InterruptedException {
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Laurence");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brazil\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Brazil']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

	}
 
}
