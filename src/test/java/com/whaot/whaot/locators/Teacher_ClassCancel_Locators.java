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

public class Teacher_ClassCancel_Locators {
	
	WebDriver driver= DriverManager.getDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
	private static final Logger LOGGER=LogManager.getFormatterLogger(Teacher_ClassCancel_Locators.class);
	
	private static Teacher_ClassCancel_Locators TeachercancelgetInstance;
	
	private Teacher_ClassCancel_Locators() {
		
	}
	
	public static Teacher_ClassCancel_Locators getInstance() {
		if(TeachercancelgetInstance==null) {
			TeachercancelgetInstance=new Teacher_ClassCancel_Locators();
		}
		
		return TeachercancelgetInstance;
	}
	
	String parentwindow=driver.getWindowHandle();

	
	private By TeacherMyBookings = By.xpath("//*[@id='sideMenu']/ul/li[4]/a");

	
	private By Teacher_viewdetailsclass = By.xpath("//*[@id='content']/div/section/div[2]/div/div//div//div//div//a");

	
	private By Teacher_Class_canccellation = By.linkText ("Reschedule / Cancellation");

	private By Cancelview = By.xpath("//*[@id='reschedule-cancellation-modal']/div/div/div[2]/div[1]/span[2]");

	private By Teacher_Cancel_reasons = By.xpath("//input[@value='Personal Emergency']");

	private By Teacher_Click_cancel = By.xpath("//*[@id='reschedule-cancellation-modal']/div/div/div[3]/button");


	private By Teacher_Cancel_Success = By.xpath ("//*[@id='content']/div/section/div[1]/ul/li[1]/a");

	public void Teacher_Mybookings() throws InterruptedException {
		

	

			
          try {
        	 Thread.sleep(5000);
        	
        	WebElement Bookingsteacher = driver.findElement(By.xpath("//*[@id='sideMenu']/ul/li[4]/a"));
        	 Thread.sleep(1000);
        	Bookingsteacher.click();
        	
	
			
		} catch (Exception e) {
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
	        	WebElement Bookingsteacher = driver.findElement(By.xpath("//*[@id='sideMenu']/ul/li[4]/a"));
               wait.until(ExpectedConditions.visibilityOf(Bookingsteacher));
				
				
			} catch (Exception e1) {
		
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail(e.getMessage());
			}
		}
			
		}


	public void Teacher_Viewdetailsclass() throws InterruptedException {

	
		
		 try {
				
				
				driver.findElement(Teacher_viewdetailsclass).click();
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_viewdetailsclass));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
	}

	public void Teacher_Class_canccellation() throws InterruptedException {
		
		
		try {
			
			
			driver.findElement(Teacher_Class_canccellation).click();
			
		} catch (Exception e) {
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Class_canccellation));
				
				
			} catch (Exception e1) {
		
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail(e.getMessage());
			}
		}
	}

	public void Teacher_Cancel_view() throws InterruptedException {
	
		
      try {
    	  Thread.sleep(2000);
    	     driver.switchTo().window(parentwindow);
			driver.findElement(Cancelview).click();
			
		} catch (Exception e) {
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Cancelview));
				
				
			} catch (Exception e1) {
		
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail(e.getMessage());
			}
		}
	}
	
	public void Teacher_Cancel_reasons() throws InterruptedException {

		
		try {
			
   	     driver.switchTo().window(parentwindow);
			driver.findElement(Teacher_Cancel_reasons).click();
			
		} catch (Exception e) {
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Cancel_reasons));
				
				
			} catch (Exception e1) {
		
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail(e.getMessage());
			}
		}
	}

	public void getClickthecancelbutton() throws InterruptedException {
		
		try {
			Thread.sleep(1000);
	   	     driver.switchTo().window(parentwindow);
				driver.findElement(Teacher_Click_cancel).click();
				
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Click_cancel));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
							
			}

		
		try {
			Thread.sleep(2000);
			driver.findElement(Teacher_Cancel_Success).isDisplayed();
	   	     
				
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Cancel_Success));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
							
			}
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
