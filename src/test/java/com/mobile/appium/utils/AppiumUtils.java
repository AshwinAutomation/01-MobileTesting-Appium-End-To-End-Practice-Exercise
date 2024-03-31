package com.mobile.appium.utils;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;
import com.mobile.appium.testbase.TestBase;

import io.appium.java_client.AppiumBy;

public class AppiumUtils extends TestBase{

	// long press
	public void longPressGesture(WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),"duration",4000
			));
	}
	
	// scroll to Element
	public void ScrollToElement(String testValue) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
	}
	
	// Swipe-Gesture (element, direction and end percent = Mandatory)
//	public void swipeGestureRandomly() {
//		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
//				"left", 100, "top", 100, "width", 200, "height", 200,
//				"direction", "left",
//				 "percent", 0.75));
//	};

	// Swipe-Gesture (element, direction and end percent = Mandatory)
	public void swipeGestureExactly(WebElement element, String direction) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId(),
			    "direction", direction,
			    "percent", 0.75
			));
	}
	
	//Drag and Drop Gesture  (element, X_cordinate and end Y_cordinate = Mandatory)
	public void dragAndDropGesture(WebElement element, int X_cordinate,int Y_cordinate) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "endX", X_cordinate,
			    "endY", Y_cordinate
			));
	}
  

	
}
