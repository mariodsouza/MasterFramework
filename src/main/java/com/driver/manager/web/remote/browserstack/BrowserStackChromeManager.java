package com.driver.manager.web.remote.browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.config.factory.BrowserStackConfigFactory;

public final class BrowserStackChromeManager {
	
	private BrowserStackChromeManager() {}
	
	public static WebDriver getDriver() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName(BrowserType.CHROME);
		caps.setCapability("browser_version", "latest");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		
		return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().broswerStackURL(), caps);

	}

}
