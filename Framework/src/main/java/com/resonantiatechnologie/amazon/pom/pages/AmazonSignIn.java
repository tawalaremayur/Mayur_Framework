package com.resonantiatechnologie.amazon.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resonantiatechnologie.amazon.utility.Constants;

public class AmazonSignIn {
	@FindBy(xpath= "//a[@class='a-link-nav-icon']")
	WebElement amazonLink;
	
	@FindBy(xpath="//h1[@class='a-spacing-small']")
	WebElement loginLabel;
	
	@FindBy(xpath= "//label[@class='a-form-label']")
	WebElement emailOrMobilePhoneNumberLabel;
	
	@FindBy(xpath= "//input[@name='email']")
	WebElement emailOrPhoneNumberTextBox;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continueButton;
	
	@FindBy(xpath="//i[@class='a-icon a-icon-collapse']")
	WebElement needHelpExpandButton;
	
	@FindBy(xpath="//span[@class='a-expander-prompt']")
	WebElement needHelpLink;
	
	@FindBy(xpath="//a[@id='auth-fpp-link-bottom']")
	WebElement forgetPasswordLink;
	
	@FindBy(css="#ap-other-signin-issues-link")
	WebElement otherIssuesWithSignInLink;
	
	@FindBy(css="#createAccountSubmit")
	WebElement createYourAmazonAccountButton;
	
	@FindBy(xpath="//a[contains(text(),\"Conditions of Use\")]")
	WebElement conditionsofUseLink;
	
	@FindBy(xpath="//a[contains(text(),\"Privacy Notice\")]")
	WebElement privacyNoticeLink;
	
	@FindBy(xpath="//a[contains(text(),\"Help\")]")
	WebElement helpLink;
	
	@FindBy(xpath="//span[contains(text(),\"© 1996-2019, Amazon.com, Inc. or its affiliates\")]")
	WebElement amazonAffiliatesLabel;
	
	// Password Pages Xpath
	
	@FindBy(xpath="//a[@id=\"ap_change_login_claim\"]")
	WebElement changeLink;
	
	@FindBy(xpath="//label[contains(text(),\"Password\")]")
	WebElement passwordLabel;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement enterPasswordTextBox;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement loginButton;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkbox;
	
	@FindBy(xpath="//span[@class='a-label a-checkbox-label']")
	WebElement keepMeSignedInDetailsLabel;
	
	@FindBy(xpath="//a[@id='remember_me_learn_more_link']")
	WebElement detailsPopUpBox;
	
	@FindBy(xpath="//i[@class='a-icon a-icon-popover']")
	WebElement popOverBox;
	
	@FindBy(xpath="//h5[contains(text(),'or')]")
	WebElement orLabel;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement loginUsingAnOTPButton;
	
	@FindBy(xpath="//i[@class='a-icon a-icon-info a-icon-small']")
	WebElement iIcon;
	
	@FindBy(xpath="//span[contains(text(),'Message and Data rates may apply.')]")
	WebElement messageAndDataRatesMayApplyLabel;
	
	//CartButton Xpath
	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement clickOnCartButton;
	
	
	//Constructor of the class AmazonSignIn
	public AmazonSignIn() {
		PageFactory.initElements(Constants.driver, this);
	}
	
	public void clickOnAmazonLink() {
		amazonLink.click();
	}
	
	public String getTextOfLoginLabel() {
		return loginLabel.getText();
	}
	
	public String getTextOfEmailOrMobilePhoneNumberLabel() {
		return emailOrMobilePhoneNumberLabel.getText();
	}
	
	public void enterEmailOrPhoneNumberTextBox() {
		emailOrPhoneNumberTextBox.sendKeys(Constants.property.getProperty("EMAIL_OR_PHONE_NUMBER"));
	}
	
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
	
	public void clickOnNeedHelpExpandButton() {
		needHelpExpandButton.click();
	}
	
	public void clickOnNeedHelpLink() {
		needHelpLink.click();
	}
	
	public void clickOnForgetPasswordLink() {
		forgetPasswordLink.click();
	}
	
	public void clickOnOtherIssuesWithSignInLink() {
		otherIssuesWithSignInLink.click();
	}
	
	public void clickOnCreateYourAmazonAccountButton() {
		createYourAmazonAccountButton.click();
	}
	
	public void clickOnConditionsofUseLink() {
		conditionsofUseLink.click();
	}
	
	public void clickOnPrivacyNoticeLink() {
		privacyNoticeLink.click();
	}
	
	public void clickOnHelpLink() {
		helpLink.click();
	}
	
	public String getTextAzonAffiliatesLabel() {
		return amazonAffiliatesLabel.getText();
	}
	
	// Password Page Methods
	
	public void clickChangeLink() {
		changeLink.click();
	}
	
	public String getTextOfPasswordLabel() {
		return passwordLabel.getText();
	}
	
	public void enterPassword() {
		enterPasswordTextBox.sendKeys(Constants.property.getProperty("PASSWORD"));
	}

	public String getTextOfKeepMeSignedInDetailsLabel() {
		return keepMeSignedInDetailsLabel.getText();
	}
	
	public void getDetailsPopoUoBox() {
		detailsPopUpBox.getText();
	}
	
	public void clickPopOverBox() {
		popOverBox.click();
	}
	
	public String getTextOfOrLabel() {
		return orLabel.getText();
	}
	
	public void clickLoginUsingAnOTPMethod() {
		loginUsingAnOTPButton.click();
	}
	
	public String getTextOfMessageAndDataRatesMayApplyLabel() {
		return messageAndDataRatesMayApplyLabel.getText();
	}
	
	//This method is used to click on Cart Button
	public void clickOnCartButton() {
		clickOnCartButton.click();
	}
	
	//This method is used to Login on Amazon Button
	public OnlineShoppingSiteInIndia login(){
		emailOrPhoneNumberTextBox.sendKeys(Constants.property.getProperty("EMAIL_OR_PHONE_NUMBER"));
		continueButton.click();
		enterPasswordTextBox.sendKeys(Constants.property.getProperty("PASSWORD"));
		loginButton.click();
		return new OnlineShoppingSiteInIndia();
	}
	
	//Login Method is Overload This method is reading Excel File
	public OnlineShoppingSiteInIndia login(String UserName, String Password){
		emailOrPhoneNumberTextBox.sendKeys(UserName);
		continueButton.click();
		enterPasswordTextBox.sendKeys(Password);
		loginButton.click();
		//clickOnCartButton.click();
		return new OnlineShoppingSiteInIndia();
	}
	
	
}
