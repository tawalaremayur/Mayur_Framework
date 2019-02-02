package com.resonantiatechnologie.amazon.pom.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.math.IEEE754rUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.resonantiatechnologie.amazon.keyword.Keyword;
import com.resonantiatechnologie.amazon.utility.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomBase {
	//This is constructor of Class PomBase Constructor name as same as Class Name
	public PomBase() {
		try {
			Constants.fis = new FileInputStream("E:\\Ecllips Sellinium Workspace\\Framework\\src\\main"
					+ "\\java\\com\\resonantiatechnologie\\amazon\\config\\config.properties");
			Constants.property= new Properties();
			Constants.property.load(Constants.fis);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}//End of Constructor

	//Method to Open Browser
	public static void openBrowser() {
		Keyword.openBrowser(Constants.property.getProperty("BROWSERNAME"));	
	}
	
	
	//Method to Open URL
	public void openUrl() {
		Keyword.openUrl(Constants.property.getProperty("URL"));
	}
	
	//Maximize Window
	public static void maxamizeWindow() {
		Constants.driver.manage().window().maximize();
	}


}
