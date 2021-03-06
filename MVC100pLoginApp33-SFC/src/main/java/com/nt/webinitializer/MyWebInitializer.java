package com.nt.webinitializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.nt.config.RootAppConfig;
import com.nt.config.WebMvcAppConfig;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	public Class<?>[] getRootConfigClasses() {
		return new Class[]{RootAppConfig.class}; 
	}

	@Override
	public Class<?>[] getServletConfigClasses() {
		return new Class[]{WebMvcAppConfig.class};
	}

	@Override
	public String[] getServletMappings() {
		return new String[]{"*.htm"};
	}

}//class
