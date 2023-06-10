package com.driver.factory.mobile.local;

import org.openqa.selenium.WebDriver;
import com.config.enums.MobilePlatformType;
import com.driver.manager.mobile.local.AndroidManager;
import com.driver.manager.mobile.local.IosManager;

public final class LocalMobileDriverFactory {
	
	private LocalMobileDriverFactory() {}
	
	public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {

		if (mobilePlatformType == MobilePlatformType.ANDROID) {
			return AndroidManager.getDriver();
		} else if (mobilePlatformType == MobilePlatformType.IOS) {
			return IosManager.getDriver();
		} else
			return null;

	}

}
