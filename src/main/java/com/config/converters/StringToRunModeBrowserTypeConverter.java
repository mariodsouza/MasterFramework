package com.config.converters;

import java.lang.reflect.Method;
import org.aeonbits.owner.Converter;

import com.config.enums.RunModeType;

public class StringToRunModeBrowserTypeConverter implements Converter<RunModeType>{

	@Override
	public RunModeType convert(Method method, String browserRunMode) {
		
		return RunModeType.valueOf(browserRunMode.toUpperCase());
		
	}

}