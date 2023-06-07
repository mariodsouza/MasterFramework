package com.config.converters;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.aeonbits.owner.Converter;

import lombok.SneakyThrows;

public class StingToURLConverter implements Converter<URL>{

	@SneakyThrows
	@Override
	public URL convert(Method method, String url) {
		
		try {
			return new URL(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}

}
