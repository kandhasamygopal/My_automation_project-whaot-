package com.whaot.whaot_webdriver_manager;

import static org.junit.Assert.fail;
import static org.junit.Assume.assumeThat;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.whaot.whaot_constants.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class DriverManager {

	private static final Logger LOGGER = LogManager.getLogger(DriverManager.class);

	private static WebDriver driver = null;
//	private static boolean isLocalMode = true ; // Set default mode to local

//	 public static void setLocalMode(boolean localMode) {
//	        isLocalMode = localMode;
//	 }
	@Test
	public static void launchBrowser() {
		// TODO Auto-generated method stub
		
		   

		try {
			switch (Constants.BROWSER) {
			case "chrome":
				
				
				
				ChromeOptions optionsC = new ChromeOptions();
				optionsC.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//				optionsC.addArguments("--headless=new");
				optionsC.addArguments("--window-size=1920x1080");
				optionsC.getBrowserVersion();
				optionsC.setImplicitWaitTimeout(Duration.ofSeconds(15));    
				optionsC.addArguments("--start-maximized");
				optionsC.addArguments("disable-infobars");
				optionsC.addArguments("use-fake-ui-for-media-stream");
				optionsC.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
				optionsC.addArguments("--no-sandbox");
				optionsC.addArguments("--disable-dev-shm-usage");
				optionsC.addArguments("--ignore-ssl-errors=yes");
				optionsC.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36");
//    			WebDriverManager.chromedriver().setup();
				
		
				System.setProperty("webdriver.chrome.driver", "src//test//resources//windows-driver//chromedriver.exe");
//    			System.out.println("Filepath: "+ "src" + File.separator + "test" + File.separator + "resources" + File.separator + "linuxdriver" + File.separator + "chromedriver");
//			    System.setProperty("webdriver.chrome.driver", "src" + File.separator + "test" + File.separator + "resources" + File.separator + "linuxdriver" + File.separator + "chromedriver");
				    driver = new ChromeDriver(optionsC);
                    
	 				
	 							
				LOGGER.info("Launching " + Constants.BROWSER);
				System.out.println(driver.getTitle());

				LOGGER.info("Remote Chrome Driver Started...");
				break;
			case "Firefox":
				FirefoxOptions optionsF = new FirefoxOptions();
				optionsF.addArguments("use-fake-ui-for-media-stream");
				WebDriverManager.firefoxdriver().setup();
				LOGGER.info("Launching " + Constants.BROWSER);
				driver = new FirefoxDriver(optionsF);
				break;
			case "Edge":
				EdgeOptions optionsE = new EdgeOptions();
				optionsE.addArguments("use-fake-ui-for-media-stream");
				WebDriverManager.edgedriver().setup();
				LOGGER.info("Launching " + Constants.BROWSER);
				driver = new EdgeDriver(optionsE);
				break;
			default:
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching " + Constants.BROWSER);
				driver = new ChromeDriver();
				break;
			}
			LOGGER.info("Browser launched successfully");
		} catch (Exception e) {
			LOGGER.error("Error launching browser: " + e.getMessage());
			e.printStackTrace();
		}
		
	}


	@Test
//      Close WebDriver after each feature file    
	public static void CloseBrowser() {

		try {
			if (driver != null) {
				driver.quit();

//				 driver.close();

				System.out.println("Browser is closed succesfully");

			}

			driver = null;

		} catch (Exception e) {
			LOGGER.error("Error Closing browser: " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static WebDriver getDriver() {
		return driver;
	}
}
	
