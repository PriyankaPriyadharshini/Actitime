package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.EnterTimeTrackPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		Reporter.log("openBrowser",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
		driver.get("https://demo.actitime.com/login.do");
		
	}
	@AfterMethod
	public void logout() {
		/*Reporter.log("logout",true);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setLogout();*/
		
		
		
	}
	
}
