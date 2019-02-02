package com.resonantiatechnologie.amazon.keyword;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.resonantiatechnologie.amazon.utility.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Keyword {
	
	/*
	 * 1) openBrowser
	 * 2) openUrl
	 * 3) getWebElement
	 * 4) enterText
	 * 5) getText
	 * 6) getWindowTitle
	 * 7) mouseHiver
	 * 8) refresh
	 * 9) navigateBack
	 * 10) navigateForword
	 * 11) sleep
	 * 12) implicitlyWait
	 * 13) explicitlyWait
	 * 14) clickOn
	 * 15) getScreenShot
	 * 16) maximizeWindow
	 * 17) minimizeWindow
	 * 18) enterText
	 * 19) closeBrowser
	 * 20) uploadFile
	 * 21) handlePopUp
	 * 22) navigateTo
	 * 23) howManyLinkOnPage
	 * 24) click
	 * 25) selectFromDropDownList
	 * 26) handleAlerts
	 * 27) handleDropDown
	 */
	
	
	
	
	

	static Logger log = Logger.getLogger(Keyword.class);
	/* 1
	 * This Method is used to open browser
	 * 
	 * @parameter= browser name
	 */
	public static void openBrowser(String browserName) {
		
		
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			Constants.driver = new ChromeDriver();
			log.info("Your "+browserName+ " browser Open Successfully");
			break;
		case "firefox":
			WebDriverManager.chromedriver().setup();
			Constants.driver = new FirefoxDriver();
			log.info("Your browser Open Successfully"+browserName);
			break;
			
		case "IE":
			WebDriverManager.iedriver().setup();
			Constants.driver = new InternetExplorerDriver();
			log.info("Your browser Open Successfully"+browserName);
			break;

		case "opera":
			WebDriverManager.operadriver().setup();
			Constants.driver = new OperaDriver();
			log.info("Your browser Open Successfully"+browserName);
			break;

		default:
			System.out.println("Invalid Browser name");
			break;
		}
	}// End of Open Browser Keyword

	/* 2
	 * This method is used to open particular link
	 * 
	 * @parameter is url in form of String
	 */
	
	public static void openUrl(String url) {
		Constants.driver.get(url);
		log.info("Link is open");
	}

	/* 3
	 * getWebElement method is used to get the element present on DOM
	 * it takes @locator and @locatorValue as parameter
	 */
	public static WebElement getWebElement(String locatorType, String locatorValue) {
		
		switch (locatorType) {
		case "xpath":
			Constants.element=Constants.driver.findElement(By.xpath(locatorValue));
			log.info("locate successfully locatorType and locatorValue in DOM");
			break;
		
		case "name":
			Constants.element= Constants.driver.findElement(By.name(locatorValue));
			log.info("locate successfully locatorType and locatorValue in DOM");
			break;
		case "id":
			Constants.element=Constants.driver.findElement(By.id(locatorValue));
			log.info("locate successfully locatorType and locatorValue in DOM");
			break;
		case "linkText":
			Constants.element=Constants.driver.findElement(By.linkText(locatorValue));
			log.info("locate successfully locatorType and locatorValue in DOM");
			break;
		case "partialLinkText":
			Constants.element=Constants.driver.findElement(By.partialLinkText(locatorValue));
			log.info("locate successfully locatorType and locatorValue in DOM");
			break;
		case "cssSelector":
			Constants.element=Constants.driver.findElement(By.cssSelector(locatorValue));
			log.info("locate successfully locatorType and locatorValue in DOM");
			break;
		case "tagName":
			Constants.element=Constants.driver.findElement(By.tagName(locatorValue));
			log.info("locate successfully locatorType and locatorValue in DOM");
			break;
		case "className":
			Constants.element=Constants.driver.findElement(By.className(locatorValue));
			log.info("locate successfully locatorType and locatorValue in DOM");
			break;
		
		default:
			System.out.println("Locator Type or Locator Value didn't find");
			break;
		}
		return Constants.element;
	}// end of open url method
	
	
	/* 4
	 * This method is used to enter text
	 * Parameter is String
	 */
	
	public static void enterText(String locatorType, String locatorValue, String textToEnter) {
		getWebElement(locatorType, locatorValue).sendKeys(textToEnter);
		log.info("Text is enter Successfully");
	}//End of enter text method
	
	
	
	/* 5
	 * This method is used to get text
	 */
	public static void getText() {
		Constants.element.getText();
		log.info("Successfully get text of Web Elememt");
	}
	
	
	/* 6
	 * This Method is used to get a window Title
	 * 
	 */
	public static void getWindowTitle() {
		Constants.driver.getTitle();
		log.info("Successfully get window title ");
	}// End of GetWindowTitle Method
	
	
	
	/* 7
	 * This method is used to mouseHover to particular site
	 */
	public static void mouseHover(String locatorType, String locatorValue) {
		Actions bk = new Actions(Constants.driver);
        bk.moveToElement(getWebElement(locatorType, locatorValue)).build().perform();
        log.info("Mouse movement done successfully");
	}// End of mouseHover Method
	
	
	/* 8
	 * refresh Methid is used to get a refresh of that particular page
	 */
	public static void refresh() {
		Constants.driver.navigate().refresh();
		log.info("Refresh page");
	}// End of Refresh Method
	
	
	/* 9
	 * Navigate Back method is used to navigate back page
	 */
	public static void navigateBack() {
		Constants.driver.navigate().back();
		log.info("Navigate Back Action perform Successfully");
	}// End of navigate Back Method
	
	
	/* 10
	 * Navigate forward method is used to navigate forward page
	 */
	public static void navigateForward() {
		Constants.driver.navigate().forward();
		log.info("Navigate Forword Action perform Successfully");
	}//End of navigate forward Method
	
	
	/* 11
	 * sleep method makes main thread to sleep for given time
	 * method takes parameter @durationinmillisec 
	 */
	public static void sleep(long durationinmilisec) {
		try {
			Thread.sleep(durationinmilisec);
		} catch (InterruptedException e) {
			System.out.println("Invalid Duration");
		}
		log.info("Browser will sussessfully sleep for" +durationinmilisec+ "time");
	}//End of Sleep method
	
	/* 12
	 * waitImplicit method makes webdriver intance to wait for time being
	 * it takes @timeunit like seconds, minut etc. and @time value respective to unit
	 */
	public static void waitImplicit(int timeunit,TimeUnit TimeUnit) {
		Constants.driver.manage().timeouts().implicitlyWait(timeunit,TimeUnit);
		log.info("Browser will wait for" +timeunit+ " " +TimeUnit);
		}
	
	
	/* 13
	 * This method is used to Explicit wait on any webElement
	 */
	public static void explicitlyWait(String locatorType, String locatorValue, int timeout) {
		clickOn(Constants.driver, getWebElement(locatorType, locatorValue),timeout);
	}
	
	
	/* 14
	 * This method is used to clickOn
	 */
	public static void clickOn(WebDriver driver, WebElement webElement,int timeout) {
		WebElement locator=null;
		new WebDriverWait(Constants.driver, timeout).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}//End of Click method
	
	
	/* 15
	 * getScreenShot method takes a full sereenShoot of desired window
	 * it takes parameter @pathtosave where user need to provied desired path with filename and extension
	 */
	public static void takeScreenShot() {
		AShot as = new AShot();
		Date d = new Date();
		SimpleDateFormat Formatter = new SimpleDateFormat ("-E, dd MMM yyyy, HH_mm_ss");

		String DateFormat = Formatter.format(d);

		Screenshot sc = as.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Constants.driver);

		try {
			ImageIO.write(sc.getImage(),"PNG",new File("E:\\Ecllips Sellinium Workspace\\Framework\\Screenshot\\"+DateFormat+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	/* 16
	 * maximizeWindow method maximizes the current window
	 */
	public static void maximizeWindow() {
		Constants.driver.manage().window().maximize();
		log.info("Window mazimize successfully");
	}
	
	/* 17
	 * minimizeWindow method minimizes the current window
	 */
	public static void minimizeWindow() {
		Dimension d = new Dimension(800, 800);
		Constants.driver.manage().window().setSize(null);
		log.info("Window minimize successfully");
	}
	
	/* 18
	 * enterText method enters text in given textbox or within element where text can be entred
	 * it takes @text parameter
	 */
	public static void enterText(String text) {
		Constants.element.sendKeys(text);
		log.info("Enter" +text+ "successfully");
	}
	
	/* 19
	 * This method is used to close the particular bowser
	 */
	public static void closeBrowser() {
		Constants.driver.close();
		log.info("Browser Close Successfully");
	}
	
	/* 20
	 * This method is used to uploadFile
	*/
		public static void uploadFile(String locatorType, String locatorValue, String textToEnter) {
			getWebElement(locatorType, locatorValue).sendKeys(textToEnter);
			log.info("File Upload Successfully");
		}// End of the method
		
	
		/* 21
		* This method is used to close the PopUp
		*/ 
		public static void handlePopUp(String locatorType, String locatorValue) {
			getWebElement(locatorType, locatorValue).click();
			Set<String> handler = Constants.driver.getWindowHandles();
			Iterator<String> it = handler.iterator();
			String Parentwindowid = it.next();
			String childwindowid = it.next();
			Constants.driver.switchTo().window(childwindowid).close();
			Constants.driver.switchTo().window(Parentwindowid);
			log.info("PopUp handle successfully");
		}// End the of the method
		
		
		/* 22
		 * This method is used to navigate to any url
		 */
		public static void navgateTo(String url) {
			Constants.driver.navigate().to(url);
			log.info("Navigate to" +url);
		}// End of the method
		
		
		/* 23
		 * This method is used to get the links on the current page
		 */
		public static void howManyLinksOnPage() {
			List<WebElement> list = Constants.driver.findElements(By.tagName("a"));
	        // This code will print the links which is related to images links
	        list.addAll(Constants.driver.findElements(By.tagName("img")));
	        System.out.println(list.size());
	        for (int i = 0; i < list.size(); i++) {
	            String s = list.get(i).getText();
	            System.out.println(s);
	            log.info("Successfuly find Link on page");
		}
		}
		
		/* 24
		 * click method clicks the clikable method
		 */
		public static void click(String locatorType, String locatorValue) {
			getWebElement(locatorType, locatorValue).click();
			log.info("Click successfully");	
		}
		
		
		/*
		 * 25
		 * This method is used to select value from Drop Down list
		 */
		 public void selectFromDropDownList(String locatorType, String locatorValue, String text) {
			Select select= new Select(getWebElement(locatorType, locatorValue));
			select.getAllSelectedOptions();
			log.info("Successfully select option from Drop Down List");
		}
		
		 
		 /*
		  * 26
		  * This Method is used to handleAlerts on page
		  */
		public void handleAlerts(String locatorType, String locatorValue) {
			getWebElement(locatorType, locatorValue);
			Alert alert= Constants.driver.switchTo().alert();
			alert.dismiss();
			log.info("Successfully Handle ALert on Web Page");
		}
		
		/*
		 * 27
		 * This method is used to Handle Drop Down List
		 */
		public static void handleDropdown(String locatorType, String locatorValue, String text ) {
	        Select select=new Select(getWebElement(locatorType, locatorValue));
	        select.selectByVisibleText(text);
	        log.info("Desired Element is selected from given dropdown");
		}

		

		
		
	//get text
	//get window title
	//refresh
	//navigate back
	//navigate forward
	//sleep
	//implicit wait
	//getScreenshot
	//mousehover
	//windowMaxamize
	//windowMinimize
	//window close
	//windowquit
	//alertexcpt
	//alertdismiss
	//getalerttext
	//notification block
	//getpopup
	//switch popup
	//switch to frame
	//drag and drop
	//uplod file
	//handle popup
	//navigateto
	
	
}
