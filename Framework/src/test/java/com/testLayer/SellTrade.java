package com.testLayer;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.DashboardPage;
import com.pageLayer.ExchangePage1;
import com.pageLayer.LoginPage1;
import com.testBase.BaseTest;

@Test(priority = 3)
public class SellTrade extends BaseTest{
	String ExpectedMsg="Order Created successfully";
	public void SellWiproTrade() throws IOException, InterruptedException {
		dp.searchCompany("wipro");
		 dp.clickCompanyOption();
		 Thread.sleep(2000);
		 ep.clickSellButton();
		 ep.enterQuantity("8");
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,520)");
		 Thread.sleep(2000);
		 ep.clickSellButton2();
		 Thread.sleep(2000);
		 Assert.assertEquals(ep.getStatus(), ExpectedMsg);
	}
}
