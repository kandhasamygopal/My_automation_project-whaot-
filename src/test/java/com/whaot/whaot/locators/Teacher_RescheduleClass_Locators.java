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

public class Teacher_RescheduleClass_Locators {
	
	private static final Logger LOGGER=LogManager.getFormatterLogger(Teacher_RescheduleClass_Locators.class);
	
	WebDriver driver = DriverManager.getDriver();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	private static Teacher_RescheduleClass_Locators Teacher_reschedule_Instance;
	
	private Teacher_RescheduleClass_Locators() {
		
	}
	
	public static Teacher_RescheduleClass_Locators getInstance() {
		
		if(Teacher_reschedule_Instance==null) {
			Teacher_reschedule_Instance=new Teacher_RescheduleClass_Locators();
		}
		return Teacher_reschedule_Instance;
		
	}
	
	
	String parentwindow=driver.getWindowHandle();
	
//	By locators using
	

	private By mybookings = By.xpath("//*[@id='sideMenu']/ul/li[4]/a");


	private By Viewdetailsclass = By.xpath("//*[@id='content']/div/section/div[2]/div/div//div//div//div//a");

	private By Reschedule = By.xpath("//*[@id='rightSideBar-2']/div[2]/a[1]");

	private By Reschedulebutton = By.xpath("//*[@id='reschedule-cancellation-modal']/div/div/div[3]/button");

	
	private By Reschedule_Date_slot = By.xpath("//div[@class='react-datepicker__month']//div[@class= 'react-datepicker__week']//div[@aria-disabled='false'][contains(.,'')]");

	
	private By Choose_time_slot = By.xpath("//div[@class='slot-picker-container']//div [position()]//label[contains(.,'')]");

	private By Savedatetime = By.xpath ("//*[@id='booking-payment-detail-modal']/div/div/div[1]/div/div[2]/div[2]/button");

	private By Request_Sent_Teacher_Okay = By.xpath("//*[@id='reschedule-success']/div/div/div[1]/button");

	private By Teacher_profile_click = By.xpath("//*[@id='dashboardHeader']/div/div/div/div[3]/div/ul/li[3]/div/div[1]");
	
	private By Teacher_logout = By.xpath("//*[@id='dashboardHeader']/div/div/div/div[3]/div/ul/li[3]/div/div[2]/ul/li[8]/a");


	
	
	

	public void Teacher_Click_Mybookings() throws InterruptedException {
		
 

		
		try {
             Thread.sleep(5000);
        	
        	WebElement Bookingsteacher = driver.findElement(By.xpath("//*[@id='sideMenu']/ul/li[4]/a"));
        	 Thread.sleep(1000);
        	Bookingsteacher.click();	
		} catch (Exception e) {
		
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				WebElement Bookingsteacher = driver.findElement(By.xpath("//*[@id='sideMenu']/ul/li[4]/a"));
	               wait.until(ExpectedConditions.visibilityOf(Bookingsteacher));
				
			} catch (Exception e2) {
			
				LOGGER.info("Element is not found, please check locator");
			
			}
		}
	}

	public void Teacher_click_the_Viewdetails_class() throws InterruptedException {
		
		try {
			 
			 driver.findElement(Viewdetailsclass).click();	
		} catch (Exception e) {
		
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Viewdetailsclass));
				
			} catch (Exception e2) {
			
				LOGGER.info("Element is not found, please check locator");
			
			}
		}
	}

	public void Teacher_Click_the_Reschedule() throws InterruptedException {

		
		try {
             driver.switchTo().window(parentwindow);
             	Thread.sleep(1000);
			 driver.findElement(Reschedule).click();	
		} catch (Exception e) {
		
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Reschedule));
				
			} catch (Exception e2) {
			
				LOGGER.info("Element is not found, please check locator");
			
			}
		}
	}

	public void Teacher_Click_the_Reschedulebutton() throws InterruptedException {

		
		try {
			 Thread.sleep(2000);
    	     driver.switchTo().window(parentwindow);
			 driver.findElement(Reschedulebutton).click();	
		} catch (Exception e) {
		
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Reschedulebutton));
				
			} catch (Exception e2) {
			
				LOGGER.info("Element is not found, please check locator");
			
			}
		}
	}

	public void Teacher_Change_the_Reschedule_Date_slot(String date) throws InterruptedException {
	
		try {
                  
			WebElement datepicker= driver.findElement(By.xpath("//*[@id='booking-payment-detail-modal']//div[@class='react-datepicker__month']//div[@class= 'react-datepicker__week']//div[@aria-disabled='false'][contains(text(),"+date+")]"));
			Thread.sleep(1000);
			datepicker.click();	
			
		} catch (Exception e) {
		
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				WebElement datepicker= driver.findElement(By.xpath("//*[@id='booking-payment-detail-modal']//div[@class='react-datepicker__month']//div[@class= 'react-datepicker__week']//div[@aria-disabled='false'][contains(text(),"+date+")]"));

				wait.until(ExpectedConditions.visibilityOfElementLocated((By) datepicker));
				
			} catch (Exception e2) {
			
				LOGGER.info("Element is not found, please check locator");
			
			}
		}
		
	}

	public void Teacher_Choose_the_time_slot() throws InterruptedException {
	
		
		try {
			
			 driver.findElement(Choose_time_slot).click();	
		} catch (Exception e) {
		
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Choose_time_slot));
				
			} catch (Exception e2) {
			
				LOGGER.info("Element is not found, please check locator");
			
			}
		}
	}

	public void Teacher_Save_the_datetime() {
		
		
		try {
			Thread.sleep(2000);
			 driver.findElement(Savedatetime).click();	
		} catch (Exception e) {
		
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Savedatetime));
				
			} catch (Exception e2) {
			
				LOGGER.info("Element is not found, please check locator");
			
			}
		}
	}

	public void Teacher_Request_Sent_to_the_Student_Okay() throws InterruptedException {
	
		
		try {
			Thread.sleep(2000);
			 driver.findElement(Request_Sent_Teacher_Okay).click();	
		} catch (Exception e) {
		
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Request_Sent_Teacher_Okay));
				
			} catch (Exception e2) {
			
				LOGGER.info("Element is not found, please check locator");
			
			}
		}
	}

	public void Teacher_click_profile() throws InterruptedException {
		

		try {
			driver.switchTo().window(parentwindow);
			Thread.sleep(1500);
			 driver.findElement(Teacher_profile_click).click();	
		} catch (Exception e) {
		
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_profile_click));
				
			} catch (Exception e2) {
			
				LOGGER.info("Element is not found, please check locator");
			
			}
		}
	}
		
		public void Teacher_profile_Logout() throws InterruptedException {
			

			try {
				driver.switchTo().window(parentwindow);
				Thread.sleep(1500);
				 driver.findElement(Teacher_logout).click();	
			} catch (Exception e) {
			
				LOGGER.info("Element is not found, trying into explicit wait");
				
				try {
					
					wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_logout));
					
				} catch (Exception e2) {
				
					LOGGER.info("Element is not found, please check locator");
				
				}
			}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
