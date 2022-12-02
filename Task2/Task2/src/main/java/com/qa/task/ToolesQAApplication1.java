package com.qa.task;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.generics.GenericClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolesQAApplication1 extends OBJ {
	public static WebDriver driver;
	public static Properties Prop;
	public static FileInputStream fi;

	public static void openBrowser() throws Exception {
		readPropertiesFile();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(Prop.getProperty("URL"));
		
		GenericClass.screenShot("URL_Home");
	}

	public static void readPropertiesFile() throws IOException {
		Prop = new Properties();
		fi = new FileInputStream("C:\\Users\\jv18280\\eclipse-workspace\\Task2\\config.properties");
		Prop.load(fi);
	}

	public static void tearDownPage() {
		driver.close();
	}

}
