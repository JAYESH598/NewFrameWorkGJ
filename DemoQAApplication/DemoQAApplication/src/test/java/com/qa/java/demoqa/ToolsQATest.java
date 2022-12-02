package com.qa.java.demoqa;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.java.demo.qa.ExcelTest2;
import com.qa.java.demo.qa.Text;
import com.qa.java.demo.qa.ToolesQA;

public class ToolsQATest extends ToolesQA {

	@BeforeTest
	public static void test1() {

		baseBrowserLaunch();
	}

	@Test
	public static void test2() throws Throwable {

		Text.enterUserName();

		Thread.sleep(3000);
		Text.enterPassWord();
		Thread.sleep(3000);
		Text.LoginClick();
	}
	
	
	//@Test
	public static void test3() throws Exception {

		ToolesQA.tearDownPage();
	}

}
