package com.resonantiatechnologie.amazon.pom.testcases;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.resonantiatechnologie.amazon.keyword.Keyword;
import com.resonantiatechnologie.amazon.pom.base.PomBase;
import com.resonantiatechnologie.amazon.pom.pages.AmazonSignIn;
import com.resonantiatechnologie.amazon.pom.pages.OnlineShoppingSiteInIndia;
import com.resonantiatechnologie.amazon.utility.Constants;
import com.resonantiatechnologie.amazon.utility.ExcelFileReader;


public class AmazonSignInTestCases extends PomBase {
	
	AmazonSignIn signin;
	ExcelFileReader excel;

	
	
	// Constructor of OnlineShoppingSiteIndiaTestCases class
	public AmazonSignInTestCases() {
		super();
	}
	
	// Open Browser
		@BeforeMethod
		public void setup() {
			openBrowser();
			Constants.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			signin= new AmazonSignIn();
			openUrl();
			//maxamizeWindow();
			excel= new ExcelFileReader();
		}
		
		@Test
		public void amazonSignInTest() {
			signin.login();
			//Assert.assertEquals(online.getTextOnHelloSignInYourOrdersLink(), "Hello Mayur", "TestCase Fail");	
		}
		
		
		@DataProvider(name="ExcelFile")
		public Object[][] getDataFromExcle() throws IOException {
			Object[][] obj=excel.excleFileReader();
			return obj;
		}
		@Test(dataProvider="ExcelFile")
		public void verifyLogin(String UserName, String Password) {
			signin.login(UserName, Password);
		}
		
		@AfterMethod
		public void closeBrowser() {
			Keyword.closeBrowser();
		}
}
