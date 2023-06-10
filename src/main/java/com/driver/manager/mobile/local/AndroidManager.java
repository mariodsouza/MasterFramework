package com.driver.manager.mobile.local;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.config.factory.ConfigFactory;

import io.appium.java_client.remote.MobileCapabilityType;

public final class AndroidManager {
	
	private AndroidManager() {}
	
	public static WebDriver getDriver() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigFactory.getConfig().androidMobiledeviceName());
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomator2");
		caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/src/test/resources/*.apk");
		
		return new RemoteWebDriver(ConfigFactory.getConfig().localAppiumServerURL(), caps);
		
	}

}
