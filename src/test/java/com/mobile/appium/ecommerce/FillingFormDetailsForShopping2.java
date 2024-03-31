package com.mobile.appium.ecommerce;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.mobile.appium.testbase.EcommerceTestBase;
import io.appium.java_client.AppiumBy;

public class FillingFormDetailsForShopping2 extends EcommerceTestBase {

	@Test
	public void FillShoppingFormDetails() throws InterruptedException {
//		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Laurence");
//		driver.hideKeyboard();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
//		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String name = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		System.out.println("toastMessage : " + name);
	    Assert.assertEquals(name, "Please enter your name");
	}

}