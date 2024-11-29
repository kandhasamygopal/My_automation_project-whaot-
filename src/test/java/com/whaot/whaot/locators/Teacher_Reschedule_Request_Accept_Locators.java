package com.whaot.whaot.locators;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.whaot.hooks.DriverManager;
import com.whaot.whaot_webdriver_manager.DriverManager;

public class Teacher_Reschedule_Request_Accept_Locators {
	
	private static final Logger LOGGER = LogManager.getFormatterLogger(Teacher_Reschedule_Request_Accept_Locators.class);
	
	WebDriver driver = DriverManager.getDriver();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	
	
	private static Teacher_Reschedule_Request_Accept_Locators Teacher_request_Accept_Instance;
	
	private Teacher_Reschedule_Request_Accept_Locators() {
		
	}
	
	public static Teacher_Reschedule_Request_Accept_Locators getInstance() {
		
		if(Teacher_request_Accept_Instance==null) {
			Teacher_request_Accept_Instance=new Teacher_Reschedule_Request_Accept_Locators ();
		}
		
		return Teacher_request_Accept_Instance;
		
	}
	
	String parentwindow=driver.getWindowHandle();
	
	//By using by locators
	
	private By Teacher_Notifications_Pell_Icon = By.xpath ("//*[@id='dashboardHeader']/div/div/div/div[3]/div/ul/li[1]/a/img[2]");


	private By student_reschedule_Request_Notification = By.xpath("//*[@id='content']/section/div[1]/div[1]");


	private By Teacher_accept_request = By.xpath ("//*[@id='content-2']/div[2]/div[1]/div[2]/div[2]/button[2]");

	
	private By Teacher_click_Mybookings_page = By.xpath("//*[@id='sideMenu']/ul/li[4]/a");

	

	public void getTeacher_Notifications_Pell_Icon() throws InterruptedException {
		
		

		
		try {
			 driver.switchTo().window(parentwindow);
			 Thread.sleep(5000);
			 driver.findElement(Teacher_Notifications_Pell_Icon).click();	
		} catch (Exception e) {
		
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Notifications_Pell_Icon));
				
			} catch (Exception e2) {
			
				LOGGER.info("Element is not found, please check locator");
			
			}
		}
	}

	public void getStudent_reschedule_Request_Notification() throws InterruptedException {
		
		 
		 try {
			 Thread.sleep(1000);
			 driver.findElement(student_reschedule_Request_Notification).click();	
			
		} catch (Exception e) {
		
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(student_reschedule_Request_Notification));
				
			} catch (Exception e2) {
			
				LOGGER.info("Element is not found, please check locator");
			
			}
		}
	}

	public void getTeacher_accept_request() throws InterruptedException {
	
		
		 try {
				driver.switchTo().window(parentwindow);
				Thread.sleep(3000);
			 driver.findElement(Teacher_accept_request).click();	
		} catch (Exception e) {
		
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_accept_request));
				
			} catch (Exception e2) {
			
				LOGGER.info("Element is not found, please check locator");
			
			}
		}
	}

	public void getTeacher_click_Mybookings_page() throws InterruptedException {
		
		 try {
				driver.switchTo().window(parentwindow);
				Thread.sleep(2000);
			 driver.findElement(Teacher_click_Mybookings_page).click();	
		} catch (Exception e) {
		
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_click_Mybookings_page));
				
			} catch (Exception e2) {
			
				LOGGER.info("Element is not found, please check locator");
			
			}
		}
	}
		

}
