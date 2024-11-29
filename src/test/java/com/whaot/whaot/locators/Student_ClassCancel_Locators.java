package com.whaot.whaot.locators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

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

public class Student_ClassCancel_Locators {
    
	WebDriver driver = DriverManager.getDriver();
	private static final Logger LOGGER= LogManager.getFormatterLogger(Student_ClassCancel_Locators.class);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	

	private static Student_ClassCancel_Locators studentcancelInstance;

	private Student_ClassCancel_Locators() {

	}

	public static Student_ClassCancel_Locators getInstance() {

		if(studentcancelInstance==null) {
			studentcancelInstance= new Student_ClassCancel_Locators();
		}
		return studentcancelInstance;

	}

	String parentwindow=DriverManager.getDriver().getWindowHandle();

	
	private By mybookings = By.xpath ("//*[@id='sideMenu']/ul/li[3]/a");

		
	private By Viewdetailsclass = By.xpath("//*[@id='content']/div/section/div[2]/div/div//div//div//div//a");

	
	private By Class_canccellation = By.linkText ("Reschedule / Cancellation");
	
	
	private By Cancelview = By.xpath("//*[@id='reschedule-cancellation-modal']/div/div/div[2]/div[1]/span[2]");
	
	private By Cancelreasons = By.xpath("//*[@id='reschedule-cancellation-modal']/div/div/div[2]/div[2]/div/div[1]/input");

	
	private By Clickthecancelbutton =By.xpath("//*[@id='reschedule-cancellation-modal']/div/div/div[3]/button");




	public void getMybookings() throws InterruptedException {
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		try {
			
			driver.switchTo().window(parentwindow);
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

	public void getClass_canccellation() throws InterruptedException {
	
        try {
        	driver.findElement(Class_canccellation).click();
			
		} catch (Exception e) {
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Class_canccellation));
				
				
			} catch (Exception e1) {
		
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail(e.getMessage());
			}
		}
	}

	public void getCancelview() throws InterruptedException {
		
		
	
       try {
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

	public void cancel_Reasons() throws InterruptedException {
	
		
     try {
    	driver.switchTo().window(parentwindow);
		driver.findElement(Cancelreasons).click();	
			
		} catch (Exception e) {
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Cancelreasons));
				
				
			} catch (Exception e1) {
		
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail(e.getMessage());
			}
		}
	}
	
	
	public void getClickthecancelbutton() throws InterruptedException {
		

      try {
    	  driver.switchTo().window(parentwindow);
    	  driver.findElement(Clickthecancelbutton).click();
			
		} catch (Exception e) {
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Clickthecancelbutton));
				
				
			} catch (Exception e1) {
		
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail(e.getMessage());
			}
		}
	}	

}
