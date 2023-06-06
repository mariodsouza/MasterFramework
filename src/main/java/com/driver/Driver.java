package com.driver;

import org.openqa.selenium.WebDriver;

public final class Driver {
	
	private Driver() {}
	
	public static void initDriver() {
		
		WebDriver driver = LocalDriverFactory.getDriver();
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
