package PageObject;

import org.openqa.selenium.WebDriver;

public class pageFactory {
	
	public LandingPage landPageObj;
	public OffersPage offerPageObj;
	public checkoutPage checkoutPageObj;
	public WebDriver factoryDriver;
	
	public pageFactory(WebDriver driver)
	{
		this.factoryDriver=driver;
	}
	
	public LandingPage getLandingPageObj()
	{
		 	landPageObj=new LandingPage(factoryDriver);
		 	return landPageObj;
	}
	public OffersPage getOfferPageObj()
	{
	 	offerPageObj=new OffersPage(factoryDriver);
		return offerPageObj;
	}
	public checkoutPage getCheckoutPageObj()
	{
		checkoutPageObj=new checkoutPage(factoryDriver);
		return checkoutPageObj;
	}
}
