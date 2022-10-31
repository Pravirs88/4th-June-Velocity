package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.testBase.BaseTest;

public class ExchangeTablePage extends BaseTest{
	public ExchangeTablePage() {
		
		PageFactory.initElements( driver,this);
	}

	public void getExchangeTable(){
	
	String data;
	for(int i=1;i<=20;i++)
	{
		for(int k=1;k<=7;k++)
		{
			data = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+k+"]")).getText();
			System.out.print(data +" | ");
		}
		System.out.println();
}
}
	}