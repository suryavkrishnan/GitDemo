package StepDefenitions;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import PageObject.LandingPage;
import Utils.TextContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObject.OffersPage;
import PageObject.pageFactory;

public class OfferPageStepDef {
	
	public String offerpageProductName;
	 TextContextSetup textObj3;
	 pageFactory pageFactoryObj;
	 
	public OfferPageStepDef(TextContextSetup textObj2)
	{
		this.textObj3=textObj2;
	}
	

	 @Then("^user searched for (.+) in offers page$")
	    public void user_searched_for_in_offers_page(String shortName) throws Throwable {
    	SwitchToOffersPage();
    	OffersPage offerPageObj=textObj3.pageFactoryObj.getOfferPageObj();
    	offerPageObj.searchItem(shortName);
    	Thread.sleep(2000);
    	offerpageProductName=offerPageObj.getTextsearchItem();
    	System.out.println("offerpageProductName====="+offerpageProductName);
    }
    
    public void SwitchToOffersPage()
    {  System.out.println("i am in offer page ---------------------");
    	//if alrdy in offer page ski[ this code
//    	if(textObj3.driver.getCurrentUrl().equals("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
//    	{System.out.println("i am in offer page ---------------------");
//    	}
    	
 
		LandingPage landingPageObj=textObj3.pageFactoryObj.getLandingPageObj();
		landingPageObj.clickOntopDeals();
		textObj3.genericUtilObj.switchToChildWindow();
		
    	
    }
    
    
    @And("^validate product name in offers page matches with Landing Page$")
    public void validate_product_name_in_offers_page_matches_with_landing_page() throws Throwable {
    	System.out.println("landingpageProductName====="+textObj3.landingpageProductName);
    	Assert.assertEquals(textObj3.landingpageProductName, offerpageProductName);
    }


}
