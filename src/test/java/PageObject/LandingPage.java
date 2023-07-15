package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver landPageDriver;
	public LandingPage(WebDriver driverObj )
	{
		this.landPageDriver=driverObj;
	}
	
	By search=By.xpath("//input[@type='search']");
	By productName=By.cssSelector("h4.product-name");
	By landingPage=By.linkText("Top Deals");

	By increment=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/a[2]");
	By addToCart=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button");
	
	
	public String  getTitleofPage()
	{
		return landPageDriver.getTitle();
	}
	
	public void searchItem(String shortName)
	{
		landPageDriver.findElement(search).sendKeys(shortName);
	}
	public String getTextsearchItem()
	{
		return landPageDriver.findElement(search).getText();
	}
	public String getProductName()
	{
		return landPageDriver.findElement(productName).getText();
	}

	public void  clickOntopDeals()
	{System.out.println("i am clicked/////////////");
		landPageDriver.findElement(landingPage).click();
	}
	
	

	public void  clickOnIncreament(int quantity ) throws InterruptedException
	{
		 for(int i=1;i<quantity;i++)
		 {
			 landPageDriver.findElement(increment).click();
			//	Thread.sleep(10000);
		 }
		
	}
	
	public void  addOntoCart() throws InterruptedException 
	{
		
		landPageDriver.findElement(addToCart).click();
			 //Thread.sleep(10000);
				
	}
	
	
}
