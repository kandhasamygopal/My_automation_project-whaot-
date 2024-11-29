package com.whaot.StepDefinations;

import java.awt.AWTException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.whaot.whaot.locators.TeacherProfile_Locators;
import com.whaot.whaot_webdriver_manager.DriverManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WhaotTeacherProfile {

	private static final Logger LOGGER=LogManager.getFormatterLogger(WhaotTeacherProfile.class);


	@And("Teacher select the one to one class toggle button")
	public void teacher_select_the_one_to_one_class_toggle_button() {
		try {
			TeacherProfile_Locators.getInstance().select_class_type();
			LOGGER.info("Teacher select the one to one class toggle button");


		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@And("^Teacher select the class type Single or Group Single(.*)$")
	public void teacher_select_the_class_type_single_or_group_single(String string) {

		try {
			TeacherProfile_Locators.getInstance().select_class_type_Single_or_Group(string);
			LOGGER.info("Teacher select the one to one class toggle button");


		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}

	@When("^Teacher select the class Subject (.*)$")
	public void teacher_select_the_class_subject(String String ) {
		try {
			TeacherProfile_Locators.getInstance().select_teacher_Subject(String);
			LOGGER.info("teacher_select_the_class_subject_subject_name");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("^Teacher select the Subject related teach Topics (.*)$")
	public void teacher_select_the_subject_related_teach_topics(String string) {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Choose_Topics(string);
			LOGGER.info("teacher_select_the_subject_related_teach_topics_topics");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("^Teacher select the teaching languages (.*)$")
	public void teacher_select_the_teaching_languages_languages(String string) {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Language(string);
			LOGGER.info("teacher_select_the_teaching_languages_languages");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("^Teacher select the class level (.*)$")
	public void teacher_select_the_class_level_beginner(String string) {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Class_level(string);
			LOGGER.info("teacher_select_the_class_level_beginner");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("^Teacher select the class duration (.*)$")
	public void teacher_select_the_class_duration(String string) {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Class_Duration(string);
			LOGGER.info("Teacher select the class duration");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("Teacher Enter work Experience {string}")
	public void teacher_enter_work_experience(String string) {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Work_Experience(string);
			LOGGER.info("Teacher Enter work Experience");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("Teacher Enter Teach Experience {string}")
	public void teacher_enter_teach_experience(String string) {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Teach_Experience(string);
			LOGGER.info("Teacher Enter Teach Experience");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("Teacher upload the class intro video {string}")
	public void teacher_upload_the_class_intro_video_intro_video(String string) {

		try {
			TeacherProfile_Locators.getInstance().Teacher_Class_Intro_Video_select();
			TeacherProfile_Locators.getInstance().Teacher_Class_Intro_Video(string);
			LOGGER.info("Teacher upload the class intro video");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}

	@When("Teacher select the class cover image {string}")
	public void teacher_select_the_class_cover_image(String string) {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Class_Cover_Image();
			TeacherProfile_Locators.getInstance().Image_CropUpload(string);
			TeacherProfile_Locators.getInstance().Image_CropUpload_Save();
			LOGGER.info("Teacher select the class cover image");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("Teacher Enter the fee amount {string}")
	public void teacher_enter_the_fee_amount_fee_amount(String string) {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Enter_Your_Fee(string);
			LOGGER.info("Teacher Enter the fee amount");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("Teacher Give the Discount {string}")
	public void teacher_give_the_discount_discount_amount(String string) {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Give_Discount(string);
			LOGGER.info("Teacher Give the Discount");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("Teacher click the pan submit button")
	public void teacher_click_the_pan_submit_button() {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Submit_PAN();
			LOGGER.info("Teacher click the pan submit button");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("Teacher upload the pan image front photo {string}")
	public void teacher_upload_the_pan_image_front_photo(String string) {
		try {
			TeacherProfile_Locators.getInstance().Upload_Pan_Picture(string);
			LOGGER.info("Teacher upload the pan image front photo");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("Teacher enter the pan number {string}")
	public void teacher_enter_the_pan_number(String string) {
		try {
			TeacherProfile_Locators.getInstance().Enter_Pan_Number(string);
			LOGGER.info("Teacher enter the PAN number");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("Teacher publish the pan card information")
	public void teacher_publish_the_pan_card_information() {
		try {
			TeacherProfile_Locators.getInstance().Pan_Submit_admin();
			LOGGER.info("Teacher publish the pan card information");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("Teacher select the submit relevant proof dropdown")
	public void teacher_select_the_submit_relevant_proof_dropdown() {
		try {
			TeacherProfile_Locators.getInstance().Submit_Relevant_Proof();
		LOGGER.info("Teacher publish the pan card information");

	} catch (Exception e) {
		LOGGER.error(e);
		Assert.fail(e.getMessage());
	}
	}

	@When("Teacher select the others selection {string}")
	public void teacher_select_the_others_selection_others(String string) {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Select_Others_Option(string);
		LOGGER.info("Teacher publish the pan card information");

	} catch (Exception e) {
		LOGGER.error(e);
		Assert.fail(e.getMessage());
	}
		
	}

	@When("Teacher add the profile url {string}")
	public void teacher_add_the_profile_url_url(String string) {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Add_the_URL(string);
		LOGGER.info("Teacher publish the pan card information");

	} catch (Exception e) {
		LOGGER.error(e);
		Assert.fail(e.getMessage());
	}
		
	}

	@When("Teacher upload the Others document {string}")
	public void teacher_upload_the_others_document_other_document(String string) {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Upload_Documents(string);
		LOGGER.info("Teacher publish the pan card information");

	} catch (Exception e) {
		LOGGER.error(e);
		Assert.fail(e.getMessage());
	}
	}



	@When("Finally fill add the proof of documents")
	public void finally_fill_add_the_proof_of_documents() {
		try {
			TeacherProfile_Locators.getInstance().Proof_Document_Add_button();
			LOGGER.info("Finally fill add the proof of documents");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("Finally click the Next button")
	public void finally_click_the_next_button() {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Next_Step();
			LOGGER.info("Finally click the Next button");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("choose the teacher availability business days")
	public void choose_the_teacher_availability_business_days() {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Availble_Days_SUN();
            TeacherProfile_Locators.getInstance().Teacher_Availble_Days_MON();
            TeacherProfile_Locators.getInstance().Teacher_Availble_Days_Tue();
            TeacherProfile_Locators.getInstance().Teacher_Availble_Days_Wed();
            TeacherProfile_Locators.getInstance().Teacher_Availble_Days_Thu();
            TeacherProfile_Locators.getInstance().Teacher_Availble_Days_Fri();
            TeacherProfile_Locators.getInstance().Teacher_Availble_Days_Sat();
			LOGGER.info("choose the teacher availability business days");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}

	@When("Teacher Select the timings time slots {string} and {string} and {string} and {string} and {string} and {string}")
	public void teacher_select_the_timings_time_slots (String string,String string1 ,String string3 ,String string4,String string5,String string6) {
		try {
			TeacherProfile_Locators.getInstance().getFromtime(); 	
			TeacherProfile_Locators.getInstance().getTimeslot1(string);
			TeacherProfile_Locators.getInstance().getTimeslot2(string1);
			TeacherProfile_Locators.getInstance().getTimeslot_AM(string3);
			TeacherProfile_Locators.getInstance().Time_slot1_Outside_click();
			TeacherProfile_Locators.getInstance().getTotime();
			TeacherProfile_Locators.getInstance().getTimeslot3(string4);
			TeacherProfile_Locators.getInstance().getTimeslot4(string5);
			TeacherProfile_Locators.getInstance().getTimeslot_PM(string6);
			TeacherProfile_Locators.getInstance().Time_slot2_Outside_click();

			LOGGER.info("Teacher Select the timings time slots");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}
	@When("Teacher select the Holiday cleandar {string}")
	public void teacher_select_the_holiday_cleandar(String string) {
		try {

			TeacherProfile_Locators.getInstance().Teacher_Select_Hoilday_Calendar();
            TeacherProfile_Locators.getInstance().Teacher_Select_Weekend();
            TeacherProfile_Locators.getInstance().Teacher_Select_Weekend_Type();
            TeacherProfile_Locators.getInstance().Teacher_Select_Holiday_Year(string);

			LOGGER.info("teacher_select_the_holiday_cleandar ");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	    
	}


	@When("Teacher upload the profile picture {string}")
	public void teacher_upload_the_profile_picture_profile_picture(String string) {
		try {

			TeacherProfile_Locators.getInstance().Teacher_Picture(string);
			TeacherProfile_Locators.getInstance().Teacher_Picture_Crop_Upload();
			LOGGER.info("Teacher upload the profile picture ");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("Teacher verify the video verification")
	public void teacher_verify_the_video_verification() {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Verifymyidentity();
			TeacherProfile_Locators.getInstance().Teacher_TurnONmycamara();
			TeacherProfile_Locators.getInstance().Teacher_Recorderbuttonclick();
			LOGGER.info("Teacher verify the video verification");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("Teacher enter the address line {string}")
	public void teacher_enter_the_address_line(String string) {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Address_line(string);
			LOGGER.info("Teacher enter the address line ");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("Teacher enter the pincode {string}")
	public void teacher_enter_the_pincode_pincode(String string) {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Pincode(string);
			LOGGER.info("Teacher enter the pincode");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@When("Teacher click the Preview button")
	public void teacher_click_the_preview_button() {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Preview_NextPage();
			LOGGER.info("Teacher click the Preview button");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@Then("Teacher click the final submit button and class should be for admin verification.")
	public void teacher_click_the_final_submit_button_and_class_should_be_for_admin_verification() {
		try {
			TeacherProfile_Locators.getInstance().Teacher_Profile_Submit();
			LOGGER.info("Teacher click the final submit button and class should be for admin verification.");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}



}
