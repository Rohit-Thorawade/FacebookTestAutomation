package com.bridgelabz.fb.testcase;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bridgelabz.fb.base.TestBase;
import com.bridgelabz.fb.pages.HomePage;
import com.bridgelabz.fb.pages.LoginPage;
import com.bridgelabz.fb.util.TestUtil;

public class LoginPageTest extends TestBase{

	LoginPage loginpage;
	HomePage homePage;
	TestUtil testutil;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		intialization();
		loginpage = new LoginPage();
		
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();

	}
	
	@Test(dataProvider = "getTestData")
	public void loginTest(String emailAddress,String password) throws InterruptedException
	{
		homePage=loginpage.login(emailAddress,password);
	
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
}
