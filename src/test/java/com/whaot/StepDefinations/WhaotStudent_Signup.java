package com.whaot.StepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.whaot.whaot.locators.StudentSignup_Locators;
import com.whaot.whaot_constants.Constants;
import com.whaot.whaot_utilitiles.CommonUtils;
import com.whaot.whaot_webdriver_manager.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WhaotStudent_Signup {





	private static final Logger LOGGER=LogManager.getLogger(WhaotStudent_Signup.class);

	@Given("Enter the whaot application URL")
	public void enter_the_whaot_application_url() {
		try {
			DriverManager.getDriver().get(Constants.APPLICATION_URL);
			DriverManager.getDriver().manage().deleteAllCookies();
			DriverManager.getDriver().manage().window().maximize();
		} catch (Exception e) {

			LOGGER.error(e); 


			Assert.fail(e.getMessage());
		}


	}

	@Given("Click the Login signup button")
	public void click_the_login_signup_button() throws Throwable {

		try {
			
			StudentSignup_Locators.getInstance().RegisterStudent();
			LOGGER.info("Click the Login signup button");
		} catch (Exception e) {
			LOGGER.error(e);

			Assert.fail(e.getMessage());
		}



	}

	@When("Choose the startlearning option")
	public void choose_the_startlearning_option() throws Throwable {
		try {

			//			StudentSignup_Locators.getInstance().ClickStartlearning();
			LOGGER.info("Choose the startlearning option");

		} catch (Exception e) {
			
			LOGGER.error(e);

			Assert.fail(e.getMessage());
		}


	}

	@When("^Enter the student Full name (.*)$")

	public void enter_the_student_full_name_testuser_automation(String studentname) throws InterruptedException {

		try {

			StudentSignup_Locators.getInstance().Enter_StudentName(studentname);
			LOGGER.info("Enter the student Full name");
		} catch (Exception e) {
			LOGGER.error(e);
			

			Assert.fail(e.getMessage());
		}



	}

	@When("^Enter the student email id (.*)$")
	public void enter_the_student_email_idautomation_tofeat_com(String studentemail) {
		try {
			StudentSignup_Locators.getInstance().EnterStudent_Email(studentemail);
			LOGGER.info("Enter the student email id ");
		} catch (Exception e) {
			
			LOGGER.error(e);

			Assert.fail(e.getMessage());
		}

	}

	@When("^Enter the student phonenumber (.*)$")
	public void Enter_the_student_phonenumber(String phonenumber) throws Throwable {
		try {

			StudentSignup_Locators.getInstance().EnterStudent_phonenumber(phonenumber);
			LOGGER.info("Enter the student phonenumber");


		} catch (Exception e) {
			LOGGER.error(e);
			

			Assert.fail(e.getMessage());
		}

	}
	
	@When("Enter the student address area pincode (.*)$")
	public void enter_the_student_address_area_pincode(String Pincode) {
		
		try {

			StudentSignup_Locators.getInstance().Enter_Student_address_pincode(Pincode);
			LOGGER.info("Enter the student address area Pincode");


		} catch (Exception e) {
			LOGGER.error(e);
			

			Assert.fail(e.getMessage());
		}
	    
	   
	}

	

	//	@When("^IF user have a coupon enter the coupon code (.*)")
	//	public void if_user_have_a_coupon_enter_the_coupon_code() {
	//
	//	}

	@When("^enter the password (.*)$")
	public void enter_the_password123456(String password) throws InterruptedException {

		try {
			String parentwindow=DriverManager.getDriver().getWindowHandle();
			




			JavascriptExecutor js1=(JavascriptExecutor)DriverManager.getDriver().switchTo().window(parentwindow);
			js1.executeScript("window.scrollBy (0,200)", "");

			StudentSignup_Locators.getInstance().EnterStudent_Password(password);
			LOGGER.info("enter the password");

		} catch (Exception e) {
			LOGGER.error(e);

			Assert.fail(e.getMessage());
		}

	}

	@When("click the Register button")
	public void click_the_register_button() {
		try {
			StudentSignup_Locators.getInstance().Register_Student();
			LOGGER.info("click the Register button");
		} catch (Exception e) {
			
			LOGGER.error(e);

			Assert.fail(e.getMessage());
		}



	}
	@When("^enter the Student signin OTP1 number (.*)$")
	public void enter_the_student_signin_otp1_number(String OTP1) {
		try {

			StudentSignup_Locators.getInstance().Verify_OTP1(OTP1);
			LOGGER.info("enter the Student signin OTP1 number");
		} catch (Exception e) {
			
			LOGGER.error(e);

			Assert.fail(e.getMessage());
		}
	}
	@When("^enter the Student signin OTP2 number (.*)$")
	public void enter_the_student_signin_otp2_number(String OTP2) {
		try {
			StudentSignup_Locators.getInstance().Verify_OTP2(OTP2);
			LOGGER.info("enter the Student signin OTP2 number");
		} catch (Exception e) {
			
			LOGGER.error(e);

			Assert.fail(e.getMessage());
		}

	}
	@When("^enter the Student signin OTP3 number (.*)$")
	public void enter_the_student_signin_otp3_number(String OTP3) {
		try {
			StudentSignup_Locators.getInstance().Verify_OTP3(OTP3);
			LOGGER.info("enter the Student signin OTP3 number");
		} catch (Exception e) {
			
			LOGGER.error(e);

			Assert.fail(e.getMessage());
		}

	}
	@When("^enter the Student signin OTP4 number (.*)$")
	public void enter_the_student_signin_otp4_number(String OTP4) {
		try {
			StudentSignup_Locators.getInstance().Verify_OTP4(OTP4);
			LOGGER.info("enter the Student signin OTP4 number");
		} catch (Exception e) {
			
			LOGGER.error(e);

			Assert.fail(e.getMessage());
		}

	}


	@When("student click to contiune button")
	public void student_click_to_contiune_button() {

		try {
			StudentSignup_Locators.getInstance().ContiunetoHomepage();
			LOGGER.info("student click to contiune button");
		} catch (Exception e) {
			
			LOGGER.error(e);

			Assert.fail(e.getMessage());
		}

	}

	@When("student choose the interest one")
	public void student_choose_the_interest_one() {


		try {

			StudentSignup_Locators.getInstance().chosseinterest1();			
			LOGGER.info("student choose the interest one");
		} catch (Exception e) {
			
			LOGGER.error(e);

			Assert.fail(e.getMessage());
		}

	}
	@When("student choose the interest two")
	public void student_choose_the_interest_two() {

		try {
			StudentSignup_Locators.getInstance().chosseinterest2();
			LOGGER.info("student choose the interest two");
		} catch (Exception e) {
			
			LOGGER.error(e);

			Assert.fail(e.getMessage());

		}

	}


	@When("student choose the interest three")
	public void student_choose_the_interest_three() {

		try {
			StudentSignup_Locators.getInstance().chosseinterest3();
			LOGGER.info("student choose the interest three");
		} catch (Exception e) {
			
			LOGGER.error(e);

			Assert.fail(e.getMessage());
		}

	}



	@When("student save the interest topics and proceed to home page")
	public void student_save_the_interest_topics_and_proceed_to_home_page() {
		
		try {
			StudentSignup_Locators.getInstance().save_and_Proceed();
			LOGGER.info("student save the interest topics and proceed to home page");
		} catch (Exception e) {
			
			LOGGER.error(e);

			Assert.fail(e.getMessage());
		}

	}
	   
	
	@Then("student successfully login the to be show the homepage")
	public void student_successfully_login_the_to_be_show_the_homepage() {
	    
		try {
			StudentSignup_Locators.getInstance().Student_Home_Page();
			LOGGER.info("student successfully login the to be show the homepage");
		} catch (Exception e) {
			LOGGER.error(e);
			

			Assert.fail(e.getMessage());
		}

	}
	

	}




