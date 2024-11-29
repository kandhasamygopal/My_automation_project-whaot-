package com.whaot.StepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.whaot.whaot.locators.Student_Reschedule_Request_Accept_Locators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Student_Accept_the_TeacherRequest {


	private static final Logger LOGGER=LogManager.getFormatterLogger(Student_Accept_the_TeacherRequest.class);


	@Given("Student click the notications pell icon")
	public void student_click_the_notications_pell_icon() {
		try {
			
			Student_Reschedule_Request_Accept_Locators.getInstance().Student_Click_the_Notifications_Pell_Icon();
			LOGGER.info("Student click the notications pell icon");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}
	@When("Student click the teacher reschedule request notification")
	public void student_click_the_teacher_reschedule_request_notification() {
		try {
			Student_Reschedule_Request_Accept_Locators.getInstance().Student_see_the_teacher_reschedule_Request_Notification();
			LOGGER.info("Student click the teacher reschedule request notification");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}


	}
	@When("Student accept the teacher reschedule class request")
	public void student_accept_the_teacher_reschedule_class_request() {
		try {
			Student_Reschedule_Request_Accept_Locators.getInstance().Student_accept_the_teacher_request();
			LOGGER.info("Student accept the teacher reschedule class request");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}


	}
	@Then("finally the teacher reschedule class approved successfully and class time to be changed.")
	public void finally_the_teacher_reschedule_class_approved_successfully_and_class_time_to_be_changed() {
		try {
			Student_Reschedule_Request_Accept_Locators.getInstance().Student_click_the_Mybookings_page();
			LOGGER.info("finally the teacher reschedule class approved successfully and class time to be changed.");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
		
		try {
			Student_Reschedule_Request_Accept_Locators.getInstance().Reschedule_Student_click_The_Profile();
			LOGGER.info("Reschedule student click the profile");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
		
		try {
			Student_Reschedule_Request_Accept_Locators.getInstance().Reschedule_Student_Logout_The_Profile();
			LOGGER.info("Reschedule student logout the profile");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}




	}


















}
