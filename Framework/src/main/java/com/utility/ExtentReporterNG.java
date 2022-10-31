package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReporterNG {
	public static ExtentReports extent;

	public static ExtentReports extentReportGenerator () {
	
		String path = System.getProperty("user.dir") + "//Reports//index.html"  ;
		
		ExtentHtmlReporter report = new ExtentHtmlReporter (path);
		
		report.config().setReportName("Dalal_Street");
		
		report.config().setDocumentTitle("FrameWorkReport");
		
		report.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports () ;
		
		extent.attachReporter(report);
		
		extent.setSystemInfo("OS", "Windows10Pro");
		
		extent.setSystemInfo("Organization", "VCTC_ChinchWad");
		
		extent.setSystemInfo("Tester", "PravirSalunkhe");
		
		return extent;

}
}