package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.*;
import java.io.*;
import java.time.Duration;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException 
	{   //url,browser are get from properties file insted of hard coding
		FileInputStream file1=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		
		Properties prop=new Properties();
		prop.load(file1);
		String Url=prop.getProperty("QAUrl");
		String browser_property=prop.getProperty("browser");//get frm global.properties file
		String browser_maven=System.getProperty("mybrowser");//variable get frm command window
		String browser=browser_maven!=null ? browser_maven:browser_property;
		//String browser=browser_property;
		if(driver==null)
		{
			
			if(browser.equalsIgnoreCase("chrome"))
			{
				//chrome driver get from project folder insted of hard coding
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				
				driver = new ChromeDriver();
				
			}
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","geckodriver.exe");
				
				driver = new FirefoxDriver();
				
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.get(Url);
		}
		return driver;
		
	}

}
