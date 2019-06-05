package com.techm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOn
{
	
	WebDriver driver;
	
	@FindBy(xpath ="//input[contains(@name,'userName')]")
	WebElement Username_Textbox;

	@FindBy(xpath ="//input[contains(@name,'password')]")
	WebElement Password_Textbox;
	
	@FindBy(xpath ="//input[contains(@name,'login')]")
	WebElement SignIn;
	@FindBy(name ="userName")
	WebElement Username_ID;
	
	public SignOn(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void SignOn_Login(WebDriver driver,String username, String password)
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

}
