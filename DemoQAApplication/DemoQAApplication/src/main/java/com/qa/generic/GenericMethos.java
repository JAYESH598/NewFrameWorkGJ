package com.qa.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.java.demo.qa.ToolesQA;

public class GenericMethos extends ToolesQA {

	public static void ExplicitwaitofElementtobeclickable(WebElement element, long WaitTimeInSecound) {

		WebDriverWait webWait = new WebDriverWait(driver, 10);
		webWait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();

	}

	public static void SendKeysOnWebelement(WebElement element, String text) {
		element.click();
		element.clear();
		element.sendKeys(text);
	}
}