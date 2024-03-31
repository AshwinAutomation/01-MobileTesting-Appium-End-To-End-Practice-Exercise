package com.mobile.appium.automation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.mobile.appium.testbase.TestBase;
import io.appium.java_client.AppiumBy;

public class SetWifiName extends TestBase {

	@Test
	public void setWiFi() throws MalformedURLException {
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		// android:id/alertTitle
		String textvalue = driver.findElement(By.id("android:id/alertTitle")).getText();
		System.out.println("textvalue : " + textvalue);
		driver.findElement(By.id("android:id/edit")).sendKeys("Ashwin1234");
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
	}

}
