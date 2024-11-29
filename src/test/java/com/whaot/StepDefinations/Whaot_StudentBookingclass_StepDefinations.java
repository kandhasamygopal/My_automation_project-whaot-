package com.whaot.StepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.whaot.whaot.locators.StudentBookingclassLocators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Whaot_StudentBookingclass_StepDefinations {

	private static final Logger LOGGER=LogManager.getFormatterLogger(Whaot_StudentBookingclass_StepDefinations.class);
	

	


	@Given("student choose the one schedule class")
	public void student_choose_the_one_the_schedule_class() throws InterruptedException {
		
        try {
			
			StudentBookingclassLocators.getInstance().Guru_click();
			LOGGER.info("student choose the guru topics click");
			

		} catch (Exception e) {
			LOGGER.error(e);			
			Assert.fail(e.getMessage());
		}
		
		
		try {
			
			StudentBookingclassLocators.getInstance().Schedule_Guru_click();
			LOGGER.info("student choose the one schedule class");
			

		} catch (Exception e) {
			LOGGER.error(e);			
			Assert.fail(e.getMessage());
		}
		
	}

	@Given("click the schedule class link its redirect to booking class page")
	public void click_the_schedule_classs_its_redirect_to_booking_class_page() throws InterruptedException {
		
       try {
			
			StudentBookingclassLocators.getInstance().Scheduleclass_click();
			LOGGER.info("click the schedule class link its redirect to booking class page");

		} catch (Exception e) {
				LOGGER.error(e);
				Assert.fail(e.getMessage());
		}
		
		try {
			
			StudentBookingclassLocators.getInstance().Scheduleclass_click();
			LOGGER.info("click the schedule class link its redirect to booking class page");

		} catch (Exception e) {
				LOGGER.error(e);
				Assert.fail(e.getMessage());
		}
		

	}

	@Given("Student scroll down the page and click the booking class button")
	public void student_scroll_down_the_page_and_click_the_booking_class_button() throws InterruptedException {
		
			try {
				StudentBookingclassLocators.getInstance().Book_this_class();
				LOGGER.info("Student scroll down the page and click the booking class button");
				
			} catch (Exception e) {
				LOGGER.error(e);
				Assert.fail(e.getMessage());
			}
			
	}

	@Given("The schedule class page student student click the add new class slots link")
	public void the_schedule_class_page_student_student_click_the_add_new_class_slots_link() throws InterruptedException {
		try {
			
			StudentBookingclassLocators.getInstance().Clickaddnewclass();
			LOGGER.info("The schedule class page student student click the add new class slots link");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}


	}

	@Given("click the pick slot button")
	public void click_the_pick_slot_button() throws InterruptedException {

		try {
		
			StudentBookingclassLocators.getInstance().ClickPickslot();
			LOGGER.info("click the pick slot button");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}


	}

	@Given("student choose the dates {string} & time  the class slots")
	public void student_choose_the_dates_time_the_class_slots(String date) throws Throwable {
	
		try {
		
		StudentBookingclassLocators.getInstance().Choosedate(date);
		LOGGER.info("student choose the dates");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

		try {
		
			StudentBookingclassLocators.getInstance().Choosetime();
			LOGGER.info("Choose time");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}


	}

	@Given("Finally click the save the date & time")
	public void finally_click_the_save_the_date_time() throws InterruptedException {
		try {
		
			StudentBookingclassLocators.getInstance().Savedatetime();
			LOGGER.info("Finally click the save the date & time");
		} catch (Exception e) {
			LOGGER.error(e);
		}

	}

	@Then("page navigate to Review your booking page")
	public void page_navigate_to_review_your_booking_page() throws InterruptedException {
		try {
			
			StudentBookingclassLocators.getInstance().ReviewBooking();
			LOGGER.info("page navigate to Review your booking page");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}

	@Then("Click the procedd to pay")
	public void click_the_procedd_to_pay() throws Throwable {
		try {
		
			StudentBookingclassLocators.getInstance().Proceedtopay();
			LOGGER.info("Click the procedd to pay");
			
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		} 


	}

	@Then("payment should be naviagated")
	public void payment_should_be_naviagated() throws Throwable {

		try {
			StudentBookingclassLocators.getInstance().Cardpayment();
			LOGGER.info("payment should be naviagated");
			
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}

	@When("choose the card payment and enter the {string} and Expiry {string} and CVV {string}")
	public void choose_the_card_payment_and_enter_the_and_expiry_and_cvv(String string, String string2, String string3) throws InterruptedException {
		try {
			Thread.sleep(1000);
			StudentBookingclassLocators.getInstance().Entercardnumber(string);
			StudentBookingclassLocators.getInstance().CardExpiry(string2);
			StudentBookingclassLocators.getInstance().CVV_Collected(string3);
			LOGGER.info("choose the card payment and enter the {string} and Expiry {string} and CVV {string}");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}

	@Then("page naviagate payment page success or failure page")
	public void page_naviagate_payment_page_success_or_failure_page() throws InterruptedException {

		try {
			StudentBookingclassLocators.getInstance().Pay_your_amount();
			StudentBookingclassLocators.getInstance().PayCardskip();
			LOGGER.info("page naviagate payment page success or failure page");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}

	@Then("Click the success button & finally class will be booked message show")
	public void click_the_success_button_finally_class_will_be_booked_message_show() throws Throwable {

		try {
			StudentBookingclassLocators.getInstance().getSuccess();
			LOGGER.info("Click the success button & finally class will be booked message show");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
			
			
		}	    
	}

	@Then("click the booking class success message OkayButton")
	public void click_the_booking_class_success_message_okay_button() throws Throwable {
	
		try {
			StudentBookingclassLocators.getInstance().getOkay();
			LOGGER.info("click the booking class success message OkayButton");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
			
			
		}

	}

	@Then("Finally user will be see the booking class details")
	public void finally_user_will_be_see_the_booking_class_details() {
    
		try {	
    	    
		StudentBookingclassLocators.getInstance().Student_click_The_Profile();
		LOGGER.info("Finally user will be see the booking class details");
	} 
	catch (Exception e) {
		LOGGER.error(e);
		Assert.fail(e.getMessage());
		
		
	}
	}
	
	@Then("Student logout the profile")
	public void student_logout_the_profile() {
		try {	
		StudentBookingclassLocators.getInstance().Student_Logout_The_Profile();
		LOGGER.info("Student logout the profile");
	} 
	catch (Exception e) {
		LOGGER.error(e);
		Assert.fail(e.getMessage());
		
		
	}
	}

}
