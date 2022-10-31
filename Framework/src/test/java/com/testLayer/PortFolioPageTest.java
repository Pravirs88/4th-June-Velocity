package com.testLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pageLayer.PortFollioPage1;
import com.pageLayer.LoginPage1;
import com.testBase.BaseTest;

public class PortFolioPageTest extends BaseTest {

	@Test
	public void buyTrade() throws IOException, InterruptedException {
		PortFollioPage1 hs=new PortFollioPage1();
		hs.buyWiproTrade();
	}
}
