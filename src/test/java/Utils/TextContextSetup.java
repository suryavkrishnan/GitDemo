package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObject.pageFactory;

public class TextContextSetup {
	public WebDriver driver;
	public String landingpageProductName;
	public pageFactory pageFactoryObj;
	public GenericUtils genericUtilObj;
	public TestBase testBaseObj;
	 
	 public TextContextSetup() throws IOException
	 {   testBaseObj=new TestBase();
	 	 pageFactoryObj=new pageFactory(testBaseObj.WebDriverManager());
	 	 genericUtilObj=new GenericUtils(testBaseObj.WebDriverManager());
	 }

}
