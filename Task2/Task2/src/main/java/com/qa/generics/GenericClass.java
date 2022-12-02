package com.qa.generics;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.task.ResourcePath;
import com.qa.task.ToolesQAApplication1;

public class GenericClass extends ToolesQAApplication1 {

	   
	public static File destFiles;
	public static File SrcFile;
	
	        public static void ExplicitwaitofElementtobeclickabl(WebElement element, long WaitTimeInSecound) {
	        	
	        	WebDriverWait wait = new WebDriverWait(driver, WaitTimeInSecound);
	        	wait.until(ExpectedConditions.elementToBeClickable(element));
	        	element.click();
	        }
	        
	        
	        public static void SendKeysOnWebelement(WebElement element, String text) {
	    		element.click();
	    		element.clear();
	    		element.sendKeys(text);
	    	}
	        
	       public static void screenShot(String methodname) throws IOException {
	    		TakesScreenshot srcShot = ((TakesScreenshot) driver);
	    	    SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
	    		destFiles = new File(ResourcePath.picture+methodname+1+".png");
	    		
	    		FileUtils.copyFile(SrcFile, destFiles);

	    	}
	       
	       
	       public static void JsScroll() {
	    	   
	    	   
	    	   String javascript = "window.scrollBy(0,500)";  
	    	   JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	    	   jsExecutor.executeScript(javascript);  
	       }


		
}
