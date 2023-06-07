package com.driver.factory;

import org.openqa.selenium.WebDriver;

import com.config.enums.BrowserType;
import com.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;

public final class BrowserStackFactory {
	
	private BrowserStackFactory() {}
	
	public static WebDriver getDriver(BrowserType browserType) {
		
		if (browserType == BrowserType.CHROME) {
			return BrowserStackChromeManager.getDriver();
		} else if (browserType == BrowserType.FIREFOX) {
			return BrowserStackFirefoxManager.getDriver();
		} else
			return null;
		
	}

}
