package com.techm.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.techm.pageobjects.HomePage;
import com.techm.pageobjects.Register;
import com.techm.pageobjects.SignOn;

public class TC001_Register 
{

	public static WebDriver driver;
	@Test
	public void TC001() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Deepthi\\Techm\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.navigate(driver, "http://www.newtours.demoaut.com/");
		homepage.RegisterLink(driver);
		
		Thread.sleep(5000);
		
		Register register = PageFactory.initElements(driver, Register.class);
		register.RegistrationForm(driver, "Deepthi", "Selenium", "1234567", "xyz@gmail.com", "Kukatpally", "Hyderabad", "Telangana");
		
		
		
	}
	
	
	@AfterMethod
	public void end()
	{
		driver.quit();
	}
	
}
