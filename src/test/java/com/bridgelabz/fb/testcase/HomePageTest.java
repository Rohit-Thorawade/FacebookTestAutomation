package com.bridgelabz.fb.testcase;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.fb.base.TestBase;
import com.bridgelabz.fb.pages.HomePage;
import com.bridgelabz.fb.pages.LoginPage;

public class HomePageTest extends TestBase {

	HomePage homePage;
	LoginPage loginpage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		intialization();
		loginpage = new LoginPage();
		homePage = loginpage.login(prop.getProperty("emailaddress"), prop.getProperty("password"));
	}

	@Test
	public void uploadPhotoTest() throws InterruptedException, AWTException {
		homePage.uploadphoto();

	}

	 @AfterMethod
	public void teardown() {
		driver.quit();
	}

}
