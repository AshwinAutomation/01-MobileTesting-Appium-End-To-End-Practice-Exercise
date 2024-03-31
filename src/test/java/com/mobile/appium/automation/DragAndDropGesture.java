package com.mobile.appium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mobile.appium.testbase.TestBase;
import com.mobile.appium.utils.AppiumUtils;

import io.appium.java_client.AppiumBy;

public class DragAndDropGesture extends TestBase {

	AppiumUtils utils = new AppiumUtils();

	@Test
	public void dragAndDrop() {
		// click on views
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
		// click drag and drop
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		dragAndDropGesture(source, 818, 715);
		WebElement droppedMessage = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text"));
		Assert.assertEquals(droppedMessage, "Dropped!");
		Assert.assertTrue(driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).isDisplayed());
		
	}
}
