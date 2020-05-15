package com.qa.resource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import io.restassured.specification.RequestSpecification;

public class Specs {
	
	static RequestSpecification reqSpec;
	static PrintStream stream;
	
	public static RequestSpecification requestSpecs() throws FileNotFoundException {
		if (reqSpec == null) {
			stream = new PrintStream(new FileOutputStream("logging.txt"));
			reqSpec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
					.addQueryParam("key", "qaclick123").addHeader("Content-Type", "application/json")
					.addFilter(RequestLoggingFilter.logRequestTo(stream))
					.addFilter(ResponseLoggingFilter.logResponseTo(stream)).build();
			return reqSpec;
		} return reqSpec;
		
	}

}
