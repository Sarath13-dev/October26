package org.login;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Baseclass {
	
	public static AppiumDriverLocalService build;
	public static AndroidDriver driver;
	
	//Statrting the Server
	public static void startServer() {
		build = new AppiumServiceBuilder().
		withAppiumJS(new File("C:\\Users\\LENOVO\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
		.withIPAddress("127.0.0.1").usingPort(4723).build();
		build.start();
	}
	
	//Launch the app
	public static void launchapp(String deviceName, String appPath) throws MalformedURLException {
		UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
		uiAutomator2Options.setCapability("deviceName", deviceName);
		uiAutomator2Options.setCapability("app", appPath);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), uiAutomator2Options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	//Enter the text
	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	
	
	
	//Click on the button
	public static void buttonClick(WebElement element) {
		element.click();
	}
	
	//Gestures
	public static void longPressOperation(WebElement element, int seconds) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("mobile:longClickGesture", ImmutableMap.of("elementId", 
				((RemoteWebElement)element).getId(), "duration",  seconds));
	}
	
	public static void dragAndDrop(WebElement element, int endx, int endy) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("mobile:dragGesture", ImmutableMap.of("elementId", 
				((RemoteWebElement)element).getId(), "endX", endx, "endY", endy));
	}
	
	
	
	
	

}
