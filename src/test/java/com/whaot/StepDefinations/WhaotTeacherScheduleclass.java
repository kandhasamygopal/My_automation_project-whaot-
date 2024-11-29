package com.whaot.StepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.whaot.whaot.locators.TeacherScheduleClass_Locators;
import com.whaot.whaot_webdriver_manager.DriverManager;


import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WhaotTeacherScheduleclass {

	private static final Logger LOGGER=LogManager.getFormatterLogger(WhaotTeacherScheduleclass.class);


	

	@When("My classes page class create view Teacher click the create a class button")
	public void my_classes_page_class_create_view_teacher_click_the_create_a_class_button() {
		// Write code here that turns the phrase above into concrete actions
		try {
			TeacherScheduleClass_Locators.getInstance().getCreatescheduleclass();
			LOGGER.info("My classes page class create view Teacher click the create a class button");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());

		}
	}

	@When("My classes page class create view Teacher select the class type Single or Group course")
	public void my_classes_page_class_create_view_teacher_select_the_class_type_single_or_group_course() {
		// Write code here that turns the phrase above into concrete actions
		try {
			
			TeacherScheduleClass_Locators.getInstance().getClass_Sub_Type();

			LOGGER.info("My classes page class create view Teacher select the class type Single or Group");


		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());

		}
	}

	@When("^My classes page class create view Teacher select the class Subject (.*)")
	public void my_classes_page_class_create_view_teacher_select_the_class_subject_subjectname(String string) {
		// Write code here that turns the phrase above into concrete actions
		try {
			TeacherScheduleClass_Locators.getInstance().getGroup_class_Teacher_Subject(string);
			LOGGER.info("My classes page class create view Teacher select the class Subject");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());

		}
	}

	@When("^My classes page class create view Teacher select the Subject related teach Topics (.*)")
	public void my_classes_page_class_create_view_teacher_select_the_subject_related_teach_topics_topics(String string) {
		// Write code here that turns the phrase above into concrete actions
		try {
			TeacherScheduleClass_Locators.getInstance().getClass_Topics_You_Teach(string);
			LOGGER.info("My classes page class create view Teacher select the Subject related teach Topics");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());

		}
	}

	@When("^My classes page class create view Teacher select the teaching languages (.*)")
	public void my_classes_page_class_create_view_teacher_select_the_teaching_languages_languages(String string) {
		// Write code here that turns the phrase above into concrete actions
		try {
			TeacherScheduleClass_Locators.getInstance().getClass_Language(string);
			LOGGER.info("My classes page class create view Teacher select the teaching languages");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());

		}
	}

	@When("^My classes page class create view Teacher select the class level (.*)")
	public void my_classes_page_class_create_view_teacher_select_the_class_level_levels(String string) {
		// Write code here that turns the phrase above into concrete actions
		try {
			TeacherScheduleClass_Locators.getInstance().getClass_level(string);
			LOGGER.info("My classes page class create view Teacher select the class level");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());

		}
	}

	@When("^My classes page class create view Teacher select the class duration (.*)")
	public void my_classes_page_class_create_view_teacher_select_the_class_duration_duration(String string) {
		// Write code here that turns the phrase above into concrete actions
		try {
			TeacherScheduleClass_Locators.getInstance().getClass_Duration(string);

			LOGGER.info("My classes page class create view Teacher select the class duration");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());

		}
	}

	@When("My classes page class create view Teacher Enter work Experience {string}")
	public void my_classes_page_class_create_view_teacher_enter_work_experience(String string) {
		// Write code here that turns the phrase above into concrete actions
		try {
			TeacherScheduleClass_Locators.getInstance().getWork_Experience(string);
			LOGGER.info("My classes page class create view Teacher Enter work Experience");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());

		}
	}

	@When("My classes page class create view Teacher Enter Teach Experience {string}")
	public void my_classes_page_class_create_view_teacher_enter_teach_experience(String string) {
		// Write code here that turns the phrase above into concrete actions
		try {
			TeacherScheduleClass_Locators.getInstance().getTeach_Experience(string);
			LOGGER.info("My classes page class create view Teacher Enter Teach Experience");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());

		}
	}

	@When("^My classes page class create view Teacher upload the class intro video (.*)")
	public void my_classes_page_class_create_view_teacher_upload_the_class_intro_video_intro_video(String string) {
		// Write code here that turns the phrase above into concrete actions
		try {
			TeacherScheduleClass_Locators.getInstance().getClass_Intro_Video_Click();
			TeacherScheduleClass_Locators.getInstance().getClass_Intro_Video(string);
			LOGGER.info("My classes page class create view Teacher upload the class intro video");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());

		}
	}

	@When("^My classes page class create view Teacher select the class cover image (.*)")
	public void my_classes_page_class_create_view_teacher_select_the_class_cover_image_cover_image(String string) {
		// Write code here that turns the phrase above into concrete actions
		try {
			TeacherScheduleClass_Locators.getInstance().getClass_Cover_Image();
			TeacherScheduleClass_Locators.getInstance().getClass_Cover_Image_Choose(string);
			TeacherScheduleClass_Locators.getInstance().getCover_Image_Upload();
			
			LOGGER.info("My classes page class create view Teacher select the class cover image");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());

		}
	}

	@When("My classes page class create view Teacher Enter the fee amount {string}")
	public void my_classes_page_class_create_view_teacher_enter_the_fee_amount(String string) {
		// Write code here that turns the phrase above into concrete actions
		try {
			TeacherScheduleClass_Locators.getInstance().getEnter_Your_Fee(string);
			LOGGER.info("My classes page class create view Teacher Enter the fee amount");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());

		}
	}

	@When("My classes page class create view Teacher Give the Discount {string}")
	public void my_classes_page_class_create_view_teacher_give_the_discount(String string) {
		// Write code here that turns the phrase above into concrete actions
		try {
			TeacherScheduleClass_Locators.getInstance().getGive_Discount(string);
			LOGGER.info("My classes page class create view Teacher Give the Discount");
			

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());

		}
	}
	
	@When("My classes page course class create choose on from date {string}")
	public void my_classes_page_course_class_create_choose_on_from_date(String string) {
	    // Write code here that turns the phrase above into concrete actions
		try {
			TeacherScheduleClass_Locators.getInstance().getCourse_Class_From_Date(string);
			LOGGER.info("My classes page course class create choose on from date");
			

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());

		}
	   
	}
	
	@When("My classes page course class create choose on To date {string}")
	public void my_classes_page_course_class_create_choose_on_To_date(String string) {
	    // Write code here that turns the phrase above into concrete actions
		try {
			TeacherScheduleClass_Locators.getInstance().getCourse_Class_To_Date(string);
			LOGGER.info("My classes page course class create choose on To date");
			

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());

		}
	   
	}

	@When("My classes page class create view Teacher choose the teacher availability business days")
	public void my_classes_page_class_create_view_teacher_choose_the_teacher_availability_business_days() {
		// Write code here that turns the phrase above into concrete actions
		try {
			TeacherScheduleClass_Locators.getInstance().getTeacher_Availble_Days_SUN();
			TeacherScheduleClass_Locators.getInstance().getTeacher_Availble_Days_MON();
			TeacherScheduleClass_Locators.getInstance().getTeacher_Availble_Days_Tue();
			TeacherScheduleClass_Locators.getInstance().getTeacher_Availble_Days_Wed();
			TeacherScheduleClass_Locators.getInstance().getTeacher_Availble_Days_Thu();
			TeacherScheduleClass_Locators.getInstance().getTeacher_Availble_Days_Fri();
            TeacherScheduleClass_Locators.getInstance().getTeacher_Availble_Days_Sat();
			LOGGER.info("My classes page class create view Teacher choose the teacher availability business days");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());

		}
	}



	@When("Teacher finally the inactive class button click the active the class")
	public void teacher_finally_the_inactive_class_button_click_the_active_the_class() {
		try {

			TeacherScheduleClass_Locators.getInstance().getActiveclass();
			LOGGER.info("Teacher finally the inactive class button click the active the class");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}
	}

	@Then("Teacher finally class will be successfully")
	public void teacher_finally_class_will_be_successfully() {
		try {
			TeacherScheduleClass_Locators.getInstance().getPublishclass();
			LOGGER.info("Teacher finally class will be successfully");
		} catch (Exception e) {

			LOGGER.error(e);		
			Assert.fail(e.getMessage());
		}


	}









}
