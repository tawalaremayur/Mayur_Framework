package com.resonantiatechnologie.amazon.utility;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import ru.yandex.qatools.ashot.Screenshot;

public class Constants {
	// selenium constants
		public static WebDriver driver;
		public static Actions action;
		public static WebElement element;
		public static Screenshot sceenshot;
		public static Select select;

		// java constants
		public static Properties property;
		public static FileInputStream fis;
		public static List list;

		// generic constants
		public static long PAGE_LOAD_TIMEOUT = 100;
		public static long IMPLICIT_WAIT = 100;

		// file paths
		public static String propertyFilePath = "E:\\Ecllips Sellinium Workspace\\Framework\\src\\main\\java\\com\\resonantiatechnologie\\amazon\\config\\config.properties";
		public static String pomexcelFilePath = "E:\\Ecllips Sellinium Workspace\\Framework\\src\\main\\java\\com\\resonantiatechnologie\\amazon\\testdata\\POMTestData.xlsx";
		public static String keywordTestCases = "E:\\Ecllips Sellinium Workspace\\Framework\\src\\main\\java\\com\\resonantiatechnologie\\amazon\\testdata\\KeywordTestCases.xlsx";
}
