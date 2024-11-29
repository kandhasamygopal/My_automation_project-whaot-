package com.whaot.StepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.whaot.whaot.locators.Teacher_Reschedule_Request_Accept_Locators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Teacher_Accept_the_StudentRequest {
	
	
	private static final Logger LOGGER=LogManager.getFormatterLogger(Teacher_Accept_the_StudentRequest.class);
	


	@Given("Teacher click the notications pell icon")
	public void teacher_click_the_notications_pell_icon() throws InterruptedException {
		try {
		
			Teacher_Reschedule_Request_Accept_Locators.getInstance().getTeacher_Notifications_Pell_Icon();
			LOGGER.info("Teacher click the notications pell icon");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
		
	    
	}


	@When("Teacher click the student reschedule request notification")
	public void teacher_click_the_student_reschedule_request_notification() {
		try {
			Teacher_Reschedule_Request_Accept_Locators.getInstance().getStudent_reschedule_Request_Notification();
			LOGGER.info("Teacher click the student reschedule request notification");
			
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	   
	}
	
	@When("Teacher accept the student reschedule class request")
	public void teacher_accept_the_student_reschedule_class_request() {
	    try {
	    	Teacher_Reschedule_Request_Accept_Locators.getInstance().getTeacher_accept_request();
	    	LOGGER.info("Teacher accept the student reschedule class request");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@Then("finally the student reschedule class approved successfully and class time to be changed.")
	public void finally_the_student_reschedule_class_approved_successfully_and_class_time_to_be_changed() {
		try {
			Teacher_Reschedule_Request_Accept_Locators.getInstance().getTeacher_click_Mybookings_page();
			LOGGER.info("finally the student reschedule class approved successfully and class time to be changed.");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	    
	}



}
