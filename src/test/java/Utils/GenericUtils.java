package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver genericDriver;
	
	public GenericUtils(WebDriver driver)
	{
		this.genericDriver= driver;
	}
	
	public void switchToChildWindow()
	{
		Set<String> s1=genericDriver.getWindowHandles();//store each window id in set collection
    	Iterator<String> t1=s1.iterator();
    	String parentWindow=t1.next();//store 0th window id
    	String childWindow=t1.next();
    	genericDriver.switchTo().window(childWindow);
	}

}
