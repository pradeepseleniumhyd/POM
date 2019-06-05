package com.techm.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.techm.pageobjects.HomePage;
import com.techm.pageobjects.SignOn;

public class TC001_HomePageValidation 
{

	public static WebDriver driver;
	@Test
	public void TC001() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Deepthi\\Techm\\chromedriver.exe");
		driver = new ChromeDriver();
		
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.navigate(driver, "http://www.newtours.demoaut.com/");
		Thread.sleep(5000);
		homepage.Login(driver, "Deepthi", "Selenium@123");
		Thread.sleep(5000);
		Thread.sleep(5000);
		
		SignOn signon = PageFactory.initElements(driver, SignOn.class);
		signon.SignOn_Login(driver, "Pradeep", "password");
		
		
		
	}
	
	@AfterMethod
	public void end()
	{
		driver.quit();
	}
	
	
	
}
