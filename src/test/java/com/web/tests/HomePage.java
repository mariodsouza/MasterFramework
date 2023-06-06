package com.web.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {
	
	
	@Test
	public void testHomePage() {
		
		System.out.println(com.config.ConfigFactory.getConfig().browser());
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.mxplayer.in/");
//		driver.quit();
		
	}

}
