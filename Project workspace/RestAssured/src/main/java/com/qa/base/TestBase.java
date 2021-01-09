package com.qa.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

	public class TestBase {
	
	static WebDriver driver;
	public Properties properties = new Properties();
	
	public TestBase() {
		
		try {
			properties = new Properties();
			properties.load(new FileReader(".//Data//config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
