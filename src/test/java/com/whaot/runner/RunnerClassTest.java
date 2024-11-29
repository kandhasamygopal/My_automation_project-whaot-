package com.whaot.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		 plugin= { "pretty", "rerun:failed_Scenarios/failed_scenarios.txt",
				 "html:reports/webreport.html" ,
				 "json:reports/jsonreport.json",
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		 
		 features = {"src/test/resources/features/"} ,
         glue = {"com.whaot.StepDefinations","com.whaot.hooks"}, 
       	 dryRun= false,	
		 stepNotifications = true,
		 publish = false,
		 snippets = SnippetType.UNDERSCORE,
		 monochrome=false,	
		 
	 
		 tags= "@Student_Signup"
		 
		     		
    	)
		 

public class RunnerClassTest {

}
