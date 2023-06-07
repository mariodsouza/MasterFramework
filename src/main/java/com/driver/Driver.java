package com.driver;

import org.openqa.selenium.WebDriver;

import com.config.factory.ConfigFactory;
import com.driver.factory.LocalDriverFactory;

public final class Driver {
	
	private Driver() {}
	
	public static void initDriver() {
		
		WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
		driver.get("https://www.mxplayer.in/");
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.mxplayer.in/");
//		driver.quit();
		
	}
	
	public static void quitDriver() {
//		driver.quit();
	}

}
