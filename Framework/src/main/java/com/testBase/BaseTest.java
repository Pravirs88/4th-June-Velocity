package com.testBase;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pageLayer.DashboardPage;
import com.pageLayer.ExchangePage1;
import com.pageLayer.ExchangeTablePage;
import com.pageLayer.LoginPage1;
import com.utility.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
       
	public static WebDriver driver;
	public LoginPage1 	lpg;
	public DashboardPage dp; 
	public ExchangePage1 ep;
	public Utility util; 
	public ExchangeTablePage ept;
	public static Logger logger;
	
	
	@BeforeClass
	public void start()
	{
		logger = Logger.getLogger("Dalal Street Framework");
		PropertyConfigurator.configure("Log4j.properties");
		
		logger.info("Framework execution started");
	}
	
	@AfterClass
	public void stop()
	{
		logger.info("Framework execution finished");
	}
	@Parameters("browser")
	@BeforeMethod
	public void openBrowser(String Browser) throws IOException, InterruptedException {
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide correct browser");
		}
			
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//----------------object Creation---------------	
		lpg= new  LoginPage1();
		 dp=new DashboardPage();
		  ep=new ExchangePage1();
		  util = new Utility();
		  ept=new ExchangeTablePage();
		//------------------------------------------------------
		  lpg.verifyLogin();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}

}
	

