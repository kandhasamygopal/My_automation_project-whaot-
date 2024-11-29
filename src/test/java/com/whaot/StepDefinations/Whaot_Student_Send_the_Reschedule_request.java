package com.whaot.StepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.whaot.whaot.locators.Student_RescheduleClass_Locators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Whaot_Student_Send_the_Reschedule_request {

	private static final Logger LOGGER=LogManager.getFormatterLogger(Whaot_Student_Send_the_Reschedule_request.class);


	@Given("Student click the my bookings page")
	public void student_click_the_my_bookings_page() throws InterruptedException {
	
		try {
			Student_RescheduleClass_Locators.getInstance().getMybookings(); 
			LOGGER.info("Student click the my bookigs page");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}

	@Given("Click the class to view the class details")
	public void click_the_class_to_view_the_class_details() throws InterruptedException {
		
		try {
			Student_RescheduleClass_Locators.getInstance().getViewdetailsclass();
			LOGGER.info("Click the class to view the class details");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}


	}

	@Given("Click the reschedule\\/cancellation button to view")
	public void click_the_reschedule_cancellation_button_to_view() throws InterruptedException {
	
		try {
			Student_RescheduleClass_Locators.getInstance().getReschedule();
			LOGGER.info("Click the reschedule\\\\/cancellation button to view");
		} catch (Exception e) {
			LOGGER.error(e);
		}


	}

	@When("Check the class is reschedule button disabled before class started time reached")
	public void check_the_class_is_reschedule_button_disabled_before_class_started_time_reached() {
		
		try {
			LOGGER.info("Check the class is reschedule button disabled before class started time reached");

		} catch (Exception e) {
			LOGGER.error(e);
		}


	}

	@When("Click the reschedule button")
	public void click_the_reschedule_button() throws InterruptedException {
	
		try {
			LOGGER.info("Click the reschedule button");
			Student_RescheduleClass_Locators.getInstance().getReschedulebutton();

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}


	}

	@When("Student view the time slot and choose the new date and time slot {string} and {string}")
	public void student_view_the_time_slot_and_choose_the_new_date_and_time_slot_and(String date2, String string2) throws InterruptedException {
	
		try {
			Student_RescheduleClass_Locators.getInstance().getReschedule_Date_slot(date2);
			Student_RescheduleClass_Locators.getInstance().getChoose_time_slot();
			LOGGER.info("Student view the time slot and choose the new date and time slot {string} and {string}");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}


	}

	@When("Studnet pick the new time slot then reschedule request send it to the teacher")
	public void studnet_pick_the_new_time_slot_then_reschedule_request_send_it_to_the_teacher() {
		try {
			Student_RescheduleClass_Locators.getInstance().getSavedatetime();
            Student_RescheduleClass_Locators.getInstance().getRequest_Sent_Student_Okay();
            LOGGER.info("Studnet pick the new time slot then reschedule request send it to the teacher");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}

	@Then("Finally the Student logout the whaot student user account")
	public void finally_the_student_logout_the_whaot_student_user_account() {
		try {
			Student_RescheduleClass_Locators.getInstance().Reschedule_StudentRequest_click_The_Profile();
			
			LOGGER.info("Reschedule_StudentRequest_click_The_Profile");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
		try {
			Student_RescheduleClass_Locators.getInstance().Reschedule_StudentRequest_Logout_The_Profile();
			
			LOGGER.info("Reschedule_StudentRequest_Logout_The_Profile");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}


	}









}
