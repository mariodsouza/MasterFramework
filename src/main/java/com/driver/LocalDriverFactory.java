package com.driver;

import org.openqa.selenium.WebDriver;
import com.config.ConfigFactory;
import com.config.enums.BrowserType;
import com.driver.manager.ChromeManager;
import com.driver.manager.FirefoxManager;

public final class LocalDriverFactory {
	
	private LocalDriverFactory() {}
	
	public static WebDriver getDriver() {
		
		WebDriver driver = null;
		BrowserType browsertype = ConfigFactory.getConfig().browser();
		if (browsertype == BrowserType.CHROME) {
			driver = ChromeManager.getDriver();
		} else if (browsertype == BrowserType.FIREFOX) {
			driver = FirefoxManager.getDriver();
		}
		return driver;
	}

}
