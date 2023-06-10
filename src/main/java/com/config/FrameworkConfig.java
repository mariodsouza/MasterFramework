package com.config;

import java.net.URL;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.DefaultValue;

import com.config.converters.StingToURLConverter;
import com.config.converters.StringToBrowserTypeConverter;
import com.config.enums.BrowserRemoteModeType;
import com.config.enums.BrowserType;
import com.config.enums.RunModeType;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
		"system:properties",
		"system:env",
		"file:${user.dir}/src/test/resources/config.properties"
		})
public interface FrameworkConfig extends Config {
	
	String platform();
	
	String mobilePlatform();
	
	@DefaultValue("staging")
	String environment();
	
	@Key("${environment}.webUrl")
	String webUrl();
	
	@DefaultValue("CHROME")
	@ConverterClass(StringToBrowserTypeConverter.class)
	BrowserType browser();
	
	@Key("runModeBrowser")
	RunModeType browserRunMode();
	
	@Key("browserRemoteMode")
	BrowserRemoteModeType browserRemoteMode();
	
	@ConverterClass(StingToURLConverter.class)
	URL seleniumGridURL();
	
	@DefaultValue("http://0.0.0.0:4723/wd/hub/")
	@ConverterClass(StingToURLConverter.class)
	URL localAppiumServerURL();

	String androidMobiledeviceName();

	String iOSMobiledeviceName();

}