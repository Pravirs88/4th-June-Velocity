package com.testLayer;

import org.testng.annotations.Test;

import com.testBase.BaseTest;

public class GetExchangeTable extends BaseTest {
	@Test(priority = 4)
   public void getData() throws InterruptedException {
	   ep.clickOnExchane();
	   Thread.sleep(3000);
	   ept.getExchangeTable();
	   
   }
}
