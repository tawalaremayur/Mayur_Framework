package com.resonantiatechnologie.amazon.pom.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.resonantiatechnologie.amazon.pom.base.PomBase;
import com.resonantiatechnologie.amazon.pom.pages.AmazonSignIn;
import com.resonantiatechnologie.amazon.pom.pages.OnlineShoppingSiteInIndia;
import com.resonantiatechnologie.amazon.utility.Constants;

public class OnlineShoppingSiteInIndiaTestCases extends PomBase {
	// This is a OnlineShoppingSiteInIndia object creation for calling the method of
	// that class
	OnlineShoppingSiteInIndia online;


	// Constructor of OnlineShoppingSiteIndiaTestCases class
	public OnlineShoppingSiteInIndiaTestCases() {
		super();
	}

	// Open Browser
	@BeforeTest
	public void setup() {
		openBrowser();
		maxamizeWindow();
		online= new OnlineShoppingSiteInIndia();
	}

	// open URL
	@Test
	public void OnlineShoppingSiteInIndiaTest() {
		System.out.println("Url is open");
	}

	// verify MouseHover on that particular link
	@Test
	public void verifyMouseHover() {
		System.out.println("Mouse Hover Test Pass");
		online.mouseHoverOnhelloSignInYourOrdersLink();
	

	}

//	@AfterMethod
//	public void tearDown() {
//		Constants.driver.quit();
//	}
}
