package com.driver;

import org.openqa.selenium.WebDriver;

import com.config.enums.BrowserRemoteModeType;
import com.config.enums.BrowserType;
import com.config.enums.MobilePlatformType;
import com.config.enums.RunModeType;
import com.config.factory.ConfigFactory;
import com.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.driver.factory.web.local.LocalDriverFactory;
import com.driver.factory.web.remote.RemoteDriverFactory;

public final class Driver {
	
	private Driver() {}
	
	public static WebDriver driver;
	
	public static WebDriver initDriver() {
		
		if(ConfigFactory.getConfig().platform() == "web") {
			return initDriverWeb();
		} else {
//			initDriverMobile(ConfigFactory.getConfig().mobilePlatform());
			return null;
		}
		
		//local web
		//WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
		
		//remote web
		//WebDriver driver = RemoteDriverFactory.getDriver(ConfigFactory.getConfig().browserRemoteMode(), ConfigFactory.getConfig().browser());
		
		//local mobile android
		//WebDriver driver = LocalMobileDriverFactory.getDriver(MobilePlatformType.ANDROID);
		
		//local mobile ios
		//WebDriver driver = LocalMobileDriverFactory.getDriver(MobilePlatformType.IOS);
		
		//driver.get("https://www.mxplayer.in/");
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.mxplayer.in/");
//		driver.quit();
		
	}
	
	public static WebDriver initDriverWeb() {
		
		if (ConfigFactory.getConfig().browserRunMode() == RunModeType.LOCAL) {
			 return LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
		} else {
			 return RemoteDriverFactory.getDriver(ConfigFactory.getConfig().browserRemoteMode(), ConfigFactory.getConfig().browser());
		}

		
	}
	
	public static void initDriverMobile(MobilePlatformType mobilePlatformType) {
		
		if (mobilePlatformType == MobilePlatformType.ANDROID) {
			 driver = LocalMobileDriverFactory.getDriver(MobilePlatformType.ANDROID);
		} else {
			 driver = LocalMobileDriverFactory.getDriver(MobilePlatformType.IOS);
		}

	}
	
	public static void loadURL() {
		driver.get(ConfigFactory.getConfig().webUrl());
	}
	
	public static void quitDriver() {
		driver.quit();
	}

}
