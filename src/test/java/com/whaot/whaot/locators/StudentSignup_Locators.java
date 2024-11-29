package com.whaot.whaot.locators;

import java.time.Duration;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.whaot.hooks.DriverManager;
import com.whaot.whaot_webdriver_manager.DriverManager;

public class StudentSignup_Locators {
	
	WebDriver driver = DriverManager.getDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	
	 public static final Logger LOGGER = LogManager.getLogger(StudentSignup_Locators.class);


	private static StudentSignup_Locators Student_SignupInstance;

	private StudentSignup_Locators () {

	}

	public static StudentSignup_Locators getInstance () {

		if(Student_SignupInstance==null) {
			Student_SignupInstance= new StudentSignup_Locators();
		}
		return Student_SignupInstance;



	}
	
	Set<String> parentwindow=DriverManager.getDriver().getWindowHandles();

	String newwindow=DriverManager.getDriver().getWindowHandle();


	
	private By signup_button = By.xpath("//*[@id='signup-types-modal']/div/div/div[2]/div/div[3]/a");

	//login into whaot-web

	
	private By Newuserphonenumber = By.xpath("//*[@id='login-modal']/div/div/div[2]/form/div/div/div/input");


	//proceed button click
	
	private By ProceedButton = By.xpath("//*[@id='login-modal']/div/div/div[2]/form/button");

	//New Student Signup form


	
	private By RegisterStudent =By.xpath("(//a[@class='btnOne btn mr-0'])[1]");

	//Fill the Student signup details

	private By Enter_StudentName = By.xpath("//*[@id='signup-modal']/div/div/div[2]/div[1]/input");
	
	private By EnterStudent_Email=By.xpath("//*[@id='signup-modal']/div/div/div[2]/div[2]/input");
	

    private By EnterStudent_Phonenumber= By.xpath("//*[@id='login-modal']/div/div/div[2]/form/div/div/div/input");
    
    private By click_Proceed_Button = By.xpath("//button[@class='formBtn btn-block ']");
    
    

    private By EnterStudent_Pincode= By.xpath("//input[@id='autosearch']");
    
    private By Address_Choose= By.xpath("//input[@id='autosearch'])[1]");
    
	
	private By EnterStudent_Password= By.xpath("//*[@id='signup-modal']/div/div/div[2]/div[6]/input");

    private By EnterStudent_confirm_Password = By.xpath("//div[@id='root']//div[1]//div[2]//div[7]//input[1]");
	
	private By Register_student= By.xpath("//*[@id='signup-modal']/div/div/div[2]/div[8]/button");
			

	//	New Student send OTP
	
	private By Verify_OTP1=By.xpath("//*[@id='otpModal']/div/div/div[2]/form/div/input[1]");

	
	private By Verify_OTP2=By.xpath("//*[@id='otpModal']/div/div/div[2]/form/div/input[2]");

	
	private By Verify_OTP3= By.xpath("//*[@id='otpModal']/div/div/div[2]/form/div/input[3]");

	
	private By Verify_OTP4 = By.xpath("//*[@id='otpModal']/div/div/div[2]/form/div/input[4]");

	
	private By Submit=By.xpath("//*[@id='otpModal']/div/div/div[2]/form/button");

	//choose interest page student choose most three interest
	
	
	
	private By intertest1=By.xpath("//*[@id='root']/div/div/div/div[2]/div[1]/label/span/img");

	
	private By intertest2=By.xpath("//*[@id='root']/div/div/div/div[2]/div[2]/label/span/img");
	
	
	private By intertest3=By.xpath("//*[@id='root']/div/div/div/div[2]/div[3]/label/span/img");


	
	private By Saveandproceed=By.xpath ("//*[@id='root']/div/div/div/div[3]/button");
	
	
	private By Coupon_wallet_amount_credit=By.xpath("//*[@id='coupon-success-modal']/div/div/div[1]/div/div[2]/button");


	


	public void RegisterStudent() throws InterruptedException {
		
		try {
			driver.findElement(RegisterStudent).click();
		} catch (Exception e) {
		
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(RegisterStudent));
				
			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		
	}


	public void Enter_StudentName(String studentname) {
		
		try {
			driver.findElement(Enter_StudentName).sendKeys(studentname);
		} catch (Exception e) {
		
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Enter_StudentName));
				
			} catch (Exception e1) {
			
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}
	public void EnterStudent_Email(String studentemail) {
		
		try {
			driver.findElement(EnterStudent_Email).sendKeys(studentemail);	
		} catch (Exception e) {
			
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(EnterStudent_Email));
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}
	public void EnterStudent_phonenumber(String phonenumber) {
		
		try {
			driver.findElement(EnterStudent_Phonenumber).sendKeys(phonenumber);	
		} catch (Exception e) {
			
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(EnterStudent_Phonenumber));
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}
	
	public void Enter_Student_address_pincode(String Pincode) {
		
		try {
		      driver.findElement(EnterStudent_Pincode).sendKeys(Pincode);;
		      Thread.sleep(3000);
		      driver.findElement(Address_Choose).click();
		      	
		} catch (Exception e) {
			
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(EnterStudent_Pincode));
				wait.until(ExpectedConditions.visibilityOfElementLocated(Address_Choose));

				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}
	
	public void EnterStudent_Password(String password) {
		
		try {
			driver.findElement(EnterStudent_Password).sendKeys(password);	
		} catch (Exception e) {
			
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(EnterStudent_Password));
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}
	
public void EnterStudent_Confirm_Password(String Student_confirm_password) {
		
		try {
			driver.findElement(EnterStudent_confirm_Password).sendKeys(Student_confirm_password);	
		} catch (Exception e) {
			
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(EnterStudent_confirm_Password));
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}


	public void Register_Student() {

		
		try {
			driver.findElement(Register_student).click();	
		} catch (Exception e) {
			
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Register_student));
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		
	}
	

	public void Verify_OTP1(String OTP1) {

		
		try {
			driver.findElement(Verify_OTP1).sendKeys(OTP1);	
		} catch (Exception e) {
			
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Verify_OTP1));
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}



	public void Verify_OTP2(String OTP2) {

		
		try {
			driver.findElement(Verify_OTP2).sendKeys(OTP2);	
		} catch (Exception e) {
			
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Verify_OTP2));
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}


	public void Verify_OTP3(String OTP3) {
		try {
			driver.findElement(Verify_OTP3).sendKeys(OTP3);	
		} catch (Exception e) {
			
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Verify_OTP3));
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}


	public void Verify_OTP4(String OTP4) {
		try {
			driver.findElement(Verify_OTP4).sendKeys(OTP4);	
		} catch (Exception e) {
			
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Verify_OTP4));
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}


	public void ContiunetoHomepage(){
	
		
		
		try {
			driver.findElement(Submit).click();	
		} catch (Exception e) {
			
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Submit));
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}


	public void chosseinterest1() {
    
		try {
			driver.findElement(intertest1).click();	
		} catch (Exception e) {
			
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(intertest1));
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
     
     
	}

	public void chosseinterest2() {
		try {
			driver.findElement(intertest2).click();	
		} catch (Exception e) {
			
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(intertest2));
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public void chosseinterest3() {
		try {
			driver.findElement(intertest3).click();	
		} catch (Exception e) {
			
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(intertest3));
				
			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}
	
	public void save_and_Proceed() {
		
		try {
			driver.findElement(Saveandproceed).click();	
		} catch (Exception e) {
		
			LOGGER.info("Element is not found, trying into explicit wait");
			
			try {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(Saveandproceed));
				
			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element is not found, please check locator");
				Assert.fail("Element not picked: " + e1.getMessage());
			
			}
		}
	}
		
		public void Student_Home_Page() {
			
			

			try {
				driver.findElement(Saveandproceed).click();	
			} catch (Exception e) {
			
				LOGGER.info("Element is not found, trying into explicit wait");
				
				try {
					
					wait.until(ExpectedConditions.visibilityOfElementLocated(Saveandproceed));
					
				} catch (NoSuchElementException e1) {
				
					LOGGER.info("Element is not found, please check locator");
					Assert.fail("Element not picked: " + e1.getMessage());
				}
		}
	 
	}

//	public void Coupon_amount_credit_successamount() throws InterruptedException {
//		Thread.sleep(1000);
//		DriverManager.getDriver().switchTo().window(parentwindow);
//		Thread.sleep(2000);
//		Coupon_wallet_amount_credit.click();
//	}
		
			
}






















