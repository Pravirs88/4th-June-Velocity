package com.testLayer;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.DashboardPage;
import com.pageLayer.ExchangePage1;
import com.pageLayer.LoginPage1;
import com.testBase.BaseTest;

@Test(priority=2)
public class BySenario1 extends BaseTest{
	String ExpectedMsg="Order Created successfully";
	
       public void buyShare() throws IOException, InterruptedException {
		 dp.searchCompany("Axis");
		 dp.clickCompanyOption();
		 Thread.sleep(3000);
		 ep.clickBuyButton1();
		 Thread.sleep(3000);
		 ep.enterQuantity("3");
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(2000);
		 ep.clickBuyButton2();
		 Thread.sleep(2000);
		 Assert.assertEquals(ep.getStatus(), ExpectedMsg);
	}
}
