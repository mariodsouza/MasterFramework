package com.config;

import java.net.URL;

import org.aeonbits.owner.Config;

import com.config.converters.StingToURLConverter;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
		"file:${user.dir}/src/test/resources/browserstack.properties"
		})
public interface BrowserStackConfig extends Config {
	
	@Key("username")
	String userName();
	
	String key();
	
	@DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/wd/hub")
	@ConverterClass(StingToURLConverter.class)
	URL broswerStackURL();

}
