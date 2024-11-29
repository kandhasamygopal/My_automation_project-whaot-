package com.whaot.StepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.whaot.whaot.locators.Teacher_RescheduleClass_Locators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Whaot_Teacher_Send_the_Reschedule_request {

	private static final Logger LOGGER=LogManager.getFormatterLogger(Whaot_Teacher_Send_the_Reschedule_request.class);


   
	@Given("Teacher Click the class to view the class details")
	public void teacher_click_the_class_to_view_the_class_details() throws InterruptedException {
		
		try {
			Teacher_RescheduleClass_Locators.getInstance().Teacher_Click_Mybookings();
			LOGGER.info("Teacher Click the class to view the my bookings page");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
		
		try {
			Teacher_RescheduleClass_Locators.getInstance().Teacher_click_the_Viewdetails_class();
			LOGGER.info("Teacher Click the class to view the class details");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}
   
	@Given("Teacher Click the reschedule\\/cancellation button to view")
	public void teacher_click_the_reschedule_cancellation_button_to_view() throws InterruptedException {
		
//		try {
//			Teacher_RescheduleClass_Locators.getInstance().Teacher_click_the_Viewdetails_class();
//			LOGGER.info("Teacher Click the reschedule\\\\/cancellation button to view");
//			
//		} catch (Exception e) {
//			LOGGER.error(e);
//			Assert.fail(e.getMessage());
//		}

	}
   
	@When("Teacher Check the class is reschedule button disabled before class started time reached")
	public void teacher_check_the_class_is_reschedule_button_disabled_before_class_started_time_reached() throws InterruptedException {
		
		try {
			Teacher_RescheduleClass_Locators.getInstance().Teacher_Click_the_Reschedule();
			LOGGER.info("Teacher Check the class is reschedule button disabled before class started time reached");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}
   
	@When("Teacher Click the reschedule button")
	public void teacher_click_the_reschedule_button() throws InterruptedException {
		
		try {
			Teacher_RescheduleClass_Locators.getInstance().Teacher_Click_the_Reschedulebutton();
			LOGGER.info("Teacher Click the reschedule button");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}
  
	@When("Teacher view the time slot and choose the new date and time slot {string} and {string}")
	public void teacher_view_the_time_slot_and_choose_the_new_date_and_time_slot_and(String date, String string2) throws InterruptedException {
		
		try {
			Teacher_RescheduleClass_Locators.getInstance().Teacher_Change_the_Reschedule_Date_slot(date);
			Teacher_RescheduleClass_Locators.getInstance().Teacher_Choose_the_time_slot();
			LOGGER.info("Teacher view the time slot and choose the new date and time slot");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
			
		}

	}
   
	@When("Teacher pick the new time slot then reschedule request send it to the Student")
	public void teacher_pick_the_new_time_slot_then_reschedule_request_send_it_to_the_student() throws InterruptedException {
		
		try {
			Teacher_RescheduleClass_Locators.getInstance().Teacher_Save_the_datetime();
            Teacher_RescheduleClass_Locators.getInstance().Teacher_Request_Sent_to_the_Student_Okay(); 
            LOGGER.info("Teacher pick the new time slot then reschedule request send it to the Student");

		} catch (Exception e) {
			LOGGER.error(e);
		}

	}
  
	@Then("Finally the teacher logout the whaot teacher user account")
	public void finally_the_teacher_logout_the_whaot_teacher_user_account() throws InterruptedException {
	
		try {
			Teacher_RescheduleClass_Locators.getInstance().Teacher_click_profile();
			LOGGER.info("Finally the teacher logout the whaot teacher user account");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

		try {
			Teacher_RescheduleClass_Locators.getInstance().Teacher_profile_Logout();
			LOGGER.info("Finally the teacher logout the whaot teacher user account");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}

}
