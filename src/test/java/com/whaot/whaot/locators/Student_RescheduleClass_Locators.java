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

public class Student_RescheduleClass_Locators {
	
	
	private static final Logger LOGGER= LogManager.getFormatterLogger(Student_RescheduleClass_Locators.class);
	WebDriver driver= DriverManager.getDriver();
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	

	private static Student_RescheduleClass_Locators student_reschedule_Instance;

	private Student_RescheduleClass_Locators() {

	}

	public static Student_RescheduleClass_Locators getInstance(){

		if(student_reschedule_Instance==null) {
			student_reschedule_Instance= new Student_RescheduleClass_Locators();
		}

		return student_reschedule_Instance;

	}



	String parentwindow=DriverManager.getDriver().getWindowHandle();

	
	private By mybookings= By.xpath ("//*[@id='sideMenu']/ul/li[3]/a");

		
	private By Viewdetailsclass = By.xpath( "//*[@id='content']/div/section/div[2]/div/div//div//div//div//a");

	
	private By Reschedule = By.linkText ("Reschedule / Cancellation");

	
	private By Reschedulebutton = By.xpath("//*[@id='reschedule-cancellation-modal']/div/div/div[3]/button");
	
	
	private By Reschedule_Date_slot= By.xpath ( "//div[@class='react-datepicker__month']//div[@class= 'react-datepicker__week']//div[@aria-disabled='false'][contains(.,'')]");

	
	
	
	private By Choose_time_slot = By.xpath ( "//div[@class='slot-picker-container']//div [position()]//label[contains(.,'')]");
	
	
	
	private By Savedatetime = By.xpath ("//*[@id='booking-payment-detail-modal']/div/div/div[1]/div/div[2]/div[2]/button");
	
	
	private By Request_Sent_Student_Okay = By.xpath ("//*[@id='reschedule-success']/div/div/div[1]/button");
	
	
	private By Reachedule_StudentRequest_Profile = By.xpath("//*[@id='dashboardHeader']/div/div/div/div[3]/div/ul/li[3]/div/div[1]/div[2]");
	
	private By Reachedule_StudentRequest_Logout = By.xpath("//*[@id='dashboardHeader']/div/div/div/div[3]/div/ul/li[3]/div/div[2]/ul/li[8]/a");

	
	
	

	public void getMybookings() throws InterruptedException {
		
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		try {
			
			driver.switchTo().window(parentwindow);
			Thread.sleep(1000);
			driver.findElement(mybookings).click();
			
		} catch (Exception e) {
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(mybookings));
				
				
			} catch (Exception e1) {
		
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail(e.getMessage());
			}
		}
	}

	public void getViewdetailsclass() throws InterruptedException {
		
		 
		
       try {
			
			driver.switchTo().window(parentwindow);
			Thread.sleep(1000);
			driver.findElement(Viewdetailsclass).click();
			
		} catch (Exception e) {
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Viewdetailsclass));
				
				
			} catch (Exception e1) {
		
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail(e.getMessage());
			}
		}
	}

	public void getReschedule() throws InterruptedException {

		 try {
				
				driver.switchTo().window(parentwindow);
				Thread.sleep(1000);
				driver.findElement(Reschedule).click();
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Reschedule));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
		
		
	}

	public void getReschedulebutton() throws InterruptedException {
	
		 try {
				
				driver.switchTo().window(parentwindow);
				Thread.sleep(1000);
				driver.findElement(Reschedulebutton).click();
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Reschedulebutton));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
	}

	public void getReschedule_Date_slot(String date2) throws InterruptedException {
		
		try {
			
			WebElement datepicker= driver.findElement(By.xpath("//*[@id='booking-payment-detail-modal']//div[@class='react-datepicker__month']//div[@class= 'react-datepicker__week']//div[@aria-disabled='false'][contains(text(),"+date2+")]"));
			Thread.sleep(3000);
			datepicker.click();
			
			
		} catch (Exception e) {
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			
		try {
			WebElement datepicker= driver.findElement(By.xpath("//*[@id='booking-payment-detail-modal']//div[@class='react-datepicker__month']//div[@class= 'react-datepicker__week']//div[@aria-disabled='false'][contains(text(),"+date2+")]"));

				wait.until(ExpectedConditions.invisibilityOfElementLocated((By) datepicker));
				
				
			} catch (Exception e1) {
		
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail(e.getMessage());
			}
		}
		
		
		
		
	}

	public void getChoose_time_slot() throws InterruptedException {
		
		
		 try {
				
			    Thread.sleep(1000);
				driver.findElement(Choose_time_slot).click();
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Choose_time_slot));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
		
	}

	public void getSavedatetime() {
		
		 try {
				
			 Thread.sleep(1000);
				driver.findElement(Savedatetime).click();
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Savedatetime));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
		
	}

	public void getRequest_Sent_Student_Okay() throws InterruptedException {
	
		
		
		 try {
				
			 Thread.sleep(2000);
				driver.findElement(Request_Sent_Student_Okay).click();
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Request_Sent_Student_Okay));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
		
		
	}

	
		
		
   public void Reschedule_StudentRequest_click_The_Profile() throws InterruptedException {	
			driver.switchTo().window(parentwindow);
			
			try {
				Thread.sleep(3000);
				driver.findElement(Reachedule_StudentRequest_Profile).click();

			} catch (Exception e) {
			
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {

					wait.until(ExpectedConditions.visibilityOfElementLocated(Reachedule_StudentRequest_Profile));

				} catch (Exception e1) {
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
			}

			
			public void Reschedule_StudentRequest_Logout_The_Profile() throws InterruptedException {	
				
				
				try {
					driver.switchTo().window(parentwindow);
					Thread.sleep(1000);
					driver.findElement(Reachedule_StudentRequest_Logout).click();


				} catch (Exception e) {
				
					LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

					try {

						wait.until(ExpectedConditions.visibilityOfElementLocated(Reachedule_StudentRequest_Logout));

					} catch (Exception e1) {
						LOGGER.info("Element not found, please check the locator used");
						Assert.fail(e.getMessage());
					}
				}


		}
		
		
		
	}
	
	
	
	







