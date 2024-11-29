package com.whaot.hooks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import com.whaot.whaot_utilitiles.CommonUtils;
import com.whaot.whaot_webdriver_manager.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Whaot_Common_Step_Definations {
	
	private static String scenarioName=null;
	WebDriver driver= DriverManager.getDriver();
	private static int scenarioCount=0;
	
	private static String getScenarioname() {
		return scenarioName;
		
	}
	
	private static final Logger LOGGER=LogManager.getLogger(Whaot_Common_Step_Definations.class);

	

   @Before
	public void BeforeScenario(Scenario scenario) {
		LOGGER.info("Execution started");
		
		try {
    		scenarioName = scenario.getName();
			System.out.println("Scenario name - Before Scenario: ");
			System.out.println(scenario.getName());

			LOGGER.info("Instantiating CommonUtils");
			
			LOGGER.info("loading the properties files");
			CommonUtils.getInstance().loadproperties();
			
			LOGGER.info("Checking the Driver is NULL OR NOT");
    		if(driver==null) {
			    LOGGER.info("Driver is NULL. Instantiating it!");	
//			    boolean isLocalMode = true;// or false for command mode
//			    DriverManager.setLocalMode(isLocalMode);
			    DriverManager.launchBrowser();
			    CommonUtils.getInstance();
			    CommonUtils.initWebElements();
			    SessionId session=((RemoteWebDriver)DriverManager.getDriver()).getSessionId();
			    LOGGER.info("sessionid before close operation " + session);
			    System.out.println("Browser is open");
			  
			    
			}
			
    		
	} 
		catch (Exception e) {
			e.printStackTrace();
	}
			
		}
 


	
	@After
	public void afterScenario(Scenario scenario) {
		

		SessionId session2 =((RemoteWebDriver)DriverManager.getDriver()).getSessionId();
        LOGGER.info("sessionid after using close method is " + session2);
		
		try {
	    LOGGER.info("Execution Completed");
	    DriverManager.CloseBrowser();
				
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}

			
		}
       
	@AfterStep
	public void attach_screenshot(Scenario scenario) {
		
		
		if(scenario.isFailed()) {
			   //Take screenshot
		 byte[] screenshotTaken =((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshotTaken, "image/png", "error screen");
			
		}
		
		
		
	}

	
}
