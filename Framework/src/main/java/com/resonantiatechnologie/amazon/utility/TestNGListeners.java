package com.resonantiatechnologie.amazon.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestNGListeners implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		Constants.driver.close();
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("Browser is open");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
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
	
	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
			
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		
	}

}
