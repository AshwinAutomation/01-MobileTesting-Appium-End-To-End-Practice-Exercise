package com.mobile.appium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mobile.appium.testbase.TestBase;

import io.appium.java_client.AppiumBy;

public class SwipeGesture extends TestBase {

	@Test
	public void swipePhotos() {
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
		// Gallery
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		// photos
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		
		 
		WebElement element = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		// Before Swipe
		String firstPhotoStatusBeforeSwipe= driver.findElement(By.xpath("(//android.widget.ImageView)[1]"))
				.getAttribute("focusable");
		System.out.println(firstPhotoStatusBeforeSwipe);
		//Assert.assertEquals(firstPhotoStatusBeforeSwipe, true,"data mismatch");
		
		//Swipe Photo
		swipeGestureExactly(element, "left");
		Assert.assertEquals(firstPhotoStatusBeforeSwipe, false,"data mismatch");
	}

}
