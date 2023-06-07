package com.config;

import java.net.URL;

import org.aeonbits.owner.Config;

import com.config.converters.StingToURLConverter;

public interface BrowserStackConfig extends Config {
	
	@Key("username")
	String userName();
	
	String key();
	
	@DefaultValue("https://${}userName:$key@hub-cloud.browserstack.com/wd/hub")
	@ConverterClass(StingToURLConverter.class)
	URL broswerStackURL();

}
