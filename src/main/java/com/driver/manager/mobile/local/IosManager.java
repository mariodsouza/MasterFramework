package com.driver.manager.mobile.local;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.config.factory.ConfigFactory;

import io.appium.java_client.remote.MobileCapabilityType;

public final class IosManager {
	
	private IosManager() {}
	
	public static WebDriver getDriver() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigFactory.getConfig().iOSMobiledeviceName());
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/src/test/resources/*.zip");
		
		return new RemoteWebDriver(ConfigFactory.getConfig().localAppiumServerURL(), caps);
		
	}

}
