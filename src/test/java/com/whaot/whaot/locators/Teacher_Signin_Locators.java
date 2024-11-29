package com.whaot.whaot.locators;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.whaot.whaot_webdriver_manager.DriverManager;

public class Teacher_Signin_Locators {
	
	private static final Logger LOGGER=LogManager.getFormatterLogger(Teacher_Signin_Locators.class);
	
	WebDriver driver = DriverManager.getDriver();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	private static Teacher_Signin_Locators Teacher_signin_instance;
	
	private Teacher_Signin_Locators() {
		
	}
	
	public static Teacher_Signin_Locators getinstance() {
		
		if(Teacher_signin_instance==null) {
			Teacher_signin_instance= new Teacher_Signin_Locators();
			
		}
		  return Teacher_signin_instance;
		
	}
	
	
	//Teacher signup using by locators
	
	
   private By Teachersignup = By.xpath("(//a[@class='btnOne btn mr-0'])[1]");
	
   private By  TeacherEnterphoneNumber = By.xpath("//*[@id='login-modal']/div/div/div[2]/form/div/div/div/input");
	
   private By  TeacherLetgoButton = By.xpath("//*[@id='login-modal']/div/div/div[2]/form/button");
	
   private By  TeacherVerify_OTP1 = By.xpath("//*[@id='otpModal']/div/div/div[2]/form/div/input[1]");
	
   private By  TeacherVerify_OTP2 = By.xpath("//*[@id='otpModal']/div/div/div[2]/form/div/input[2]");
	
   private By  TeacherVerify_OTP3 = By.xpath("//*[@id='otpModal']/div/div/div[2]/form/div/input[3]");
	
   private By  TeacherVerify_OTP4 = By.xpath("//*[@id='otpModal']/div/div/div[2]/form/div/input[4]");
	
   private By  TeacherSubmit = By.xpath("//*[@id='otpModal']/div/div/div[2]/form/button");
	
   private By  TeacherHome_page = By.xpath("//*[@id='root']/div/div/div[1]");
   
  	
	
	//Action steps 
	public void  TeacherClickSignup() {
		
		try {
			Thread.sleep(1000);
			
			driver.findElement(Teachersignup).click();
			
		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teachersignup));
				
				
			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		
		
	}

	public void TeacherEnterphoneNumber(String phonenumber) {
		try {
			driver.findElement(TeacherEnterphoneNumber).sendKeys(phonenumber);
			
		} catch (Exception e) {
			
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(TeacherEnterphoneNumber));
				
				
			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		
		
	}

	public void TeacherLetgoButton() {
		try {
			driver.findElement(TeacherLetgoButton).click();
			
		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(TeacherLetgoButton));
				
				
			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		
		
	}

	public void TeacherVerifyOTP1(String OTP1) {
		try {
			driver.findElement(TeacherVerify_OTP1).sendKeys(OTP1);
			
		} catch (Exception e) {
			
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(TeacherVerify_OTP1));
				
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		
		
	}

	public void TeacherVerifyOTP2(String OTP2) {
		try {
			driver.findElement(TeacherVerify_OTP2).sendKeys(OTP2);
			
		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(TeacherVerify_OTP2));
				
				
			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		
		
	}

	public void TeacherVerifyOTP3(String OTP3) {
		try {
			driver.findElement(TeacherVerify_OTP3).sendKeys(OTP3);
			
		} catch (Exception e) {
			
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(TeacherVerify_OTP3));
				
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		
		
	}

	public void TeacherVerifyOTP4(String OTP4) {
		try {
			driver.findElement(TeacherVerify_OTP4).sendKeys(OTP4);
			
		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(TeacherVerify_OTP4));
				
				
			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		
		
	}

	public void TeacherContinueButtonclick() {
		try {
			driver.findElement(TeacherSubmit).click();
			
		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
		
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(TeacherSubmit));
				
				
			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		
		
	}
	
	public void TeacherHome_Page() {
		
		try {
			Thread.sleep(6500);
			driver.findElement(TeacherHome_page).isDisplayed();
			
		} catch (Exception e) {
			
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(TeacherHome_page));
				
				
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}

		}
		
	}
	
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


