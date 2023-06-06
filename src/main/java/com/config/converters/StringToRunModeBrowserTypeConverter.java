package com.config.converters;

import java.lang.reflect.Method;
import org.aeonbits.owner.Converter;

import com.config.enums.RunModeBrowserType;

public class StringToRunModeBrowserTypeConverter implements Converter<RunModeBrowserType>{

	@Override
	public RunModeBrowserType convert(Method method, String browserRunMode) {
		
		return RunModeBrowserType.valueOf(browserRunMode.toUpperCase());
		
	}

}