package com.whaot.StepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.whaot.whaot.locators.Student_ClassCancel_Locators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class WhaotStudentCancel_the_Class {


	private static final Logger LOGGER=LogManager.getFormatterLogger(WhaotStudentCancel_the_Class.class);



	@Given("student click the my bookings page")
	public void student_click_the_my_bookings_page() {
		try {
			
			Student_ClassCancel_Locators.getInstance().getMybookings();
			LOGGER.info("student click the my bookings page");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}
	
	@Given("click the class to view the class details")
	public void click_the_class_to_view_the_class_details() {
		try {
			
			Student_ClassCancel_Locators.getInstance().getViewdetailsclass();
			LOGGER.info("click the class to view the class details");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}
	@Given("click the reschedule\\/cancellation button to view")
	public void click_the_reschedule_cancellation_button_to_view() {
		try {
			
			Student_ClassCancel_Locators.getInstance().getClass_canccellation();
			LOGGER.info("click the reschedule\\\\/cancellation button to view");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}
	@When("check the class is cancalltion button disabled before calss started time reached")
	public void check_the_class_is_cancalltion_button_disabled_before_calss_started_time_reached() {
		try {
			
			Student_ClassCancel_Locators.getInstance().getCancelview();
			LOGGER.info("check the class is cancalltion button disabled before calss started time reached");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}
	@When("Finally the class cancel by the student and got refund the class paid amount")
	public void finally_the_class_cancel_by_the_student_and_got_refund_the_class_paid_amount() {
		try {
		
			Student_ClassCancel_Locators.getInstance().cancel_Reasons();
    		Student_ClassCancel_Locators.getInstance().getClickthecancelbutton();
    		LOGGER.info("Finally the class cancel by the student and got refund the class paid amount");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}


}
