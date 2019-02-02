package com.resonantiatechnologie.amazon.pom.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.resonantiatechnologie.amazon.keyword.Keyword;
import com.resonantiatechnologie.amazon.pom.base.PomBase;
import com.resonantiatechnologie.amazon.pom.pages.AmazonSignIn;
import com.resonantiatechnologie.amazon.pom.pages.OnlineShoppingSiteInIndia;
import com.resonantiatechnologie.amazon.pom.pages.YourAccount;

public class YourAccountTestCases extends PomBase {
	YourAccount account;
    AmazonSignIn signIn;
    OnlineShoppingSiteInIndia online;

    // this the constructor of Amazon registration page
    public YourAccountTestCases() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        openBrowser();
        Keyword.waitImplicit(20, TimeUnit.SECONDS);
        Keyword.maximizeWindow();
        online = new OnlineShoppingSiteInIndia();
        signIn = new AmazonSignIn();
        account = new YourAccount();
        openUrl();
        online = signIn.login();
    }

    @Test()
    public void YourAccountTest() {
        Keyword.mouseHover("xpath", "//a[@id='nav-link-yourAccount']");
        Keyword.click("xpath", "//span[contains(text(),'Your Account')]");
        Keyword.waitImplicit(10, TimeUnit.SECONDS);
        Keyword.takeScreenShot();

    }
}
