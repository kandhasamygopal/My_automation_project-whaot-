package com.whaot.StepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import com.whaot.whaot.locators.SignupPageLocators;
import com.whaot.whaot_constants.Constants;
import com.whaot.whaot_utilitiles.CommonUtils;
import com.whaot.whaot_webdriver_manager.DriverManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WhaotloginDefinations {


	private static final Logger LOGGER=LogManager.getLogger(WhaotloginDefinations.class);



	@Given("user is whaot home page")
	public void user_is_whaot_home_page() {
		//Whaot Home page open

		DriverManager.getDriver().get(Constants.APPLICATION_URL);
		DriverManager.getDriver().manage().window().maximize();
		
	
			LOGGER.info("whaot home page should be open");
		}
		

	@And("user click the signin button")
	public void user_click_the_signin_button() {
		try { 
			SignupPageLocators.getInstance().ClickSignup();

			LOGGER.info("user click the signin button");
		}
		catch (Exception e) {
			LOGGER.error(e);
		
			Assert.fail(e.getMessage());
		}

	}
	@When("^enter the signin mobile number (.*)$")
	public void enter_the_signin_mobile_number(String phonenumber) throws Throwable {

		try {
		
			SignupPageLocators.getInstance().EnterphoneNumber(phonenumber);

			LOGGER.info("enter the signin mobile number");
		}
		catch (Exception e) {
			LOGGER.error(e);
			
			Assert.fail(e.getMessage());
		}

	}
	@When("click the proceed to button")
	public void click_the_proceed_to_button() {

		try {
			SignupPageLocators.getInstance().LetgoButton();	
			LOGGER.info("click the proceed to button");
		}
		catch (Exception e) {
			LOGGER.error(e);
		
			Assert.fail(e.getMessage());
		}
	}

	@When("^enter the signin OTP1 number (.*)$")
	public void enter_the_signin_otp1_number(String OTP1) throws Throwable {

		try {
			
			SignupPageLocators.getInstance().VerifyOTP1(OTP1);
			LOGGER.info("enter the signin OTP1 number");
			
		}
		catch (Exception e) {
			LOGGER.error(e);
			
			Assert.fail(e.getMessage());
		}
	}

	@When("^enter the signin OTP2 number (.*)$")
	public void enter_the_signin_otp2_number(String OTP2) throws Throwable {
		try {
			SignupPageLocators.getInstance().VerifyOTP2(OTP2);
			LOGGER.info("enter the signin OTP2 number");
		}
		catch (Exception e) {
			LOGGER.error(e);
	
			Assert.fail(e.getMessage());
		}
	}

	@When("^enter the signin OTP3 number (.*)$")
	public void enter_the_signin_otp3_number(String OTP3) throws Throwable {
		try {
			SignupPageLocators.getInstance().VerifyOTP3(OTP3);
			LOGGER.info("enter the signin OTP3 number");
		}
		catch (Exception e){
			LOGGER.error(e);
		
			Assert.fail(e.getMessage());
		}

	}

	@When("^enter the signin OTP4 number (.*)$")
	public void enter_the_signin_otp4_number(String OTP4) throws InterruptedException {
		try {
			SignupPageLocators.getInstance().VerifyOTP4(OTP4);
			LOGGER.info("enter the signin OTP4 number");
		}
		catch (Exception e) {
			LOGGER.error(e);
		
			Assert.fail(e.getMessage());
		}

	}
	
	@When("user click to contiune button")
	public void userClickToContiuneButton() {
	    try {
	    	SignupPageLocators.getInstance().ContinueButtonclick();
	    	LOGGER.info("user click to contiune button");
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error(e);
			
			Assert.fail(e.getMessage());
		}
	}

	@Then("user successfully login the to be show the homepage")
	public void user_successfully_login_the_to_be_show_the_homepage() throws InterruptedException {
		try {
		
		SignupPageLocators.getInstance().Home_Page();
		LOGGER.info("user successfully login the to be show the homepage");
		}
		catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}


}