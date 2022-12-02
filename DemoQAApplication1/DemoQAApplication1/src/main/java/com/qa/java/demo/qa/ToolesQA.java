package com.qa.java.demo.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.qa.generic.ExtentReportsLib;
import com.qa.generic.GenericMethos;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolesQA extends ObjRepo {

	public static WebDriver driver;

	public static void baseBrowserLaunch() throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		opt.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		driver = new ChromeDriver(opt);
		driver.get(Resourcepath.URL);
		Thread.sleep(2000);
		if ((Resourcepath.URL).equalsIgnoreCase(driver.getCurrentUrl())) {
			GenericMethos.screenShot("Login Home");
			ExtentReportsLib.PassextentReport("Passed : URL is Working Fine...");
		} else {
			ExtentReportsLib.FailextentReport("Failed");
		}

	}

	public static void tearDownPage() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}

}
// System.setProperty(Resourcepath.Webdriver, Resourcepath.ChromePath);
//driver = ThreadGuard.protect(new ChromeDriver());