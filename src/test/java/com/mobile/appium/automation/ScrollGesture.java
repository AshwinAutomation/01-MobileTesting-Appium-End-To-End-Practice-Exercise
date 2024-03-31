package com.mobile.appium.automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.mobile.appium.testbase.TestBase;

import io.appium.java_client.AppiumBy;

public class ScrollGesture extends TestBase{

	@Test
	public void scrollToExactElement() {
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
	}
}
