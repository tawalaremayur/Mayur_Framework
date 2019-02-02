package com.resonantiatechnologie.amazon.pom.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.resonantiatechnologie.amazon.keyword.Keyword;
import com.resonantiatechnologie.amazon.pom.base.PomBase;
import com.resonantiatechnologie.amazon.pom.pages.AmazonSignIn;
import com.resonantiatechnologie.amazon.pom.pages.OnlineShoppingSiteInIndia;
import com.resonantiatechnologie.amazon.pom.pages.ShoppingCart;
import com.resonantiatechnologie.amazon.utility.Constants;
import com.resonantiatechnologie.amazon.utility.ExcelFileReader;

public class ShoppingCartTestCase extends PomBase {
	
	AmazonSignIn signin;
	ShoppingCart shopping;
	OnlineShoppingSiteInIndia online;

	
	
	// Constructor of OnlineShoppingSiteIndiaTestCases class
	public ShoppingCartTestCase() {
		super();
	}
	
	// Open Browser
		@BeforeMethod
		public void setup() {
			openBrowser();
			Constants.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			online= new OnlineShoppingSiteInIndia();
			signin= new AmazonSignIn();
			shopping= new ShoppingCart();
			openUrl();
			online=signin.login();
			
			//maxamizeWindow();
			//excel= new ExcelFileReader();
		}
		
		@Test
		public void ShoppingCartTest() {
			//shopping = online.clickOnCartLink();
			Keyword.handleDropdown("xpath", "//select[@name='quantity']", "2");
			shopping.proceedToCheckoutLink();
			Keyword.takeScreenShot();
			//Assert.assertEquals(online.getTextOnHelloSignInYourOrdersLink(), "Hello Mayur", "TestCase Fail");	
		}
		
		
		/*@AfterMethod
		public void closeBrowser() {
			Keyword.closeBrowser();
		}
	*/

}
