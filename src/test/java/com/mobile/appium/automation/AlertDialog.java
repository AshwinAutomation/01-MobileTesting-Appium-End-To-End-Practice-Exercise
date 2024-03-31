package com.mobile.appium.automation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mobile.appium.testbase.TestBase;

import io.appium.java_client.AppiumBy;

public class AlertDialog extends TestBase{

	@Test(enabled = false,priority = 1)
	public void alertDialogAccept() {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
		driver.findElement(By.id("android:id/button1")).click();
		driver.quit();
	}
	
	@Test(enabled = false,priority = 2)
	public void listOfDialog() {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
		driver.findElement(By.id("android:id/text1")).click();
	    String textMessage = driver.findElement(By.id("android:id/message")).getText();
	    Assert.assertEquals(textMessage, "You selected: 0 , Command one");
	    Assert.assertTrue(driver.findElement(By.id("android:id/message")).isDisplayed());
	    driver.quit();
	}
	
	@Test(enabled = true,priority = 3)
	public void textEntryDialog() {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
		driver.findElement(By.id("io.appium.android.apis:id/username_edit")).sendKeys("Ashwin@gmail.com");
		driver.findElement(By.id("io.appium.android.apis:id/password_edit")).sendKeys("Ashwin@gmail.com");
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		driver.quit();
		
		
		
	}
}

