package com.whaot.whaot.locators;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import com.whaot.whaot_webdriver_manager.DriverManager;

public class TeacherProfile_Locators {

	private static final Logger LOGGER=LogManager.getFormatterLogger(TeacherProfile_Locators.class);
	WebDriver driver = DriverManager.getDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


	private static TeacherProfile_Locators TeacherProfileInstance;

	private TeacherProfile_Locators() {

	}

	public static TeacherProfile_Locators getInstance() {

		if(TeacherProfileInstance==null) {
			TeacherProfileInstance=new TeacherProfile_Locators();
		}
		return TeacherProfileInstance;


	}

	Actions actions = new Actions(driver);

	String parentwindow= driver.getWindowHandle();
	String newwindow= driver.getWindowHandle();





	private By Type_of_Class= By.xpath ("//*[@id='live1On1_0']");

	private By Class_Type= By.xpath("//*[@id='single_0']");

	private By Teacher_Subject = By.xpath("//*[@id='selectedSubject']/div/div[1]");

	private By Topics_You_Teach = By.xpath ("//*[@id='selectedTopics']/div/div[1]");

	private By Language = By.xpath("//*[@id='selectedLanguage']/div/div[1]");

	private By Class_level = By.xpath("//div[@class='col-md-3 pr-md-1']//div[contains(@class,'css-1hwfws3')]");

	private By Class_Duration = By.xpath("//*[@id='selectedDuration']/div/div[1]");

	private By Work_Experience = By.xpath("//*[@id='workExperience']");

	private By Teach_Experience=By.xpath("//*[@id='teachExperience']");

	private By Class_Intro_Video = By.xpath("(//input[@type='file'])[1]");
	
	private By Class_Cover_Image_Choose = By.xpath("(//input[@accept='image/*'])[1]");
	
	private By Class_Cover_Image = By.xpath("(//input[@accept='image/*'])[1]");
	
	private By Cover_Image_Upload = By.xpath("//button[normalize-space()='Crop & Upload']");

	private By Enter_Your_Fee = By.xpath("//*[@id='fee']");

	private By Give_Discount = By.xpath("//*[@id='discount']");

	private By Submit_PAN = By.xpath("//*[@id='root']/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[4]/div/div/div[1]");

	private By Upload_Pan_Picture = By.xpath("//*[@id='update-info-pan-user-modal']/div/div/div[2]/form/div[1]/div/div/div/div/input");

	private By Enter_Pan_Number = By.xpath("(//input[@type='text'])[10]");

	private By Pan_Submit_Admin = By.xpath("//*[@id='update-info-pan-user-modal']/div/div/div[2]/form/div[3]/button");

	private By Submit_Relevant_Proof = By.xpath ("//div[@id='selectedVerificationType']//div[contains(@class,'css-1hwfws3')]");
	
	private By Add_URL = By.xpath("//*[@id='linkUrl']");
		
	private By Others_upload_document = By.xpath ("//div[@class='uploadComp small-upload-icon bg-upload']//input[@type='file']");

	private By Proof_Document_Add_button = By.xpath("//div[@class='btn btn-theme text-white text-center py-1 px-3']");

	private By Teacher_Next_Step = By.xpath("//button[normalize-space()='Next']");

	private By Teacher_Availble_Days_SUN = By.xpath("//*[@id='root']/div/div/div[3]/div[1]/div/div[1]/a[1]");

	private By Teacher_Availble_Days_MON = By.xpath("//*[@id='root']/div/div/div[3]/div[1]/div/div[1]/a[2]");

	private By Teacher_Availble_Days_Tue = By.xpath("//*[@id='root']/div/div/div[3]/div[1]/div/div[1]/a[3]");

	private By Teacher_Availble_Days_Wed = By.xpath("//*[@id='root']/div/div/div[3]/div[1]/div/div[1]/a[4]");

	private By Teacher_Availble_Days_Thu = By.xpath("//*[@id='root']/div/div/div[3]/div[1]/div/div[1]/a[5]");

	private By Teacher_Availble_Days_Fri = By.xpath("//*[@id='root']/div/div/div[3]/div[1]/div/div[1]/a[6]");

	private By Teacher_Availble_Days_Sat = By.xpath("//*[@id='root']/div/div/div[3]/div[1]/div/div[1]/a[7]");
	
	private By Fromtime = By.xpath ("//input[@placeholder='From']" );
	
	private By Totime = By.xpath("(//input[@placeholder='To'])[1]");
	
	private By Time_Slot_Outside_Click = By.xpath("//table[@class='table table-bordered table-responsive table-sm mb-0']");
	
	private By Cilck_To_Add_Holiday = By.xpath("//span[@class='d-flex align-items-center']");
	
	private By Teacher_weekend = By.xpath("(//label[normalize-space()='Weekend'])[1]");
	
	private By Weekend_Type = By.xpath("//*[@id='weekendTypeYear']");
	
	private By Weekend_Month_Select = By.xpath("//span[@class='sd']//font//font[contains(text(),'')]");
	
	private By Teacher_Picture = By.xpath("(//input[@type='file'])[4]");
	
	private By Profile_Crop = By.xpath("//*[@id='profile-modal']/div/div/div[3]/button");

	private By Verifymyidentity = By.xpath("//button[@class='verify-btn-style px-4']");

	private By TurnONmycamara = By.xpath("//button[@class='button__Button-hkteey-0 dNKPms']");

	private By Recorderbuttonclick = By.xpath("//button[@class='record-button__Button-sc-1n5amwk-0 eTRucs']");

	private By Address_line = By.xpath("//*[@id='addressLine1']");

	private By Teacher_Pincode = By.xpath("//*[@id='autosearch']");

	private By Teacher_Preview_NextPage = By.xpath("//div[@class='col-md-12 text-right']//button[@class='btn btn-sm ml-2 btn-color-blue']");

	private By Teacher_Profile_Submit = By.xpath("//button[@class='btnOne py-1']");





	public void select_class_type() throws InterruptedException {



		try {


			Thread.sleep(2000);
			driver.findElement(Type_of_Class).click();


		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Type_of_Class));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}
	public void select_class_type_Single_or_Group(String Single) throws InterruptedException {



		try {


			Thread.sleep(2000);
			driver.findElement(Class_Type).click();


		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Class_Type));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}




	public void select_teacher_Subject(String subjectname ) throws InterruptedException {


		try {
			driver.findElement(Teacher_Subject).click();
			// Wait for the dropdown options to load

			actions.sendKeys(subjectname).perform();


			// Use Actions to press Enter key
			Thread.sleep(1000);
			actions.sendKeys(Keys.RETURN).perform();


			System.out.println("Teacher choose subject successfully.");

		} catch (Exception e) {
			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Subject));
			} catch (NoSuchElementException e1) {
				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void Teacher_Choose_Topics(String Topics) throws InterruptedException {



		try {
			Thread.sleep(2000);
			driver.findElement(Topics_You_Teach).click();

			// Wait for the dropdown options to load
			actions.sendKeys(Topics).perform();

			// Use Actions to press Enter key
			Thread.sleep(1000);
			actions.sendKeys(Keys.RETURN).perform();


		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Topics_You_Teach));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public void Teacher_Language(String Languages ) throws InterruptedException {


		try {
			Thread.sleep(3000);
			driver.findElement(Language).click();

			// Wait for the dropdown options to load
			actions.sendKeys(Languages).perform();

			// Use Actions to press Enter key
			Thread.sleep(1000);
			actions.sendKeys(Keys.RETURN).perform();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Language));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public void Teacher_Class_level(String levels ) {


		try {

			JavascriptExecutor js3=(JavascriptExecutor)DriverManager.getDriver();
			js3.executeScript("window.scrollBy (0,600)", "");
			Thread.sleep(5000);
			driver.findElement(Class_level).click();

			// Wait for the dropdown options to load
			Thread.sleep(1000);
			actions.sendKeys(levels).perform();

			// Use Actions to press Enter key
			Thread.sleep(1000);
			actions.sendKeys(Keys.RETURN).perform();


		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Class_level));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}



	public void Teacher_Class_Duration(String Duration) throws InterruptedException {

		try {
			Thread.sleep(3000);
			driver.findElement(Class_Duration).click();

			actions.sendKeys(Duration).perform();

			// Use Actions to press Enter key

			actions.sendKeys(Keys.RETURN).perform();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Class_Duration));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void Teacher_Work_Experience(String work_experience) throws InterruptedException {

		try {
			Thread.sleep(1000);
			driver.findElement(Work_Experience).click();

			actions.sendKeys(work_experience).perform();

			// Use Actions to press Enter key
			Thread.sleep(1000);
			actions.sendKeys(Keys.RETURN).perform();


		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Work_Experience));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}


	public void Teacher_Teach_Experience(String TeachExperience) throws InterruptedException {


		try {
			Thread.sleep(500);
			driver.findElement(Teach_Experience).click();
			
			actions.sendKeys(TeachExperience).perform();

			// Use Actions to press Enter key
			Thread.sleep(1000);
			actions.sendKeys(Keys.RETURN).perform();
             

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teach_Experience));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public void Teacher_Class_Intro_Video_select() throws InterruptedException {



		try {

			driver.findElement(Class_Intro_Video).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Class_Intro_Video));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}


	public void Teacher_Class_Intro_Video(String Intro_video) throws InterruptedException {



		try {


			Thread.sleep(3000);
			driver.findElement(Class_Intro_Video).sendKeys(Intro_video);

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Class_Intro_Video));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void  Teacher_Class_Cover_Image() throws InterruptedException {


		try {

			
			driver.findElement(Class_Cover_Image_Choose).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Class_Cover_Image_Choose));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}


	}
	public void Image_CropUpload(String Cover_Image) throws InterruptedException {


		try {

			Thread.sleep(3000);
			driver.findElement(Class_Cover_Image_Choose).sendKeys(Cover_Image);

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Class_Cover_Image_Choose));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}
	
	public void Image_CropUpload_Save() throws InterruptedException {


		try {

			Thread.sleep(3000);
			driver.findElement(Cover_Image_Upload).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Cover_Image_Upload));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}
	public void Teacher_Enter_Your_Fee(String fee_amount) throws InterruptedException {
		
		
		


		try {
			
			driver.findElement(Enter_Your_Fee).sendKeys(Keys.ARROW_UP);			
			Thread.sleep(4000);			
			driver.findElement(Enter_Your_Fee).click();
			Thread.sleep(3000);			
			actions.sendKeys(fee_amount).perform();

			// Use Actions to press Enter key
			Thread.sleep(1000);
			actions.sendKeys(Keys.RETURN).perform();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Enter_Your_Fee));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public void Teacher_Give_Discount(String Discount) throws InterruptedException {



		try {
			Thread.sleep(1000);
			driver.findElement(Give_Discount).click();
			Thread.sleep(500);
			actions.sendKeys(Discount).perform();
			
			// Use Actions to press Enter key
			Thread.sleep(1000);
			actions.sendKeys(Keys.RETURN).perform();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Give_Discount));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public void Teacher_Submit_PAN() throws InterruptedException {



		try {

			driver.findElement(Submit_PAN).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Submit_PAN));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public void Upload_Pan_Picture(String pan_picture) throws InterruptedException {



		try {
            Thread.sleep(500);
			driver.findElement(Upload_Pan_Picture).sendKeys(pan_picture);

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Upload_Pan_Picture));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public void Enter_Pan_Number(String pan_number) throws InterruptedException {


		try {
			Thread.sleep(1000);
			driver.findElement(Enter_Pan_Number).click();
			
    
			actions.sendKeys(pan_number).perform();
			
			// Use Actions to press Enter key
			Thread.sleep(1000);
			actions.sendKeys(Keys.RETURN).perform();

			

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Enter_Pan_Number));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public void Pan_Submit_admin() throws InterruptedException {


		try {
			Thread.sleep(500);

//			driver.findElement(Pan_Submit_Admin).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Pan_Submit_Admin));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public void Submit_Relevant_Proof() throws InterruptedException {


		try {
			Thread.sleep(1500);
//			driver.findElement(Submit_Relevant_Proof).click();
			
			
		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Submit_Relevant_Proof));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public void Teacher_Select_Others_Option(String Others_Proof) throws InterruptedException {


		try {
			
			Thread.sleep(1000);
			
			driver.findElement(Submit_Relevant_Proof).click();
			
			// Wait for the drop-down options to load
				actions.sendKeys(Others_Proof).perform();

			// Use Actions to press Enter key
				Thread.sleep(1000);
				actions.sendKeys(Keys.RETURN).perform();


		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
//				wait.until(ExpectedConditions.visibilityOfElementLocated(Submit_Relevant_Proof));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}
	public void Teacher_Add_the_URL(String URL) throws InterruptedException {


		try {
			Thread.sleep(1000);
			driver.findElement(Add_URL).sendKeys(URL);

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Add_URL));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}


	public void Teacher_Upload_Documents(String Other_Document) throws InterruptedException {



		try {
			Thread.sleep(2000);
			driver.findElement(Others_upload_document).sendKeys(Other_Document);

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Others_upload_document));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}
	}

	public void Proof_Document_Add_button() throws InterruptedException {




		try {
			Thread.sleep(1000);
			driver.findElement(Proof_Document_Add_button).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Proof_Document_Add_button));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void Teacher_Next_Step() throws InterruptedException {


		try {
		
			actions.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(3000);
			driver.findElement(Teacher_Next_Step).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Next_Step));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void Teacher_Availble_Days_SUN() throws InterruptedException {


		try {
			actions.sendKeys(Keys.PAGE_UP).perform();
			Thread.sleep(1000);

			driver.findElement(Teacher_Availble_Days_SUN).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Availble_Days_SUN));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void Teacher_Availble_Days_MON() throws InterruptedException {


		try {

			driver.findElement(Teacher_Availble_Days_MON).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Availble_Days_MON));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void Teacher_Availble_Days_Tue() throws InterruptedException {


		try {

			driver.findElement(Teacher_Availble_Days_Tue).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Availble_Days_Tue));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void Teacher_Availble_Days_Wed() throws InterruptedException {


		try {

			driver.findElement(Teacher_Availble_Days_Wed).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Availble_Days_Wed));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void Teacher_Availble_Days_Thu() throws InterruptedException {


		try {

			driver.findElement(Teacher_Availble_Days_Thu).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Availble_Days_Thu));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void Teacher_Availble_Days_Fri() throws InterruptedException {


		try {

			driver.findElement(Teacher_Availble_Days_Fri).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Availble_Days_Fri));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void Teacher_Availble_Days_Sat() throws InterruptedException {


		try {

			driver.findElement(Teacher_Availble_Days_Sat).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Availble_Days_Sat));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void getFromtime() throws InterruptedException {
		
		
		try {
			Thread.sleep(1000);
			driver.findElement(Fromtime).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Fromtime));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}
	

	public void getTimeslot1(String Time_slot1 ) throws InterruptedException {
		Thread.sleep(1000);

		Set<String> handles=DriverManager.getDriver().getWindowHandles();
		for(String childwindow:handles) {
			DriverManager.getDriver().switchTo().window(childwindow);
		}
		List<WebElement> Timeslot1=DriverManager.getDriver().findElements(By.xpath("//div[@class='rc-time-picker-panel-combobox']//div[1]//li[contains(.,'')]"));
		System.out.println("No of Timeslot1 options:" + Timeslot1.size() );
		for(int i=0; i<Timeslot1.size(); i++) {
			System.out.println(Timeslot1.get(i).getText());
			if(Timeslot1.get(i).getText().contains(Time_slot1)) {
				Timeslot1.get(i).click();
				break;
			}
		}

	} 

	public void getTimeslot2(String Time_slot2 ) throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> Timeslot2=DriverManager.getDriver().findElements(By.xpath("//div[@class='rc-time-picker-panel-combobox']//div[2]//li[contains(.,'')]"));
		System.out.println("No of Timeslot2 options:" + Timeslot2.size() );

		for(int i=0; i<Timeslot2.size(); i++) {
			System.out.println(Timeslot2.get(i).getText());
			if(Timeslot2.get(i).getText().contains(Time_slot2)) {
				Timeslot2.get(i).click();
				break;
			}
		}


	}

	public void getTimeslot_AM(String Time_am ) throws InterruptedException, AWTException {
		Thread.sleep(1000);
		List<WebElement> Timeslot_am=DriverManager.getDriver().findElements(By.xpath("//div[@class='rc-time-picker-panel-inner']//div[3]//li"));
		System.out.println("No of Timeslot3 options:" + Timeslot_am.size() );
		for(int i=0; i<Timeslot_am.size(); i++) {
			System.out.println(Timeslot_am.get(i).getText());
			if(Timeslot_am.get(i).getText().contains(Time_am)) {
				Timeslot_am.get(i).click();
				break;
			}
		}

		DriverManager.getDriver().switchTo().window(newwindow);
		driver.switchTo().defaultContent();
	}
	
  public void Time_slot1_Outside_click() throws InterruptedException {
		
		DriverManager.getDriver().switchTo().window(newwindow);
		
		try {
			Thread.sleep(1000);
			driver.findElement(Time_Slot_Outside_Click).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Time_Slot_Outside_Click));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}
	


	public void getTotime() throws InterruptedException {
		
		DriverManager.getDriver().switchTo().window(newwindow);
		
		try {
			Thread.sleep(1000);
			driver.findElement(Totime).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Totime));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}
	
	
	
	
	public void getTimeslot3(String Time_slot3) throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> Timeslot3=DriverManager.getDriver().findElements(By.xpath("//div[@class='rc-time-picker-panel-combobox']//div[1]//li[contains(.,'')]"));
		System.out.println("No of Timeslot4 options:" + Timeslot3.size() );


		for(int i=0; i<Timeslot3.size(); i++) {
			System.out.println(Timeslot3.get(i).getText());
			if(Timeslot3.get(i).getText().contains(Time_slot3)) { 
				Timeslot3.get(i).click();
				break;
			}
		}


	}

	public void getTimeslot4(String Time_slot4) throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> Timeslot4=DriverManager.getDriver().findElements(By.xpath("//div[@class='rc-time-picker-panel-combobox']//div[2]//li[contains(.,'')]"));
		System.out.println("No of Timeslot5 options:" + Timeslot4.size() );


		for(int i=0; i<Timeslot4.size(); i++) {
			System.out.println(Timeslot4.get(i).getText());
			if(Timeslot4.get(i).getText().contains(Time_slot4)) {
				Timeslot4.get(i).click();
				break;
			}
		}
	}

	public void getTimeslot_PM(String Time_pm) throws InterruptedException, AWTException {
		Thread.sleep(1000);
		List<WebElement> Timeslot_pm=DriverManager.getDriver().findElements(By.xpath("//div[@class='rc-time-picker-panel-inner']//div[3]//li"));
		System.out.println("No of Timeslot6 options:" + Timeslot_pm.size() );
		for(int i=0; i<Timeslot_pm.size(); i++) {
			System.out.println(Timeslot_pm.get(i).getText());
			if(Timeslot_pm.get(i).getText().contains(Time_pm)) {
				Timeslot_pm.get(i).click();
				break;
			}
			DriverManager.getDriver().switchTo().window(newwindow);
		}
		
	

	}
	
	 public void Time_slot2_Outside_click() throws InterruptedException {
			
			
			try {
				Thread.sleep(1000);
				driver.findElement(Time_Slot_Outside_Click).click();

			} catch (Exception e) {

				LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(Time_Slot_Outside_Click));


				} catch (NoSuchElementException e1) {

					LOGGER.info("Element not found, please check the locator used");
					Assert.fail("Element not picked: " + e1.getMessage());
				}
			}

		}


	
	public void Teacher_Select_Hoilday_Calendar() throws InterruptedException {


		try {


			driver.findElement(Cilck_To_Add_Holiday).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Cilck_To_Add_Holiday));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}
	public void Teacher_Select_Weekend() throws InterruptedException {
		
		JavascriptExecutor js6=(JavascriptExecutor)driver;
		js6.executeScript("window.scrollBy(0,300)", "");

		try {

           Thread.sleep(1000);
			driver.findElement(Teacher_weekend).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Picture));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	
	public void Teacher_Select_Weekend_Type() throws InterruptedException {


		try {

			Thread.sleep(1000);
			driver.findElement(Weekend_Type).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Weekend_Type));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}
	
	public void Teacher_Select_Holiday_Year(String year) throws InterruptedException {


		try {

			Thread.sleep(1000);
//			driver.findElement(Weekend_Month_Select).click();
			JavascriptExecutor js3=(JavascriptExecutor)DriverManager.getDriver();
			js3.executeScript("window.scrollBy (0,1200)", "");
			WebElement New_year_select = driver.findElement(By.xpath("(//span[@class='sd'][normalize-space()='2023'])[1]"));
			New_year_select.click();
			
			WebElement Next_year_select = driver.findElement(By.xpath("(//span[@class='sd'][normalize-space()='2024'])[1]"));
			Next_year_select.click();
			
		    

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Weekend_Month_Select));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void Teacher_Picture(String Profile_Picture) throws InterruptedException {


		try {

			Thread.sleep(2000);
			driver.findElement(Teacher_Picture).sendKeys(Profile_Picture);

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Picture));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}
	public void Teacher_Picture_Crop_Upload() throws InterruptedException {


		try {

			Thread.sleep(2000);
			driver.findElement(Profile_Crop).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Profile_Crop));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}
	
	
	public void Teacher_Verifymyidentity() throws InterruptedException {

		
		try {
			JavascriptExecutor js3=(JavascriptExecutor)DriverManager.getDriver();
			js3.executeScript("window.scrollBy (0,600)", "");
			Thread.sleep(2000);
			driver.findElement(Verifymyidentity).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Verifymyidentity));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void Teacher_TurnONmycamara() throws InterruptedException {


		try {
			driver.switchTo().window(parentwindow);
			Thread.sleep(400);
			driver.findElement(TurnONmycamara).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(TurnONmycamara));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}
	public void Teacher_Recorderbuttonclick() throws InterruptedException {


		try {
			
			driver.findElement(Recorderbuttonclick).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Recorderbuttonclick));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void Teacher_Address_line(String Address) throws InterruptedException {


		try {
			Thread.sleep(16000);

			driver.findElement(Address_line).click();
			driver.findElement(Address_line).sendKeys(Address);

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Address_line));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}
	public void Teacher_Pincode(String Pincode) throws InterruptedException {


		try {
           
			driver.findElement(Teacher_Pincode).click();
			Thread.sleep(1000);
			driver.findElement(Teacher_Pincode).sendKeys(Pincode);

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Pincode));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void Teacher_Preview_NextPage() throws InterruptedException {


		try {
			JavascriptExecutor js3=(JavascriptExecutor)DriverManager.getDriver();
			js3.executeScript("window.scrollBy (0,800)", "");
			Thread.sleep(3000);
			
			driver.findElement(Teacher_Preview_NextPage).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Preview_NextPage));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void Teacher_Profile_Submit() throws InterruptedException {


		try {
			JavascriptExecutor js3=(JavascriptExecutor)DriverManager.getDriver();
			js3.executeScript("window.scrollBy (0,700)", "");
			Thread.sleep(2000);
			driver.findElement(Teacher_Profile_Submit).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Teacher_Profile_Submit));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}


	public static void SelectOptionfromDropdown(List<WebElement> options , String value) throws InterruptedException, AWTException	
	{
		for(WebElement option:options)
		{
			if(option.getText().equals(value))
			{
			}
			option.click();
			break;
		}

	}


}
