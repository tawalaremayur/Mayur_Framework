package com.resonantiatechnologie.amazon.pom.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.resonantiatechnologie.amazon.keyword.Keyword;
import com.resonantiatechnologie.amazon.pom.base.PomBase;
import com.resonantiatechnologie.amazon.pom.pages.AmazonPrime;
import com.resonantiatechnologie.amazon.pom.pages.AmazonSignIn;
import com.resonantiatechnologie.amazon.pom.pages.OnlineShoppingSiteInIndia;

public class AmazonPrimeTestCases extends PomBase {
	AmazonPrime prime;
    AmazonSignIn signIn;
    OnlineShoppingSiteInIndia online;

    // this is the constructor of Amazon Prime page
    public AmazonPrimeTestCases() {
        super();

    }

    @BeforeMethod
    public void setUp() {
    openBrowser();
        Keyword.waitImplicit(10, TimeUnit.SECONDS);
        Keyword.maximizeWindow();
        online = new OnlineShoppingSiteInIndia();
        signIn = new AmazonSignIn();
        prime = new AmazonPrime();
        openUrl();
        online = signIn.login();

    }

    @Test()
    public void amazonPrimeTest() {
        prime = online.clickOnTryPrimeLink();
        prime.tryPrimeFreeButton();
        prime.startYour30DaysTrialButton();
        Keyword.takeScreenShot();

    }
}
