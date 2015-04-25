package com.daluga.baseball.model;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class EnvironmentModeJUnitRunner extends SpringJUnit4ClassRunner {

	public EnvironmentModeJUnitRunner(Class<?> clazz) throws InitializationError {
		super(clazz);
		initJvmParams();
	}

	public static void initJvmParams() {
		System.out.println("Initializing JVM parameters...");
		//System.getProperties().put("properties.root", "classpath:");
	    //System.getProperties().put("env.mode", "local");
	}
}

