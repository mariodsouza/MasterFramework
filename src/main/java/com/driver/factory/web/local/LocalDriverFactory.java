package com.driver.factory.web.local;

import org.openqa.selenium.WebDriver;
import com.config.enums.BrowserType;
import com.driver.manager.web.local.ChromeManager;
import com.driver.manager.web.local.FirefoxManager;

public final class LocalDriverFactory {
	
	private LocalDriverFactory() {}
	
	public static WebDriver getDriver(BrowserType browserType) {

		if (browserType == BrowserType.CHROME) {
			return ChromeManager.getDriver();
		} else if (browserType == BrowserType.FIREFOX) {
			return FirefoxManager.getDriver();
		} else
			return null;

	}

}
