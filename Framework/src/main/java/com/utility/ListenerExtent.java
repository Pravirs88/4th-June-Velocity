package com.utility;

import java.io.IOException;
import java.io.ObjectInputFilter.Status;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.testBase.BaseTest;

public class ListenerExtent extends BaseTest implements ITestListener{
	ExtentReports 	extent = ExtentReporterNG.extentReportGenerator ();
	
	 ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
	
		 test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		//test.log(LogStatus.PASS, "Test is pass");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
   test.fail(result.getThrowable());
	
   try {
			test.addScreenCaptureFromPath(Utility.failScreenshot(result.getName()) ,"ScreenShotAttached");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
//         try {
//			test.addScreenCaptureFromPath(UtilityClass.failScreenshot(result.getName()), "ScreenShotAttached");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}

	@Override
	public void onStart(ITestContext context) {

		
	}

	@Override
	public void onFinish(ITestContext context) {

		extent.flush();
	}
}
