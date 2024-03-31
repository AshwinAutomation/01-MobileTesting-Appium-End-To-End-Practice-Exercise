package com.mobile.appium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.mobile.appium.testbase.TestBase;

public class LongClickGesture extends TestBase {

	@Test
	public void longPress() {
		// click on views
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
		// click on Expandable List
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
		// click on customer adopter
		driver.findElement(By.id("android:id/text1")).click();
		// People Names Web-element
		WebElement peopleNames = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longPress(peopleNames);
		// validate sample menu text
		String textValue = driver.findElement(By.id("android:id/title")).getText();
		Assert.assertEquals(textValue, "Sample menu");
		Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());

	}
}
