package com.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;
	
	
	public TestBase() {

		
		try {
			
			prop=new Properties();
			
			
			FileInputStream fis=new FileInputStream("C:\\Users\\Preeti\\eclipse-workspace\\Trivago\\src\\main\\java\\com\\qa\\configfile\\properties.file");
	          prop.load(fis);
			} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
				e.printStackTrace();
			}
		
		
		} 
	            
				public void launch() 
				{
					
					prop.getProperty("Browser");
					
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preeti\\eclipse-workspace\\Trivago\\driver\\chromedriver.exe");
					
				driver=new ChromeDriver();
				driver.get(prop.getProperty("URL"));
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				
				}
                
	}

