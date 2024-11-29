package com.whaot.StepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

//import com.whaot.hooks.DriverManager;
import com.whaot.whaot.locators.TeacherSignup_Locators;
import com.whaot.whaot_constants.Constants;
import com.whaot.whaot_utilitiles.CommonUtils;
import com.whaot.whaot_webdriver_manager.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WhaotTeacherSignup {

	private static final Logger LOGGER=LogManager.getFormatterLogger(WhaotTeacherSignup.class);


	@Given("Enter the whaot application teacher URL")
	public void enter_the_whaot_application_url() {
		try {
			DriverManager.getDriver().get(Constants.APPLICATION_URL);
			DriverManager.getDriver().manage().window().maximize();
			LOGGER.info("Enter the whaot application teacher URL");
		} catch (Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
			Assert.fail(e.getMessage());
		}


	}
	
	@When("Choose the Become a guru option")
	public void choose_the_become_a_guru_option() throws InterruptedException {
		try {
		
			TeacherSignup_Locators.getinstance().Become_Guru();
			LOGGER.info("Choose the Become a guru option");
		} catch (Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
			Assert.fail(e.getMessage());
		}

	}

	@When("^Enter the Teacher Full name (.*)$")
	public void enter_the_teacher_full_name_elangoram(String teachername) throws InterruptedException {
		try {
	
			TeacherSignup_Locators.getinstance().Enter_TeacherName(teachername);
			LOGGER.info("Enter the Teacher Full name");
		} catch (Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
			Assert.fail(e.getMessage());
		}

	}
	@When("^Enter the Teacher email id (.*)$")
	public void enter_the_teacher_email_id_elanoram_tofeat_com(String teacheremail) {
		try {
			TeacherSignup_Locators.getinstance().Enterteacher_Email(teacheremail);
			LOGGER.info("Enter the Teacher email id");
		} catch (Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
			Assert.fail(e.getMessage());
		}


	}
	
	@When("^Enter the teacher phonenumber (.*)$")
	public void enter_the_teacher_phonenumber(String phonenumber) throws InterruptedException {

		try {
			
			TeacherSignup_Locators.getinstance().Newteacherphonenumber(phonenumber);
			LOGGER.info("Enter the teacher phonenumber");

		} catch (Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
			Assert.fail(e.getMessage());
		}


	}

	@When("^enter the teacher password (.*)$")
	public void enter_the_password123456(String teacherpassword) throws InterruptedException {
		try {
			TeacherSignup_Locators.getinstance().getEnterStudent_Password(teacherpassword);
			LOGGER.info("enter the teacher password");
		} catch (Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
			Assert.fail(e.getMessage());
		}


	}
	
	@When("^enter the teacher confirm password (.*)$")
	
	public void enter_the_teacher_confirm_password_confirm_password(String confirm_Password) {
		try {
			TeacherSignup_Locators.getinstance().Enter_Teacher_Confirm_Password(confirm_Password);
			LOGGER.info("enter the teacher password");
		} catch (Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
			Assert.fail(e.getMessage());
		}

	}


	
	
	@When("click the teacher Register button")
	public void click_the_teacher_register_button() throws InterruptedException {
		try {
			TeacherSignup_Locators.getinstance().Register_Teacher();
			LOGGER.info("click the teacher Register button");
		} catch (Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
			Assert.fail(e.getMessage());
		}




	}

	@Then("user successfully login the to be show the profile verification page")
	public void user_successfully_login_the_to_be_show_the_profile_verification_page() throws InterruptedException {
		try {
			TeacherSignup_Locators.getinstance().Submit();
			TeacherSignup_Locators.getinstance().teacher_profile_step_page();
			LOGGER.info("user successfully login the to be show the profile verification page");

		} catch (Exception e) {
			LOGGER.error(e);
			CommonUtils.getInstance().takeScreenshot();
			Assert.fail(e.getMessage());
		}

	}













}
