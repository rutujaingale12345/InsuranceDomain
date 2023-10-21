package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	FileInputStream fileInputStream;
	public WebDriver driver;

	public void LaunchTheWeb() throws IOException{
		 fileInputStream = new FileInputStream(".\\src\\main\\resources\\property");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Properties properties=new Properties();
		properties.getProperty("weburl");
		driver.get(properties.getProperty("weburl"));
		
	}

}
