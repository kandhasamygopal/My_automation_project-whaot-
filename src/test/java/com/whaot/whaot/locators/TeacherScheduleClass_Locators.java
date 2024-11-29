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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.whaot.hooks.DriverManager;
import com.whaot.whaot_webdriver_manager.DriverManager;

import io.cucumber.java.Before;

public class TeacherScheduleClass_Locators {

	private static final Logger LOGGER= LogManager.getFormatterLogger(TeacherScheduleClass_Locators.class);

	WebDriver driver = DriverManager.getDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));


	private static TeacherScheduleClass_Locators ScheduleClassgetInstance;

	private TeacherScheduleClass_Locators() {

	}

	public static TeacherScheduleClass_Locators getInstance() {

		if(ScheduleClassgetInstance==null) {
			ScheduleClassgetInstance=new TeacherScheduleClass_Locators();
		}
		return ScheduleClassgetInstance;

	}

	Actions actions = new Actions(driver);

	String newwindow= driver.getWindowHandle();


	//Teacher schedule class create using by locators

	private By Createscheduleclass=By.xpath("//a[normalize-space()='Create a class']");

	private By Live_Group_Class= By.xpath ("(//input[@id='liveGroupClass'])[1]");

	private By Class_Sub_Type= By.xpath("(//input[@id='course'])[1]");

	private By Group_class_Teacher_Subject = By.xpath("//div[@id='selectedSubject']//div[@class=' css-1hwfws3']");

	private By Class_Topics_You_Teach = By.xpath ("//div[@id='selectedTopics']//div[contains(@class,'css-1hwfws3')]");

	private By Class_Language = By.xpath("//div[@id='selectedLanguage']//div[contains(@class,'css-1hwfws3')]");

	private By Class_level = By.xpath("(//div[contains(@class,'css-1hwfws3')])[4]");

	private By Class_Duration = By.xpath("(//div[contains(@class,'css-1hwfws3')])[5]");

	private By Work_Experience = By.xpath("//input[@id='workExperience']");

	private By Teach_Experience=By.xpath("//input[@id='teachExperience']");

	private By Class_Intro_Video = By.xpath("(//input[@type='file'])[1]");

	private By Class_Cover_Image_Choose = By.xpath("(//input[@accept='image/*'])[1]");

	private By Class_Cover_Image = By.xpath("(//input[@accept='image/*'])[1]");

	private By Cover_Image_Upload = By.xpath("//button[normalize-space()='Crop & Upload']");

	private By Course_Class_From_Date = By.xpath("(//input[@placeholder='From Date'])[1]");

	private By Course_Class_To_Date = By.xpath("(//input[@placeholder='To Date'])[1]");

	private By Enter_Your_Fee = By.xpath("//*[@id='fee']");

	private By Give_Discount = By.xpath("//*[@id='discount']");

	private By Teacher_Availble_Days_SUN = By.xpath("//*[@id='root']/div/div/div/div/div[3]/div[3]/a[1]");

	private By Teacher_Availble_Days_MON = By.xpath("//*[@id='root']/div/div/div/div/div[3]/div[3]/a[2]");

	private By Teacher_Availble_Days_Tue = By.xpath("//*[@id='root']/div/div/div/div/div[3]/div[3]/a[3]");

	private By Teacher_Availble_Days_Wed = By.xpath("//*[@id='root']/div/div/div/div/div[3]/div[3]/a[4]");

	private By Teacher_Availble_Days_Thu = By.xpath("//*[@id='root']/div/div/div/div/div[3]/div[3]/a[5]");

	private By Teacher_Availble_Days_Fri = By.xpath("//*[@id='root']/div/div/div/div/div[3]/div[3]/a[6]");

	private By Teacher_Availble_Days_Sat = By.xpath("//*[@id='root']/div/div/div/div/div[3]/div[3]/a[7]");

	private static By Publishclass = By.xpath("//div[@class='col-lg-5']//a[@class='btnOne btn ml-2'][normalize-space()='Publish class']");

	private static By Activeclass = By.xpath("//*[@id='content']/section/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div/label/span");

	//Teacher create the course classes


	public void getCreatescheduleclass() {

		try {
			Thread.sleep(15000);
			driver.findElement(Createscheduleclass).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Createscheduleclass));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void getLive_Group_Class() {

		try {
			Thread.sleep(1000);
			driver.findElement(Live_Group_Class).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Live_Group_Class));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void getClass_Sub_Type() {
		try {
			Thread.sleep(1000);
			driver.findElement(Class_Sub_Type).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Class_Sub_Type));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void getGroup_class_Teacher_Subject(String subjectname) {
		try {
			Thread.sleep(1000);
			driver.findElement(Group_class_Teacher_Subject).click();

			Thread.sleep(1000);
			actions.sendKeys(subjectname).perform();

			// Use Actions to press Enter key
			Thread.sleep(1000);
			actions.sendKeys(Keys.RETURN).perform();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Group_class_Teacher_Subject));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void getClass_Topics_You_Teach(String Topics) {

		try {
			Thread.sleep(1000);
			driver.findElement(Class_Topics_You_Teach).click();

			Thread.sleep(1000);
			actions.sendKeys(Topics).perform();

			// Use Actions to press Enter key
			Thread.sleep(1000);
			actions.sendKeys(Keys.RETURN).perform();



		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Class_Topics_You_Teach));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void getClass_Language(String Languages) {

		try {
			Thread.sleep(1000);
			driver.findElement(Class_Language).click();

			Thread.sleep(1000);
			actions.sendKeys(Languages).perform();

			// Use Actions to press Enter key
			Thread.sleep(1000);
			actions.sendKeys(Keys.RETURN).perform();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Class_Language));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void getClass_level(String levels) {
		try {
			Thread.sleep(1000);
			driver.findElement(Class_level).click();

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

	public void getClass_Duration(String Duration) {

		try {
			Thread.sleep(1000);
			driver.findElement(Class_Duration).click();
			Thread.sleep(1000);
			actions.sendKeys(Duration).perform();

			// Use Actions to press Enter key
			Thread.sleep(1000);
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

	public void getWork_Experience(String work_Experience) {
		try {
			Thread.sleep(1000);

			driver.findElement(Work_Experience).sendKeys(work_Experience);

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

	public void getTeach_Experience(String TeachExperience) {

		try {
			driver.findElement(Teach_Experience).sendKeys(TeachExperience);
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

	public void getClass_Intro_Video_Click() {
		try {
			Thread.sleep(500);

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

	public void getClass_Intro_Video(String Intro_video) {
		try {
			Thread.sleep(2500);

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



	public void getClass_Cover_Image() {
		try {
			Thread.sleep(1000);
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

	public void getClass_Cover_Image_Choose(String Cover_Image) {
		try {
			Thread.sleep(1000);
			driver.findElement(Class_Cover_Image).sendKeys(Cover_Image);
		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Class_Cover_Image));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void getCover_Image_Upload() {
		try {
			Thread.sleep(1000);
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

	public void getCourse_Class_From_Date(String From_Date) {
		try {
			Thread.sleep(1000);
			driver.findElement(Course_Class_From_Date).sendKeys(From_Date);

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Course_Class_From_Date));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void getCourse_Class_To_Date(String To_Date) {
		try {
			Thread.sleep(1000);
			driver.findElement(Course_Class_To_Date).sendKeys(To_Date);

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Course_Class_To_Date));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void getEnter_Your_Fee(String fee_amount) {
		try {
			Thread.sleep(1000);
			driver.findElement(Enter_Your_Fee).sendKeys(fee_amount);

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

	public void getGive_Discount(String Discount) {
		try {
			Thread.sleep(1000);

			driver.findElement(Give_Discount).sendKeys(Discount);

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

	public void getTeacher_Availble_Days_SUN() {
		try {
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

	public void getTeacher_Availble_Days_MON() {

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

	public void getTeacher_Availble_Days_Tue() {

		try {

			driver.findElement(Teacher_Availble_Days_Tue).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Activeclass));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void getTeacher_Availble_Days_Wed() {

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

	public void getTeacher_Availble_Days_Thu() {

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

	public void getTeacher_Availble_Days_Fri() {

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

	public void getTeacher_Availble_Days_Sat() {
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

	public void getPublishclass() {

		try {
			Thread.sleep(1000);
			driver.findElement(Publishclass).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Publishclass));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}

	public void getActiveclass() {
		try {
			Thread.sleep(1000);
			driver.findElement(Activeclass).click();

		} catch (Exception e) {

			LOGGER.info("Element not found. trying to find it one more time using Explicit wait");

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Activeclass));


			} catch (NoSuchElementException e1) {

				LOGGER.info("Element not found, please check the locator used");
				Assert.fail("Element not picked: " + e1.getMessage());
			}
		}

	}















}
