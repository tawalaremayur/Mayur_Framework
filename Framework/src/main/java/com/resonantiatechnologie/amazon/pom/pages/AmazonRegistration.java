package com.resonantiatechnologie.amazon.pom.pages;

import org.openqa.selenium.support.PageFactory;

import com.resonantiatechnologie.amazon.pom.base.PomBase;
import com.resonantiatechnologie.amazon.utility.Constants;

public class AmazonRegistration extends PomBase {
	
	public AmazonRegistration() {
        // Here we are going to launch the page objects
        PageFactory.initElements(Constants.driver, this);
    }

}
