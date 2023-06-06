package com.config.converters;

import java.lang.reflect.Method;
import org.aeonbits.owner.Converter;

import com.config.enums.BrowserRemoteModeType;

public class StringToRemoteBrowserModeConverter implements Converter<BrowserRemoteModeType>{

	@Override
	public BrowserRemoteModeType convert(Method method, String browserRemoteMode) {
		
		return BrowserRemoteModeType.valueOf(browserRemoteMode.toUpperCase());
		
	}

}