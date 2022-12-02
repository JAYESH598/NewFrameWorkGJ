package com.qa.java.demoqa;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.generic.ExtentReportsLib;
//import com.qa.java.demo.qa.ExcelTest2;
import com.qa.java.demo.qa.Text;
import com.qa.java.demo.qa.ToolesQA;

public class ToolsQATest extends ToolesQA {

	@BeforeTest
	public static void Browser() throws Exception {
		baseBrowserLaunch();
	}

	@Test
	public static void OrangeHRM() throws Throwable {

		Text.enterUserName();
		Thread.sleep(3000);
		Text.enterPassWord();
		Thread.sleep(3000);
		Text.LoginClick();
	}

	@AfterTest
	public static void test3() throws Exception {
		ExtentReportsLib.Flush();
		Thread.sleep(3000);
		ToolesQA.tearDownPage();
	}

}
