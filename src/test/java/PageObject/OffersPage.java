package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	
	public WebDriver offerPageDriver;
	public OffersPage(WebDriver driverObj )
	{
		this.offerPageDriver=driverObj;
	}
	
	By search=By.xpath("//input[@type='search']");
	By offerpageProductName=By.cssSelector("tr td:nth-child(1)");
	
	public void searchItem(String shortName)
	{System.out.println("searchItem................"+shortName);
		offerPageDriver.findElement(search).sendKeys(shortName);
	}
	public String getTextsearchItem()
	{
		String searchItem= offerPageDriver.findElement(offerpageProductName).getText();
		
		return searchItem;
	}


}
