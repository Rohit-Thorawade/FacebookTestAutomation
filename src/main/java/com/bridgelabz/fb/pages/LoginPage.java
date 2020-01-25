package com.bridgelabz.fb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.fb.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="u_0_b")
	WebElement loginbutton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public HomePage login(String emailaddress,String pwd ) throws InterruptedException
	{
		Thread.sleep(1000);
		email.sendKeys(emailaddress);
		Thread.sleep(1000);
		password.sendKeys(pwd);
		Thread.sleep(1000);
		loginbutton.click();
		Thread.sleep(1000);
		

		return new HomePage();
	}
	
	

}
