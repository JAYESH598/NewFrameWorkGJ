package com.qa.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.java.demo.qa.Resourcepath;
import com.qa.java.demo.qa.ToolesQA;

public class GenericMethos extends ToolesQA {
	
	
	public static File destFiles;
	public static void ExplicitwaitofElementtobeclickable(WebElement element, long WaitTimeInSecound) {

		WebDriverWait webWait = new WebDriverWait(driver, WaitTimeInSecound);
		webWait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();

	}

	public static void SendKeysOnWebelement(WebElement element, String text) {
		element.click();
		element.clear();
		element.sendKeys(text);
	}

	public static void screenShot(String methodname) throws IOException {
		TakesScreenshot srcShot = ((TakesScreenshot) driver);
		File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
		destFiles= new File(Resourcepath.FilePath+methodname+ExtentReportsLib.str1+".png");
		FileUtils.copyFile(SrcFile, destFiles);

	}



}