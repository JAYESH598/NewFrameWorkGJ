package com.qa.java.demo.qa;

import org.openqa.selenium.WebElement;

import com.qa.generic.GenericMethos;

public class Text extends ToolesQA {

	public static void enterUserName() throws Throwable {

		// WebElement userName = driver.findElement(tx.username);
		WebElement userName = driver.findElement(ObjRepo.username);
		System.out.println(userName);
		String ExcelUsername = ExcelTest.excleData(0, 0);
		userName.sendKeys(ExcelUsername);
	}

	public static void enterPassWord() throws Throwable {

		// WebElement passWord = driver.findElement(tx.password);
		
		WebElement passWord = driver.findElement(ObjRepo.password);
		
		
		
		String ExcelPassword = ExcelTest.excleData(0, 1);
//		passWord.sendKeys(ExcelPassword);
		GenericMethos.SendKeysOnWebelement(passWord, ExcelPassword);
	}

	public static void LoginClick() throws Throwable {

		// WebElement singin = driver.findElement(tx.Login);
		WebElement singin = driver.findElement(ObjRepo.Login);
		GenericMethos.ExplicitwaitofElementtobeclickable(singin, 20);
//		singin.click();

	}

}
