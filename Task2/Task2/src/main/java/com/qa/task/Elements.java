package com.qa.task;

import org.openqa.selenium.WebElement;

import com.qa.generics.GenericClass;

public class Elements extends ToolesQAApplication1 {

	public static void ElementsOptionClcik() throws Throwable {
        Thread.sleep(1000);
		WebElement ClickEl = driver.findElement(OBJ.ElementsOptionClcik);
		GenericClass.ExplicitwaitofElementtobeclickabl(ClickEl, 20);
		GenericClass.screenShot("Tools QA Application");
		
		// ClickEl.click();
	}

	public static void TextBox() throws Throwable {
        Thread.sleep(3000);
		WebElement sub = driver.findElement(OBJ.TextBox);
		GenericClass.ExplicitwaitofElementtobeclickabl(sub, 20);
		GenericClass.screenShot("TextFile");
		// sub.click();
	}

	public static void FullName() throws Throwable {
        WebElement FullName = driver.findElement(OBJ.FullName);
		GenericClass.SendKeysOnWebelement(FullName, ResourcePath.FullName);
		GenericClass.screenShot("Fullname");
		// FullName.sendKeys(Prop.get());
		// FullName.sendKeys(ResourcePath.FullName);

	}

	public static void Email() throws Exception {
        WebElement Email = driver.findElement(OBJ.Email);
		GenericClass.SendKeysOnWebelement(Email, ResourcePath.Email);

		// Email.sendKeys(ResourcePath.Email);
	}

	public static void CurrentAddressField() throws Throwable {
        WebElement CurrentAddressField = driver.findElement(OBJ.CurrentAddressField);
		GenericClass.SendKeysOnWebelement(CurrentAddressField, ResourcePath.CurrentAddressField);
		
		// CurrentAddressField.sendKeys(ResourcePath.CurrentAddressField);

	}

	public static void PermanentAddressField() throws Throwable {
        WebElement PermanentAddressField = driver.findElement(OBJ.PermanentAddressField);
		GenericClass.SendKeysOnWebelement(PermanentAddressField, ResourcePath.PermanentAddressField);
	
		// PermanentAddressField.sendKeys(ResourcePath.PermanentAddressField);
	}

	
	public static void ScrollBy() {
		GenericClass.JsScroll();
	}
	
	public static void SubmitButton() throws Throwable {
//		WebElement singin = 
		driver.findElement(OBJ.SubmitButton).click();
//		GenericClass.ExplicitwaitofElementtobeclickabl(singin, 20);
		GenericClass.screenShot("SampleSubmitbutton");

	}
	
	

}