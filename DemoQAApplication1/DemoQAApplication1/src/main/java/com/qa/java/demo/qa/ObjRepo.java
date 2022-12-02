package com.qa.java.demo.qa;

import org.openqa.selenium.By;

public class ObjRepo {

	
	public static By username  = By.name("username");
	
	public static By password =  By.xpath("//*[@placeholder='Password']");
	
	public static By Login = By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button");
}
