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
import PageObject.checkoutPage;
import PageObject.pageFactory;

public class CheckoutPageStepDef {
	


	TextContextSetup textObj;
	 checkoutPage checkoutPageObj;
	 
	public CheckoutPageStepDef(TextContextSetup textObj2)
	{
		this.textObj=textObj2;
		this.checkoutPageObj=textObj.pageFactoryObj.getCheckoutPageObj();
	}
	

	@Then("^user proceeds to chekout and validate the (.+) item in checkout page$")
    public void user_proceeds_to_chekout_and_validate_the_item_in_checkout_page(String name) throws Throwable
	{   
		checkoutPageObj.proceedTochkOut();
		//assignnt to verify the name of item with above name
		 System.out.println("landingpageProductName========"+checkoutPageObj.getItemName());
		 System.out.println("This is cloned project I made some chnages------1------");
		 
		Assert.assertTrue(checkoutPageObj.getItemName().contains("Tomato"));
		//Thread.sleep(1000);
    }

    @And("^verify user has ability to enter promo code and place the order$")
    public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() throws Throwable 
    {
    	
    	Assert.assertTrue(checkoutPageObj.verifyPlaceOrder());
    	Assert.assertTrue(checkoutPageObj.verifyPromo());
    }

       
}
