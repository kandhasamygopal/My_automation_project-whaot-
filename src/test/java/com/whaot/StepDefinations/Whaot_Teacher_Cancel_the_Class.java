package com.whaot.StepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.whaot.whaot.locators.Teacher_ClassCancel_Locators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Whaot_Teacher_Cancel_the_Class {


	private static final Logger LOGGER=LogManager.getFormatterLogger(Whaot_Teacher_Cancel_the_Class.class);


	@Given("Teacher click the my bookings page")
	public void teacher_click_the_my_bookings_page() throws InterruptedException {
		
		
		try {
		    
			Teacher_ClassCancel_Locators.getInstance().Teacher_Mybookings();
			LOGGER.info("Teacher click the my bookings page");
		} catch (Exception e) {
			
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}
	@Given("Teacher click the class to view the class details")
	public void teacher_click_the_class_to_view_the_class_details() {
		try {
			
			Teacher_ClassCancel_Locators.getInstance().Teacher_Viewdetailsclass();
			LOGGER.info("Teacher click the class to view the class details");
		} catch (Exception e) {
		
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}
	@Given("Teacher click the reschedule\\/cancellation button to view")
	public void teacher_click_the_reschedule_cancellation_button_to_view() {
		try {
		
			Teacher_ClassCancel_Locators.getInstance().Teacher_Class_canccellation();
			LOGGER.info("Teacher click the reschedule\\\\/cancellation button to view");
		} catch (Exception e) {
		
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}
	@When("Teacher check the class is cancalltion button disabled before calss started time reached")
	public void teacher_check_the_class_is_cancalltion_button_disabled_before_calss_started_time_reached() {
		try {
			
			Teacher_ClassCancel_Locators.getInstance().Teacher_Cancel_view();
			LOGGER.info("Teacher check the class is cancalltion button disabled before calss started time reached");
			
		} catch (Exception e) {
			
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}  
	}
	@When("Teacher Finally the class cancel by the teacher and got penalty amount added teacher wallet")
	public void teacher_finally_the_class_cancel_by_the_teacher_and_got_penalty_amount_added_teacher_wallet() {
		try {
			
			Teacher_ClassCancel_Locators.getInstance().Teacher_Cancel_reasons();
			Teacher_ClassCancel_Locators.getInstance().getClickthecancelbutton();
			LOGGER.info("Teacher Finally the class cancel by the teacher and got penalty amount added teacher wallet");

		} catch (Exception e) {
			
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

}
