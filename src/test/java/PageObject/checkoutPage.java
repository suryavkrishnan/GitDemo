package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPage {
	
	public WebDriver checkoutPageDriver;
	public checkoutPage(WebDriver driverObj )
	{
		this.checkoutPageDriver=driverObj;
	}
	
	
	
	By cart=By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img");
	By proceedTochkout=By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button");
	
	By promo=By.xpath("//*[@id=\"root\"]/div/div/div/div/div/input");
	By apply=By.xpath("//*[@id=\"root\"]/div/div/div/div/div/button");
	By placeOrder=By.xpath("//*[@id=\"root\"]/div/div/div/div/button");
	By item=By.xpath("//*[@id=\"productCartTables\"]/tbody/tr/td[2]/p");
			
	
	public void  proceedTochkOut() throws InterruptedException 
	{
		checkoutPageDriver.findElement(cart).click();
		checkoutPageDriver.findElement(proceedTochkout).click();
				
	}
	
	public Boolean verifyPromo() throws InterruptedException 
	{
		return checkoutPageDriver.findElement(promo).isDisplayed();
		
				
	}
	public Boolean verifyPlaceOrder() throws InterruptedException 
	{
		return checkoutPageDriver.findElement(placeOrder).isDisplayed();
		
				
	}
	public Boolean verifyApply() throws InterruptedException 
	{
		return checkoutPageDriver.findElement(apply).isDisplayed();
		
				
	}
	public String  getItemName() throws InterruptedException 
	{
		return checkoutPageDriver.findElement(item).getText();
		
				
	}
	
	
	

}
