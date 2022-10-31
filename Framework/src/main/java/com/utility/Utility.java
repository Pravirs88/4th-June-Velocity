package com.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.testBase.BaseTest;

public class Utility extends BaseTest {
	public Utility()
	{
		PageFactory.initElements(driver, this);
	}

	//url get 
	public String getUrl()
	{
		String current_url = driver.getCurrentUrl();
		return current_url;
	}
	
	static String path="D:\\Eclipse_Workspace\\FrameWork_dalalSteet\\ScreenShot\\";
	public static String failScreenshot(String fileName) throws IOException {
		Date d=new Date();
		System.out.println(d.toString());

	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss"); 
		
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	String des=path+fileName+" -"+sdf.format(d)+".png";
	File destination=new File(des);
	FileHandler.copy(src, destination);
	return des;
}
}