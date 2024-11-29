package com.whaot.StepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.whaot.whaot.locators.Teacher_ClassCancel_Locators;
import com.whaot.whaot.locators.Teacher_Signin_Locators;
import com.whaot.whaot_constants.Constants;
import com.whaot.whaot_webdriver_manager.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Whaot_Teacher_Login {
	
	private static final Logger LOGGER=LogManager.getFormatterLogger(Whaot_Teacher_Login.class);
	
	
	
	
	@Given("teacher is whaot home page")
	public void teacher_is_whaot_home_page() {
		
		DriverManager.getDriver().get(Constants.APPLICATION_URL);
		DriverManager.getDriver().manage().window().maximize();
		
			LOGGER.info("whaot home page should be open");

	    
	}

	@Given("teacher click the signin button")
	public void teacher_click_the_signin_button() {
		try {
			 Teacher_Signin_Locators.getinstance().TeacherClickSignup();
			LOGGER.info("teacher click the signin button");
		   
		} catch (Exception e) {
			LOGGER.error(e);
			
			Assert.fail(e.getMessage());
			
		}
		
	   
	}

	@When("^teacher the signin mobile number (.*)$")
	public void teacher_the_signin_mobile_number(String phonenumber) {
		try {
			Teacher_Signin_Locators.getinstance().TeacherEnterphoneNumber(phonenumber);
			LOGGER.info("teacher the signin mobile number");
			
		} catch (Exception e) {
			LOGGER.error(e);
			
			Assert.fail(e.getMessage());
			
		}
		
	  
	}

	@When("teacher the proceed to button")
	public void teacher_the_proceed_to_button() {
		try {
			Teacher_Signin_Locators.getinstance().TeacherLetgoButton();
			LOGGER.info("teacher the proceed to button");
		} catch (Exception e) {
			LOGGER.error(e);
			
			Assert.fail(e.getMessage());
			
		}
		
	    
	}

	@When("^teacher enter the signin OTP1 number (.*)$")
	public void teacher_enter_the_signin_otp1_number(String OTP1) {
		try {
			Teacher_Signin_Locators.getinstance().TeacherVerifyOTP1(OTP1);
			LOGGER.info("teacher enter the signin OTP1 number");
		} catch (Exception e) {
			LOGGER.error(e);
			
			Assert.fail(e.getMessage());
			
		}
		
	   
	}

	@When("^teacher enter the signin OTP2 number (.*)$")
	public void teacher_enter_the_signin_otp2_number(String OTP2) {
		try {
			Teacher_Signin_Locators.getinstance().TeacherVerifyOTP2(OTP2);
			LOGGER.info("teacher enter the signin OTP2 number");
		} catch (Exception e) {
			LOGGER.error(e);
			
			Assert.fail(e.getMessage());
			
		}
		
	   
	}

	@When("^teacher enter the signin OTP3 number (.*)$")
	public void teacher_enter_the_signin_otp3_number(String OTP3) {
		try {
			Teacher_Signin_Locators.getinstance().TeacherVerifyOTP3(OTP3);
			LOGGER.info("teacher enter the signin OTP3 number");
		} catch (Exception e) {
			LOGGER.error(e);
			
			Assert.fail(e.getMessage());
			
		}
		
	    
	}

	@When("^teacher enter the signin OTP4 number (.*)$")
	public void teacher_enter_the_signin_otp4_number(String OTP4) {
		try {
			Teacher_Signin_Locators.getinstance().TeacherVerifyOTP4(OTP4);
			LOGGER.info("teacher enter the signin OTP4 number");
		} catch (Exception e) {
			LOGGER.error(e);
			
			Assert.fail(e.getMessage());
			
		}
		
	   
	}

	@When("teacher user click to contiune button")
	public void teacher_user_click_to_contiune_button() {
		try {
			Teacher_Signin_Locators.getinstance().TeacherContinueButtonclick();
			LOGGER.info("teacher user click to contiune button");
		} catch (Exception e) {
			LOGGER.error(e);
			
			Assert.fail(e.getMessage());
			
		}
		
	}

	@Then("teacher successfully login the to be show the homepage")
	public void teacher_successfully_login_the_to_be_show_the_homepage() {
		
		try {
			Teacher_Signin_Locators.getinstance().TeacherHome_Page();
			LOGGER.info("teacher successfully login the to be show the homepage");
		} catch (Exception e) {
			LOGGER.error(e);
			
			Assert.fail(e.getMessage());
			
		}
		
	    
	}
	
}
