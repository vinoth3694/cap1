package capstone.ecommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import capstone.ecommerce.utils.SeWrappers;

public class ShopdepartPage extends SeWrappers{
	
	@FindBy(xpath="//h4[text()='United States']")
	public WebElement country;
	
	@FindBy(xpath="//button[@class='c-button-unstyled hamburger-menu-button']")
	public WebElement menu; 
	
	@FindBy(xpath="//button[text()='TV & Home Theater']")
	public WebElement movie; 
	
	@FindBy(xpath="//button[text()='TVs by Type']")
	public WebElement byType; 
	
	@FindBy(xpath="//a[text()='4K TVs']")
	public WebElement resolu; 
	
		
	@FindBy(xpath="//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button']")
	public WebElement add; 
	
	@FindBy(xpath="//a[@class='c-button-link go-to-cart']")
	public WebElement val;

	
	@FindBy(xpath="//h1[text()='Your Cart']")
	public WebElement mycart;

	
	public void ctrySel()
	{
		waitForElement(country,20);
		clickElement(country);
	}
	
	
	public void selMenu()
	{
		waitForElement(menu,20);
		clickElement(menu);
	}
	
	public void tvshows()
	{
		waitForElement(movie,20);
		clickElement(movie);
	}
	
	public void selectType()
	{
		waitForElement(byType,20);
		clickElement(byType);
	}
	
	public void printres()
	{
		waitForElement(resolu,20);
		clickElement(resolu);
	}
	

	public void addcart()
	{
		waitForElement(add,20);
		clickElement(add);
		
		
	}
	
	public void addcartVali()
	{
		waitForElement(val,20);
		clickElement(val);
			
	}
	
	public void micart()
	{
		waitForElement(mycart,20);
		if(mycart.getText().equals("Your Cart"))
		{
			System.out.println("Test Passed and the Title is => "+mycart.getText());
		}
		
		
	}
	

	public void exitbrow()
	{
		closeAllBrowsers();
	}
	

}

