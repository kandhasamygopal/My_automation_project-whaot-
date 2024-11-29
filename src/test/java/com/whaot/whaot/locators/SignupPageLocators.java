package com.whaot.whaot.locators;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.whaot.whaot_webdriver_manager.DriverManager;

public class SignupPageLocators {
	
	WebDriver driver = DriverManager.getDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	private static final Logger LOGGER = LogManager.getFormatterLogger(SignupPageLocators.class);
	private static SignupPageLocators SignuppageInstance;
	
	private SignupPageLocators() {
		
	}
	
	public static SignupPageLocators getInstance() {
		
		if(SignuppageInstance==null) {
			SignuppageInstance= new SignupPageLocators();
		}
		
		return SignuppageInstance;
		
	}
	

	
	//By Locators used
	
	By  signup = By.xpath("//*[@id='dashboardHeader']/div/div/div/div[3]/div/ul/li[2]/a");
	
	By  EnterphoneNumber = By.xpath("//*[@id='login-modal']/div/div/div[2]/form/div/div/div/input");
	
	By  LetgoButton = By.xpath("//*[@id='login-modal']/div/div/div[2]/form/button");
	
	By  Verify_OTP1 = By.xpath("//*[@id='otpModal']/div/div/div[2]/form/div/input[1]");
	
	By  Verify_OTP2 = By.xpath("//*[@id='otpModal']/div/div/div[2]/form/div/input[2]");
	
	By  Verify_OTP3 = By.xpath("//*[@id='otpModal']/div/div/div[2]/form/div/input[3]");
	
	By  Verify_OTP4 = By.xpath("//*[@id='otpModal']/div/div/div[2]/form/div/input[4]");
	
	By  Submit      = By.xpath("//*[@id='otpModal']/div/div/div[2]/form/button");
	
	By  Home_page = By.xpath("//*[@id='content']/div[2]/h3");
	
	
	

	
	
	//Action steps 
	public void  ClickSignup() {
		
		try {
			
			driver.findElement(signup).click();
			
		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(signup));
				
				
			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		
		
	}

	public void EnterphoneNumber(String phonenumber) {
		try {
			driver.findElement(EnterphoneNumber).sendKeys(phonenumber);
			
		} catch (Exception e) {
			
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(EnterphoneNumber));
				
				
			} catch (Exception e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		
		
	}

	public void LetgoButton() {
		try {
			driver.findElement(LetgoButton).click();
			
		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(LetgoButton));
				
				
			} catch (Exception e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		
		
	}

	public void VerifyOTP1(String OTP1) {
		try {
			driver.findElement(Verify_OTP1).sendKeys(OTP1);
			
		} catch (Exception e) {
			
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Verify_OTP1));
				
				
			} catch (Exception e1) {
				
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		
		
	}

	public void VerifyOTP2(String OTP2) {
		try {
			driver.findElement(Verify_OTP2).sendKeys(OTP2);
			
		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Verify_OTP2));
				
				
			} catch (Exception e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		
		
	}

	public void VerifyOTP3(String OTP3) {
		try {
			driver.findElement(Verify_OTP3).sendKeys(OTP3);
			
		} catch (Exception e) {
			
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Verify_OTP3));
				
				
			} catch (Exception e1) {
				
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		
		
	}

	public void VerifyOTP4(String OTP4) {
		try {
			driver.findElement(Verify_OTP4).sendKeys(OTP4);
			
		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Verify_OTP4));
				
				
			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
			    Assert.fail("Element not Picked: " + e1.getMessage());
			}
		}
		
		
	}

	public void ContinueButtonclick() {
		try {
			driver.findElement(Submit).click();
			
		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
		
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Submit));
				
				
			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not Picked: " + e1.getMessage());
			}
		}
		
		
	}
	
	public void Home_Page() {
		
		try {
			driver.findElement(Home_page).isDisplayed();
			
		} catch (Exception e) {
			
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Home_page));
				
				
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not Picked: " + e1.getMessage());
			}

		}
		
		

	}
	




}










