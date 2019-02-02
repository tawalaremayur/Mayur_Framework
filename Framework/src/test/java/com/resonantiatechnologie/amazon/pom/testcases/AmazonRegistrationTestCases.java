package com.resonantiatechnologie.amazon.pom.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.resonantiatechnologie.amazon.keyword.Keyword;
import com.resonantiatechnologie.amazon.pom.base.PomBase;
import com.resonantiatechnologie.amazon.pom.pages.AmazonRegistration;
import com.resonantiatechnologie.amazon.pom.pages.AmazonSignIn;
import com.resonantiatechnologie.amazon.pom.pages.OnlineShoppingSiteInIndia;

public class AmazonRegistrationTestCases extends PomBase {

	AmazonRegistration registration;
    AmazonSignIn signIn;
    OnlineShoppingSiteInIndia online;

    // this is the constructor of Amazon registration page
    public AmazonRegistrationTestCases() {
        super();

    }

    @BeforeMethod
    public void setUp() {
        openBrowser();
        Keyword.waitImplicit(10, TimeUnit.SECONDS);
        Keyword.maximizeWindow();
        online = new OnlineShoppingSiteInIndia();
        signIn = new AmazonSignIn();
        registration = new AmazonRegistration();
        openUrl();
    }

    @Test()
    public void AmazonRegistrationTest() {
        Keyword.getWebElement("cssSelector", "#createAccountSubmit").click();
        Keyword.getWebElement("cssSelector", "#ap_customer_name").sendKeys("Prithviraj Singh");
        // Keyword.handleDropdown("cssSelector", "auth-country-picker-container", "Hong Kong");
        Keyword.getWebElement("cssSelector", "#ap_phone_number").sendKeys("7267367");
        Keyword.getWebElement("cssSelector", "#ap_email").sendKeys("ajf@pickmail.com");
        Keyword.getWebElement("cssSelector", "#ap_password").sendKeys("123423");
        Keyword.getWebElement("cssSelector", "#continue").click();
        Keyword.waitImplicit(10, TimeUnit.SECONDS);
        Keyword.takeScreenShot();

    }
}
