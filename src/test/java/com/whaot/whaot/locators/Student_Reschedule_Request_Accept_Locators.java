package com.whaot.whaot.locators;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.whaot.hooks.DriverManager;
import com.whaot.whaot_webdriver_manager.DriverManager;

public class Student_Reschedule_Request_Accept_Locators {
	
	private static final Logger LOGGER=LogManager.getFormatterLogger(Student_Reschedule_Request_Accept_Locators.class);
	
	WebDriver driver = DriverManager.getDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	private static Student_Reschedule_Request_Accept_Locators Student_request_accept_Instance;
	
	private Student_Reschedule_Request_Accept_Locators() {
		
	}
	
	public static Student_Reschedule_Request_Accept_Locators getInstance(){
		if(Student_request_accept_Instance==null) {
			Student_request_accept_Instance=new Student_Reschedule_Request_Accept_Locators();
		}
		return Student_request_accept_Instance;
		
	}
	
    String parentwindow=driver.getWindowHandle();
    
    //using By locators
	
	private By Student_Notifications_Pell_Icon = By.xpath("//*[@id='dashboardHeader']/div/div/div/div[3]/div/ul/li[1]/a/img[2]");

	private By Teacher_reschedule_Request_Notification = By.xpath("//*[@id='content']/section/div[1]/div[1]");
	
	private By Student_accept_request = By.xpath ("//*[@id='content-2']/div[2]/div[1]/div[2]/div[2]/button[2]");

	
	private By Stduent_click_Mybookings_page = By.xpath("//*[@id='sideMenu']/ul/li[4]/a");
	
	private By Reschedule_Student_Profile = By.xpath("//*[@id='dashboardHeader']/div/div/div/div[3]/div/ul/li[3]/div/div[1]/div[2]");
	
	private By Reschedule_Student_Logout = By.xpath("//*[@id='dashboardHeader']/div/div/div/div[3]/div/ul/li[3]/div/div[2]/ul/li[8]/a");


	

	public void Student_Click_the_Notifications_Pell_Icon() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		try {
			
			driver.switchTo().window(parentwindow);
			driver.findElement(Student_Notifications_Pell_Icon).click();
			
		} catch (Exception e) {
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Student_Notifications_Pell_Icon));
				
				
			} catch (Exception e1) {
		
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail(e.getMessage());
			}
		}
	}

	public void Student_see_the_teacher_reschedule_Request_Notification() throws InterruptedException {
		
		 try {
				
				driver.switchTo().window(parentwindow);
				driver.findElement(Teacher_reschedule_Request_Notification).click();
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_reschedule_Request_Notification));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
	}

	public void Student_accept_the_teacher_request() throws InterruptedException {
	
		 try {
				
				driver.switchTo().window(parentwindow);
				driver.findElement(Student_accept_request).click();
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Student_accept_request));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
	}

	public void Student_click_the_Mybookings_page() throws InterruptedException {
	
		 try {
				
				driver.switchTo().window(parentwindow);
				driver.findElement(Stduent_click_Mybookings_page).click();
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Stduent_click_Mybookings_page));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
		 
	}
		 
	 public void Reschedule_Student_click_The_Profile() throws InterruptedException {	
				driver.switchTo().window(parentwindow);
				
				try {
					Thread.sleep(1000);
					driver.findElement(Reschedule_Student_Profile).click();

				} catch (Exception e) {
				
					LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

					try {

						wait.until(ExpectedConditions.visibilityOfElementLocated(Reschedule_Student_Profile));

					} catch (Exception e1) {
						LOGGER.info("Element not found, please check the locator used");
						Assert.fail(e.getMessage());
					}
				}
				}

				
	public void Reschedule_Student_Logout_The_Profile() throws InterruptedException {	
					
					
					try {
						driver.switchTo().window(parentwindow);
						Thread.sleep(1000);
						driver.findElement(Reschedule_Student_Logout).click();


					} catch (Exception e) {
					
						LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

						try {

							wait.until(ExpectedConditions.visibilityOfElementLocated(Reschedule_Student_Logout));

						} catch (Exception e1) {
							LOGGER.info("Element not found, please check the locator used");
							Assert.fail(e.getMessage());
						}
					}


			}

	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


