package com.qa.task;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToolesQAApplicationTest extends ToolesQAApplication1 {

	@BeforeTest()
	public static void test1() throws Exception {
		ToolesQAApplication1.openBrowser();
		ToolesQAApplication1.readPropertiesFile();
	}

	@Test()
	public static void test2() throws Throwable {
		Elements.ElementsOptionClcik();
		Thread.sleep(2000);
		Elements.TextBox();
		Thread.sleep(2000);
		Elements.FullName();
		Thread.sleep(2000);
		Elements.Email();
		Thread.sleep(2000);
		Elements.CurrentAddressField();
		Thread.sleep(2000);
		Elements.PermanentAddressField();
		Elements.ScrollBy();
		Reporter.log("Scrolled Successfully");
		Elements.SubmitButton();
		Reporter.log("Submitted Successfully");
	}

	@AfterTest
	public static void broWserLeft() {

		//ToolesQAApplication1.tearDownPage();
	}
}
