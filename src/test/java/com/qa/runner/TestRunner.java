package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\s.maiya\\eclipse-workspace\\17_07_2019_Selinium\\ApiFrameWork-BDD\\src\\main\\java\\com\\qa\\features\\Addplace.feature", // the
																																								// files
		glue = { "com.qa.stepdefinition" }, //step definition 
		plugin = { "pretty", "html:test-outout", "json:target/jsonReports/json_output.json","junit:junit_xml/cucumber.xml"}, //reports in Html, json and XML
		monochrome = true, // to make Console output readable 
		dryRun = false, // to check one to one mapping with Feature and StepDefinition methods 
		strict =false)

public class TestRunner {

}
