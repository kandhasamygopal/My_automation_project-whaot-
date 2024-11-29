package com.whaot.whaot_utilitiles;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

//import com.whaot.hooks.DriverManager;
import com.whaot.hooks.Whaot_Common_Step_Definations;
import com.whaot.whaot.locators.SignupPageLocators;
import com.whaot.whaot.locators.StudentBookingclassLocators;
import com.whaot.whaot.locators.StudentSignup_Locators;
import com.whaot.whaot.locators.Student_ClassCancel_Locators;
import com.whaot.whaot.locators.Student_RescheduleClass_Locators;
import com.whaot.whaot.locators.Student_Reschedule_Request_Accept_Locators;
import com.whaot.whaot.locators.TeacherProfile_Locators;
import com.whaot.whaot.locators.TeacherScheduleClass_Locators;
import com.whaot.whaot.locators.TeacherSignup_Locators;
import com.whaot.whaot.locators.Teacher_ClassCancel_Locators;
import com.whaot.whaot.locators.Teacher_RescheduleClass_Locators;
import com.whaot.whaot.locators.Teacher_Reschedule_Request_Accept_Locators;
import com.whaot.whaot_constants.Constants;
import com.whaot.whaot_webdriver_manager.DriverManager;

public class CommonUtils {
	
	private static CommonUtils CommonUtilsInstance;
	
	private CommonUtils() {
		
	}
	public static CommonUtils getInstance() {
		
		if(CommonUtilsInstance==null) {
			CommonUtilsInstance=new CommonUtils();
		}
		return CommonUtilsInstance;
		
	}
	

	public void loadproperties() {
		
		Properties  properties= new Properties();	
		try {
			
			properties.load(getClass().getResourceAsStream("/Whaot_configuration.properties"));
			
		} catch (Exception e) {
			e.printStackTrace();
			
			
			// TODO: handle exception
		}
		

		Constants.APPLICATION_URL=properties.getProperty("APPLICATION_URL");
		Constants.BROWSER=properties.getProperty("BROWSER");
		Constants.CHROME_DRIVER_LOCATION=	properties.getProperty("CHROME_DRIVER_LOCATION");
		Constants.FIREFOX_DRIVER_LOCATION=properties.getProperty("FIREFOX_DRIVER_LOCATION");
		Constants.EDGE_DRIVER_LOCATION=properties.getProperty("EDGE_DRIVER_LOCATION");
		Constants.USERPHONENUMBER=properties.getProperty("USERPHONENUMBER");
		Constants.OTP=properties.getProperty("OTP");
		Constants.grid_mode=properties.getProperty("grid_mode");
		Constants.docker=properties.getProperty("docker");

	}
	
	public static void initWebElements() {
		
		PageFactory.initElements(DriverManager.getDriver(),SignupPageLocators.getInstance());
		PageFactory.initElements(DriverManager.getDriver(),StudentBookingclassLocators.getInstance());
		PageFactory.initElements(DriverManager.getDriver(),StudentSignup_Locators.getInstance());
		PageFactory.initElements(DriverManager.getDriver(),TeacherSignup_Locators.getinstance());
		PageFactory.initElements(DriverManager.getDriver(),TeacherProfile_Locators.getInstance());
		PageFactory.initElements(DriverManager.getDriver(),TeacherScheduleClass_Locators.getInstance());
		PageFactory.initElements(DriverManager.getDriver(),Student_ClassCancel_Locators.getInstance());
		PageFactory.initElements(DriverManager.getDriver(),Teacher_ClassCancel_Locators.getInstance());
		PageFactory.initElements(DriverManager.getDriver(),Student_RescheduleClass_Locators.getInstance());
		PageFactory.initElements(DriverManager.getDriver(),Teacher_Reschedule_Request_Accept_Locators.getInstance());
		PageFactory.initElements(DriverManager.getDriver(),Teacher_RescheduleClass_Locators.getInstance());
		PageFactory.initElements(DriverManager.getDriver(),Student_Reschedule_Request_Accept_Locators.getInstance());
		PageFactory.initElements(DriverManager.getDriver(),TeacherSignup_Locators.getinstance());
		
		
	}
	
	public void takeScreenshot( ) {
		
		File  screenshot=((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
		
		//Copy the file to a location and use to try catch block to handle exception
//		try {
//			org.apache.commons.io.FileUtils.copyFile(screenshot,new File(Whaot_Common_Step_Definations.getScenarioName()+".png"));
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}
		
	}
	     public void highlightElement(WebElement element) {	
		  JavascriptExecutor executor=(JavascriptExecutor) DriverManager.getDriver();
		  executor.executeScript("arguments[0].setAttribute('style','border:3px solid blue'};", element);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


