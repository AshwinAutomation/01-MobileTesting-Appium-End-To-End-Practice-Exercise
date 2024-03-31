package com.mobile.appium.automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class AppiumBasic {

	@Test
	public void basicTest1() throws MalformedURLException {		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("AshwinEmulator");
		options.setApp(
				"E:\\Automation Empire\\MobileAutomationTesting\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://192.168.42.1:4723"), options);
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
	
	}
}
