package com.mobile.appium.testbase;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class EcommerceTestBase {
	public AndroidDriver driver;
	public AppiumDriverLocalService services;

	@BeforeClass
	public void configAppium() throws MalformedURLException {
//		 services = new AppiumServiceBuilder()
//		.withAppiumJS(new File(
//				"C:\\Users\\Ashwin Mahakul\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//		.withIPAddress("192.168.42.1").usingPort(4723).build();
//services.start();
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("AshwinEmulator");
		options.setChromedriverExecutable("E:\\Automation Empire\\MobileAutomationTesting\\driver\\chromedriver.exe");
		options.setApp(
				"E:\\Automation Empire\\MobileAutomationTesting\\src\\test\\java\\resources\\General-Store.apk");
		driver = new AndroidDriver(new URL("http://192.168.42.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void longPress(WebElement element) {
       ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
   		    "elementId", ((RemoteWebElement) element).getId()
   		));
	}
	
	
	
	// Swipe-Gesture 
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
	public void tearDown() {
		driver.quit();
		// services.stop();
	}
}
