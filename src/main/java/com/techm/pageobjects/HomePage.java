package com.techm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	
	WebDriver driver;
	
	@FindBy(xpath ="//font[contains(text(),'User')]")
	WebElement Username;

	@FindBy(xpath ="//font[contains(text(),'Password')]")
	WebElement Password;
	
	@FindBy(xpath ="//input[contains(@name,'userName')]")
	WebElement Username_Textbox;

	@FindBy(xpath ="//input[contains(@name,'password')]")
	WebElement Password_Textbox;
	
	@FindBy(xpath ="//input[contains(@name,'login')]")
	WebElement SignIn;
	
	@FindBy(xpath ="//a[contains(text(),'REGISTER')]")
	WebElement Register;
	
	public  HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void RegisterLink(WebDriver driver)
	{
		Register.click();
	}
	
	public void Login(WebDriver driver,String username,String password)
	{
		try
		{
		Username_Textbox.sendKeys(username);
		Password_Textbox.sendKeys(password);
		SignIn.click();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void navigate(WebDriver driver,String url)
	{
		try
		{
			driver.get(url);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
