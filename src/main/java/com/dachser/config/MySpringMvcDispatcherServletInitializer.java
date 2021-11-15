package com.dachser.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// set the reference to AppConfig Class where add all java config
		return new Class[] {AppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// the the root path 
		return new String[] {"/"};
	}

}
