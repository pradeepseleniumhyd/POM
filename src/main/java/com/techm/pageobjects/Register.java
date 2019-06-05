package com.techm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.common.util.concurrent.Service.State;

public class Register
{
	
	WebDriver driver;
	
	
	@FindBy(xpath = "//input[contains(@name,'firstName')]")
	WebElement Firstname_Textbox;
	
	@FindBy(xpath = "//input[contains(@name,'lastName')]")
	WebElement Lastname_Textbox;
	
	@FindBy(xpath = "//input[contains(@name,'phone')]")
	WebElement Phone_Textbox;
	
	@FindBy(xpath = "//input[contains(@name,'userName')]")
	WebElement Email_Textbox;
	
	@FindBy(xpath = "//input[contains(@name,'address1')]")
	WebElement Address_Textbox;
	
	@FindBy(xpath = "//input[contains(@name,'city')]")
	WebElement City_Textbox;
	
	@FindBy(xpath = "//input[contains(@name,'state')]")
	WebElement State_Textbox;
	
	
	public Register(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	
	public void RegistrationForm(WebDriver driver,String firstname, String lastname, String phone, String email, String address, String city, String state)
	{
		Firstname_Textbox.sendKeys(firstname);
		Lastname_Textbox.sendKeys(lastname);
		Phone_Textbox.sendKeys(phone);
		Email_Textbox.sendKeys(email);
		Address_Textbox.sendKeys(address);
		City_Textbox.sendKeys(city);
		State_Textbox.sendKeys(state);
	}

}
