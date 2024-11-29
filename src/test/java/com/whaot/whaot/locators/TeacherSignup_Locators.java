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

import com.whaot.whaot_webdriver_manager.DriverManager;

public class TeacherSignup_Locators {
	  
	private static final Logger LOGGER= LogManager.getFormatterLogger(TeacherSignup_Locators.class);
	WebDriver driver = DriverManager.getDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	private static TeacherSignup_Locators TeacherSignupInstance;
	
	private  TeacherSignup_Locators() {
		
	}
	public static TeacherSignup_Locators getinstance() {
		
		
		if(TeacherSignupInstance==null) {
		TeacherSignupInstance= new TeacherSignup_Locators();
		
	}
	return TeacherSignupInstance;
	
	}
	
    //Teacher choose the become_guru option	
	
	private By 	Become_Guru = By.xpath("(//a[@class='mr-0 bt-btn btn'])[1]");


	//Fill the teacher signup details

	
	
	private By Enter_TeacherName = By.xpath("//*[@id='signup-modal']/div/div/div[2]/div[1]/input");

	private By Enterteacher_Email= By.xpath("//*[@id='signup-modal']/div/div/div[2]/div[2]/input");

	private By Enterteacher_Number= By.xpath("//*[@id='signup-modal']/div/div/div[2]/div[3]/div/div[1]/input");
    
	
    private By EnterStudent_Password = By.xpath("//*[@id='signup-modal']/div/div/div[2]/div[4]/input");

    private By EnterStudent_Confirm_Password = By.xpath("//*[@id='signup-modal']/div/div/div[2]/div[5]/input");
    
    private By Register_Teacher =By.xpath("//button[contains(@class,'formBtn btn-block')]");


	//	New Teacher send OTP
    
	private By Verify_OTP1 = By.xpath("//*[@id='otpModal']/div/div/div[2]/form/div/input[1]");
    
	
	private By Verify_OTP2 = By.xpath("//*[@id='otpModal']/div/div/div[2]/form/div/input[2]");
	
	
	private By Verify_OTP3 = By.xpath("//*[@id='otpModal']/div/div/div[2]/form/div/input[3]");
	
	
	
	private By Verify_OTP4 = By.xpath("//*[@id='otpModal']/div/div/div[2]/form/div/input[4]");

	
	private By Submit = By.xpath("//*[@id='otpModal']/div/div/div[2]/form/button");
	
	private By teacher_profile_step = By.xpath ("//*[@id='root']/div/div/div[1]");


	public void Become_Guru() {
		
		
		 try {
				
				
				driver.findElement(Become_Guru).click();
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Become_Guru));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
	}

	public void Enter_TeacherName(String username ) {
		
		
		 try {
				
				
				driver.findElement(Enter_TeacherName).sendKeys(username);
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Enter_TeacherName));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
	}

	public void Enterteacher_Email(String useremail) {
		
		
		 try {
				
				
				driver.findElement(Enterteacher_Email).sendKeys(useremail);
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Enterteacher_Email));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
		
		
	}
	
	public void Newteacherphonenumber(String phonenumber) {
		
		
	      try {
				
				
				driver.findElement(Enterteacher_Number).sendKeys(phonenumber);
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Enterteacher_Number));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
		}

	public void getEnterStudent_Password(String password) {
		
		
		 try {
				
				
				driver.findElement(EnterStudent_Password).sendKeys(password);
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(EnterStudent_Password));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
		
	}
	
	public void Enter_Teacher_Confirm_Password(String confirm_Password) {
		
		
		 try {
				
				
				driver.findElement(EnterStudent_Confirm_Password).sendKeys(confirm_Password);
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(EnterStudent_Confirm_Password));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
		
	}

	public void Register_Teacher() {
		
		
		 try {
				
				
				driver.findElement(Register_Teacher).click();
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Register_Teacher));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
		
	}

	public void Verify_OTP1(String OTP1) {
		
		 try {
				
				
				driver.findElement(Verify_OTP1).sendKeys(OTP1);
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Verify_OTP1));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
	}

	public void Verify_OTP2(String OTP2) {
		try {
			
			
			driver.findElement(Verify_OTP2).sendKeys(OTP2);
			
		} catch (Exception e) {
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Verify_OTP2));
				
				
			} catch (Exception e1) {
		
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail(e.getMessage());
			}
		}
	}

	public void Verify_OTP3(String OTP3) {
        try {
			
			
			driver.findElement(Verify_OTP3).sendKeys(OTP3);
			
		} catch (Exception e) {
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Verify_OTP3));
				
				
			} catch (Exception e1) {
		
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail(e.getMessage());
			}
		}
	}

	public void Verify_OTP4(String OTP4) {
		 try {
				
				
				driver.findElement(Verify_OTP4).sendKeys(OTP4);
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Verify_OTP4));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
	}
	public void Submit() {
		
		try {
			
			
			driver.findElement(Submit).click();
			
		} catch (Exception e) {
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Submit));
				
				
			} catch (Exception e1) {
		
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail(e.getMessage());
			}
		}
		}
		
		public void teacher_profile_step_page() {
			
			try {
				
				Thread.sleep(2000);
				driver.findElement(teacher_profile_step).isDisplayed();
				
			} catch (Exception e) {
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(teacher_profile_step));
					
					
				} catch (Exception e1) {
			
					LOGGER.info("Element not found, please check the locator used");
					Assert.fail(e.getMessage());
				}
			}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
