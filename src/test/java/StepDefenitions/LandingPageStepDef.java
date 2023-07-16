package StepDefenitions;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Utils.TextContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObject.LandingPage;
import PageObject.pageFactory;

public class LandingPageStepDef {
	
	//public WebDriver driver;
	//public String landingpageProductName;
	//public String offerpageProductName;
	TextContextSetup textObj;
	 LandingPage landingPageObj;
	public LandingPageStepDef(TextContextSetup textObj2)
	{
		this.textObj=textObj2;
		this.landingPageObj=textObj.pageFactoryObj.getLandingPageObj();
	}
	

   
	    
	@Given("^User is on GreenCart Landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
		 System.out.println("This is cloned project I made some chnages------5------");
		 System.out.println("This is cloned project I made some chnages------6------");
		Assert.assertTrue(landingPageObj.getTitleofPage().contains("GreenKart"));
       
    }

	 @When("^user searched with Shortname (.+) and extracted actual name of product$")
	    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws Throwable
	 {
		 
		 landingPageObj.searchItem(shortName);
		
	       Thread.sleep(1000);
	       System.out.println("search item "+landingPageObj.getTextsearchItem());
	       textObj.landingpageProductName= landingPageObj.getProductName().split("-")[0].trim();
	       System.out.println("landingpageProductName====="+textObj.landingpageProductName);
	 }
	 @Then("^select quantity as (.+) for the item and add into the cart$")
	    public void select_quantity_as_for_the_item_and_add_into_the_cart(int quantiy) throws Throwable 
	   {
		 landingPageObj.clickOnIncreament(quantiy);
		 landingPageObj.addOntoCart();
	    }
    
   
}
