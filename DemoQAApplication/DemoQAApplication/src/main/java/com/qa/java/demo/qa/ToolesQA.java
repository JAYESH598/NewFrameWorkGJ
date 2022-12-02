package com.qa.java.demo.qa;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ThreadGuard;

public class ToolesQA extends ObjRepo {

	public static WebDriver driver;
	
	
	public static void baseBrowserLaunch()
	
	{
		
		System.setProperty(Resourcepath.Webdriver,Resourcepath.ChromePath);
		
		driver= ThreadGuard.protect(new ChromeDriver());
//		driver = new ChromeDriver();
		driver.get(Resourcepath.URL);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		 
	}
	
	public static void tearDownPage() throws Exception {
		Thread.sleep(2000);
		
		
		driver.close();
	}
	
	
	
	
}
