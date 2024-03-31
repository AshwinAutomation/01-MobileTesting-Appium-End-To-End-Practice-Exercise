package com.mobile.appium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.annotations.Test;

import com.mobile.appium.testbase.TestBase;

import io.appium.java_client.AppiumBy;

public class LandscapeMode extends TestBase{
	
	@Test
	public void executeInLandscapeMode() {
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		//Land-scape mode
		DeviceRotation landscapeMode = new DeviceRotation(0, 0, 90);
		driver.rotate(landscapeMode);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String textvalue = driver.findElement(By.id("android:id/alertTitle")).getText();
		System.out.println("textvalue : " + textvalue);
		driver.findElement(By.id("android:id/edit")).sendKeys("Ashwin1234");
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		

		
		
		
				
	}

}
