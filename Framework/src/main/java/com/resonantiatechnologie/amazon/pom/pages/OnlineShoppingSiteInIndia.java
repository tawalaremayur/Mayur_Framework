package com.resonantiatechnologie.amazon.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resonantiatechnologie.amazon.utility.Constants;

public class OnlineShoppingSiteInIndia {
	@FindBy(xpath = "//a[@id='nav-link-yourAccount']")
	WebElement helloSignInYourOrdersLink;

	@FindBy(xpath = "//a[@id='nav-link-prime']")
	WebElement tryPrimeLink;

	@FindBy(xpath = "//a[@id=\"nav-link-wishlist\"]")
	WebElement yourListsLink;

	@FindBy(xpath = "//a[@id=\"nav-cart\"]")
	WebElement cartLink;
	
	//This xpath is Sign Out
	@FindBy(xpath = "//span[contains(text(),'Sign Out')]")
	WebElement signOut;

	// Constructor of class OnlineShoppingSiteInIndia it will initialize page factory
	public OnlineShoppingSiteInIndia() {
		PageFactory.initElements(Constants.driver, this);

	}

	// Methods for above webElements operations
	
	public String getTextOnHelloSignInYourOrdersLink() {
		return helloSignInYourOrdersLink.getText();
	}
	
	//Method to click on particular link 
	public AmazonSignIn clickOnHelloSignInYourOrdersLink() {
		helloSignInYourOrdersLink.click();
		return new AmazonSignIn();
	}
	
	// Method to MouseHover on particular link
	public void mouseHoverOnhelloSignInYourOrdersLink() {
		Constants.action = new Actions(Constants.driver);
		Constants.action.moveToElement(helloSignInYourOrdersLink).build().perform();
	}

	//Method to click on particular link 
	public AmazonPrime clickOnTryPrimeLink() {
		tryPrimeLink.click();
		return new AmazonPrime();
	}
	
	// Method to MouseHover on particular link
	public void mouseHoverOntryPrimeLink() {
		Constants.action = new Actions(Constants.driver);
		Constants.action.moveToElement(tryPrimeLink).build().perform();
	}

	//Method to click on particular link 
	public void clickOnYourListLink() {
		yourListsLink.click();
	}
	
	// Method to MouseHover on particular link
	public void mouseHoveryourListsLink() {
		Constants.action = new Actions(Constants.driver);
		Constants.action.moveToElement(yourListsLink).build().perform();
	}
	
	//Method to click on particular link 
	public ShoppingCart clickOnCartLink() {
		cartLink.click();
		return new ShoppingCart();
	}
	
	//Method to sign out on Amazon
	public void clickOnSignOut() {
		signOut.click();
	}
	
	
}
