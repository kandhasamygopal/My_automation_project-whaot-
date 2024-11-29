package com.whaot.whaot.locators;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bouncycastle.util.test.TestFailedException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.whaot.whaot_webdriver_manager.DriverManager;

public class StudentBookingclassLocators {
	
	WebDriver driver = DriverManager.getDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	
	
	


	private static final Logger LOGGER = LogManager.getFormatterLogger(StudentBookingclassLocators.class);
	private static StudentBookingclassLocators StudentbookingInstance;

	private StudentBookingclassLocators() {

	}

	public static  StudentBookingclassLocators getInstance() {
		if(StudentbookingInstance==null) {
			StudentbookingInstance=new StudentBookingclassLocators();
		}
		return StudentbookingInstance;
	}

	String parentwindow=DriverManager.getDriver().getWindowHandle();




	
	@FindBy(xpath  = ("//div[@class='col-lg-12']//div//div//p[@class='edit-slot-button'][normalize-space()='Edit']"))
	private  WebElement Edit_thetime_pickslot;

	@FindBy(xpath= ("//iframe[@class='razorpay-checkout-frame']"))
	private  WebElement razorpaycheckoutframe;

	//using By locators element find method
	
	
	By Choose_Topic= By.xpath("//span[@class='checkmark'][normalize-space()='Music']");
	
//	By Schedule_Guru_link = By.xpath("/html[1]/body[1]/div[1]/section[1]/section[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[28]/div[1]/div[1]/div[1]/img[1]");
    
	By Automation_Guru = By.xpath("//p[normalize-space()='Automation Test Teacher']");
	
//	By schedule_class_click = By.xpath("//span[normalize-space()='I Will Teach You Automation']");

	By Book_the_class= By.xpath("//*[@id='content']/div[3]/div/div/button");

	By Click_add_new_class= By.xpath("//*[@id='content']/div[2]/div/div/div/span");

	By choosetime = By.xpath(("//div[@class='slot-picker-container']//div [position()]//label[contains(.,'')]"));

	By Savedatetime=By.xpath ("//*[@id='booking-payment-detail-modal']/div/div/div[1]/div/div[2]/div[2]/button"); 

	By ReviewBooking = By.xpath ("//*[@id='content']/div[2]/div/button");

	By Proceedtopay = By.xpath("//*[@id='review-modal']/div/div/div[2]/div/div[3]/div[2]/div[8]/button");

	By cardpayment = By.xpath("//*[@id='form-common']/div[1]/div[1]/div/div/div[2]/div/button[1]");

	By Entercardnumber = By.xpath("//*[@id='card_number']");

	By CardExpiry = By.xpath("//*[@id='card_expiry']");

	By CVVDetail = By.xpath("//*[@id='card_cvv']");

	By Pay = By.id("redesign-v15-cta");	

	By PayCardskip = By.xpath("//*[@id='overlay']/div/div/button[2]");

	By Success = By.xpath("//*[@class='success']");

	By pickslot =By.className (("edit-slot-button"));

	By Card_OTP = By.xpath("//*[@id='otpForm']/input");

	By OTP_Submit = By.xpath("//*[@id='submit-action']");
	
	By Booking_Success = By.xpath("//*[@id='booking-success-modal']/div/div/div[1]/div/div[2]/button");
	
	By Student_Profile = By.xpath("//*[@id='dashboardHeader']/div/div/div/div[3]/div/ul/li[3]/div/div[1]/div[2]");
	
	By Student_Logout = By.xpath("//*[@id='dashboardHeader']/div/div/div/div[3]/div/ul/li[3]/div/div[2]/ul/li[8]/a");

	//student click the schedule class link
	
	public void Guru_click() throws InterruptedException {
	       Thread.sleep(18000);
	       
	try {
		driver.switchTo().window(parentwindow);
		Thread.sleep(3000);
		
		driver.findElement(Choose_Topic).click();
		
		System.out.println("Choose_Topic");


	} catch (Exception e) {
		
		LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
		try {
			
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(Choose_Topic));

		} catch (NoSuchElementException e1) {
		
			LOGGER.info("Element not found, please check the locator used");
			 Assert.fail("Element not picked: " + e1.getMessage());
			
		}
	}


}
	
	
	

	public void Schedule_Guru_click() throws InterruptedException {
		      
		try {
			driver.switchTo().window(parentwindow);
//            JavascriptExecutor js4=(JavascriptExecutor)DriverManager.getDriver();
//			js4.executeScript("window.scrollBy (100,200)", "");
//			Thread.sleep(3000);
			driver.findElement(Automation_Guru).click();
			
			System.out.println("Automation_Guru_click()");


		} catch (Exception e) {
			
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {
				
				
				wait.until(ExpectedConditions.presenceOfElementLocated(Automation_Guru));

			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}


	}

	public void Scheduleclass_click() throws InterruptedException {

		try {
			
			driver.switchTo().window(parentwindow);
			System.out.println("Schedule_class_click()");
            JavascriptExecutor js4=(JavascriptExecutor)DriverManager.getDriver();
			js4.executeScript("window.scrollBy (400,1200)", "");
			Thread.sleep(3000);
//			driver.findElement(schedule_class_click).click();


		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {
                
//				wait.until(ExpectedConditions.presenceOfElementLocated(schedule_class_click));

			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());

			}
		}
 

	}

	//student visit the book class page
	public  void Book_this_class() {
		      
//		try {
			
			driver.findElement(Book_the_class).sendKeys(Keys.PAGE_DOWN.ENTER);
//			driver.findElement(Book_the_class).click();
			
//		} catch (Exception e) {	
//			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
//			try {
//				
//			wait.until(ExpectedConditions.visibilityOfElementLocated(Book_the_class));
//
//			} catch (Exception e1) {
//	
//				LOGGER.info("Element not found, please check the locator used");
//				Assert.fail(e.getMessage());
//			}
//		}		
	}

	public  void Clickaddnewclass() {
		try {			
            driver.switchTo().window(parentwindow);
			driver.findElement(Click_add_new_class).click();

		} catch (Exception e) {
			
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {

				wait.until(ExpectedConditions.visibilityOfElementLocated(Click_add_new_class));

			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}




	}

	public  void ClickPickslot() {
		try {

			driver.findElement(pickslot).click();


		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {

				wait.until(ExpectedConditions.visibilityOfElementLocated(pickslot));

			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}



	}

	public  void Choosedate(String date) throws InterruptedException {


		WebElement datepicker=driver.findElement(By.xpath("//*[@id='booking-payment-detail-modal']//div[@class='react-datepicker__month']//div[@class= 'react-datepicker__week']//div[@aria-disabled='false'][contains(text(),"+date+")]"));
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(datepicker)).click();
	}



	public void Choosetime() throws InterruptedException {
		try {
			Thread.sleep(2000);
			driver.findElement(choosetime).click();


		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {

				wait.until(ExpectedConditions.visibilityOfElementLocated(choosetime));

			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	//	public  void Secondchoosetime(String secondtime) {
	//		Secondchoosetime.sendKeys(secondtime);
	//	}

	public  void Edit_time_pickslot() {
		String modify="Teacher already has a booking. Please modify slot on Class 1";
		switch (modify) {
		case "one":

			WebElement Editslot=DriverManager.getDriver().findElement(By.xpath("//div[@class='col-lg-12']//div//div//p[@class='edit-slot-button'][normalize-space()='Edit']"));
			List<WebElement> timeslots=DriverManager.getDriver().findElements(By.xpath("//div[@class='slot-picker-container']//div [position()]//label"));

			List<WebElement> Pickslot= DriverManager.getDriver().findElements (By.xpath("//div[@class='slot-picker-container']//div [position()]"));


			if(pickslot!=Edit_thetime_pickslot) {    
				Edit_thetime_pickslot.click();
			}
			break;
		default:


			break;
		}


	}



	public  void Savedatetime() {
		try {

			driver.findElement(Savedatetime).click();


		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {

				wait.until(ExpectedConditions.visibilityOfElementLocated(Savedatetime));

			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public  void ReviewBooking() {
		try {

			driver.findElement(ReviewBooking).click();


		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {

				wait.until(ExpectedConditions.visibilityOfElementLocated(ReviewBooking));

			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public void Proceedtopay() {

		
			try {
				Set<String> newwindow=DriverManager.getDriver().getWindowHandles();
				for(String childwindow:newwindow) {
					DriverManager.getDriver().switchTo().window(childwindow);
				}
					JavascriptExecutor js3=(JavascriptExecutor)DriverManager.getDriver();
					js3.executeScript("window.scrollBy (0,1200)", "");
					Thread.sleep(1000);
				driver.findElement(Proceedtopay).click();
				


			} catch (Exception e) {
			
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
				try {

					wait.until(ExpectedConditions.visibilityOfElementLocated(Proceedtopay));

				} catch (NoSuchElementException e1) {
				
					LOGGER.info("Element not found, please check the locator used");
					 Assert.fail("Element not picked: " + e1.getMessage());
				}
			}
		}


	

//	public WebElement Razorpaycheckoutframe()  {
//		Thread.sleep(1000);
//		
//			
//		
//			WebDriverWait wait= new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(50));
//			wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id='form-common']/div[1]/div[1]/div/div/div[2]/div/button[1]")))).click();
//
//			return razorpaycheckoutframe;
//			
//	
//
//		
//	}

	public void Cardpayment() {
		

		
		try {
			WebElement frame= DriverManager.getDriver().findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
			DriverManager.getDriver().switchTo().frame(frame);

			driver.findElement(cardpayment).click();


		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {

				wait.until(ExpectedConditions.visibilityOfElementLocated(cardpayment));

			} catch (NoSuchElementException e1) {
		
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void Entercardnumber(String carddetails) {

		try {

			driver.findElement(Entercardnumber).sendKeys(carddetails);


		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {

				wait.until(ExpectedConditions.visibilityOfElementLocated(Entercardnumber));

			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void CardExpiry(String cardexpirydetail) {

		try {

			driver.findElement(CardExpiry).sendKeys(cardexpirydetail);


		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {

				wait.until(ExpectedConditions.visibilityOfElementLocated(CardExpiry));

			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void CVV_Collected(String EnterCVV) {

		try {

			driver.findElement(CVVDetail).sendKeys(EnterCVV);


		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {

				wait.until(ExpectedConditions.visibilityOfElementLocated(CVVDetail));

			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public void Pay_your_amount() {
		
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(1000);
			driver.findElement(Pay).click();


		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {

				wait.until(ExpectedConditions.visibilityOfElementLocated(Pay));

			} catch (NoSuchElementException e1) {
				
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public  void PayCardskip() throws InterruptedException {
		try {

			driver.findElement(PayCardskip).click();


		} catch (Exception e) {
			
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {

				wait.until(ExpectedConditions.visibilityOfElementLocated(PayCardskip));

			} catch (NoSuchElementException e1) {
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public  void getSuccess() throws InterruptedException {
		Thread.sleep(2000);


		Set<String> handles = DriverManager.getDriver().getWindowHandles();


		for (String newwindow : handles) {

			DriverManager.getDriver().switchTo().window(newwindow);

		}
		try {

//			driver.findElement(Success).click();
			driver.findElement(Card_OTP).sendKeys("1111");
			driver.findElement(OTP_Submit).click();


		} catch (Exception e) {
			
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");
			try {

//				wait.until(ExpectedConditions.visibilityOfElementLocated(Success));
				wait.until(ExpectedConditions.visibilityOfElementLocated(Card_OTP));
				wait.until(ExpectedConditions.visibilityOfElementLocated(OTP_Submit));

			} catch (NoSuchElementException e1) {
			
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}	
	}

	public void getOkay() throws InterruptedException {	
		try {
            driver.switchTo().window(parentwindow);
            Thread.sleep(4000);
			driver.findElement(Booking_Success).click();


		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {

				wait.until(ExpectedConditions.visibilityOfElementLocated(Booking_Success));

			} catch (NoSuchElementException e1) {
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}
	
	
	public void Student_click_The_Profile() throws InterruptedException {	
		driver.switchTo().window(parentwindow);
		
		try {
			Thread.sleep(3000);
			driver.findElement(Student_Profile).click();

		} catch (Exception e) {
		
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {

				wait.until(ExpectedConditions.visibilityOfElementLocated(Student_Profile));

			} catch (NoSuchElementException e1) {
				LOGGER.info("Element not found, please check the locator used");
				 Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
		}

		
		public void Student_Logout_The_Profile() throws InterruptedException {	
			
			
			try {
				driver.switchTo().window(parentwindow);
				Thread.sleep(1500);
				driver.findElement(Student_Logout).click();


			} catch (Exception e) {
			
				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {

					wait.until(ExpectedConditions.visibilityOfElementLocated(Student_Logout));

				} catch (NoSuchElementException e1) {
					LOGGER.info("Element not found, please check the locator used");
					 Assert.fail("Element not picked: " + e1.getMessage());
				}
			}


	}




	











}
