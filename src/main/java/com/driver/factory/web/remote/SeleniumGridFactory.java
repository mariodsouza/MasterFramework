package com.driver.factory.web.remote;

import org.openqa.selenium.WebDriver;

import com.config.enums.BrowserType;
import com.driver.manager.web.remote.seleniumgrid.SeleniumGridChromeManager;
import com.driver.manager.web.remote.seleniumgrid.SeleniumGridFirefoxManager;

public final class SeleniumGridFactory {
	
	private SeleniumGridFactory() {}
	
	public static WebDriver getDriver(BrowserType browserType) {
		
		if (browserType == BrowserType.CHROME) {
			return SeleniumGridChromeManager.getDriver();
		} else if (browserType == BrowserType.FIREFOX) {
			return SeleniumGridFirefoxManager.getDriver();
		} else
			return null;
		
	}

}
