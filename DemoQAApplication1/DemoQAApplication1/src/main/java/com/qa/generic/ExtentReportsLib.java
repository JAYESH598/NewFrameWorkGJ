package com.qa.generic;

import java.util.Date;

import com.qa.java.demo.qa.Resourcepath;
import com.qa.java.demo.qa.ToolesQA;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsLib extends ToolesQA {

	public static Date date = new Date();
	public static String str=date.toString().replace(" ", "");
	public static String str1=date.toString().replace(":", "");
	public static ExtentReports reports = new ExtentReports(Resourcepath.ExtenResultPath + "Reports"+str1 +".html",
			true);
	public static ExtentTest test = reports.startTest(driver.getTitle());

	public static void PassextentReport(String Value) throws Exception {
		String filepathofscrnsht = GenericMethos.destFiles.getAbsolutePath();
		test.log(LogStatus.PASS, Value + test.addScreenCapture(filepathofscrnsht));

	}

	public static void FailextentReport(String Value) throws Exception {
		String filepathofscrnsht = GenericMethos.destFiles.getAbsolutePath();
		test.log(LogStatus.FAIL, Value + test.addScreenCapture(filepathofscrnsht));

	}

	public static void SkipextentReport(String Value) {
		test.log(LogStatus.SKIP, Value);
	}

	public static void InfoextentReport(String Value) {
		test.log(LogStatus.INFO, Value);

	}

	public static void Flush() {
		reports.endTest(test);
		reports.flush();
	}

}