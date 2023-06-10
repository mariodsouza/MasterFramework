package utils;

import org.openqa.selenium.By;

import com.driver.Driver;

public class PageActionsHelper {
	
	private PageActionsHelper() {}
	
	public static void waitAndClick(By by) {
		Driver.initDriverWeb().findElement(by).click();
	}

}
