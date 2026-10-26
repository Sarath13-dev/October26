package org.login;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Sample extends Baseclass{

	@Test
	private void tc01() throws MalformedURLException, InterruptedException {
		startServer();
		launchapp("Sam", "C:\\Users\\LENOVO\\newEclipseWorkspe\\SampleAppiumAug26\\src\\test\\resources\\General-Store.apk");
		GeneralStoreHomepage home = new GeneralStoreHomepage();
		WebElement dropDown = home.getDropDown();
		buttonClick(dropDown);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())"
				+ ".scrollIntoView(text(\"India\"));"));
		buttonClick(home.getIndia());
		enterText(home.getTextBox(), "Ram");
		buttonClick(home.getLetshop());
		Thread.sleep(3000);
		driver.quit();
		build.stop();
	}

}
