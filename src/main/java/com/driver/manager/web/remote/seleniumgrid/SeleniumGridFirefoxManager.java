package com.driver.manager.web.remote.seleniumgrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.config.factory.ConfigFactory;

public class SeleniumGridFirefoxManager {
	
	private SeleniumGridFirefoxManager() {}

	public static WebDriver getDriver() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName(BrowserType.FIREFOX);
		return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), caps);
	}

}
