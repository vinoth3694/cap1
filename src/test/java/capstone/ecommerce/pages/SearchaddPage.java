package capstone.ecommerce.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import capstone.ecommerce.utils.SeWrappers;

public class SearchaddPage extends SeWrappers{
	
	@FindBy(xpath="//h4[text()='United States']")
	public WebElement cntry;
	
	@FindBy(xpath="//input[@class='search-input']")
	public WebElement sear;
	
	@FindBy(xpath="//button[@title='submit search']")
	public WebElement searok;
	
	@FindBy(xpath="(//button[text()='Add to Cart'])[1]")
	public WebElement cart;
	
	@FindBy(xpath="//a[@class='c-button-link go-to-cart']")
	public WebElement cartVal;
	//a[@class='c-button-link go-to-cart']
	
	
	public void ctrySel()
	{
		waitForElement(cntry,20);
		clickElement(cntry);
	}
	
		
	public void searchBr(String text)
	{
		waitForElement(sear,20);
		typeTextwithoutClear(sear,text);
		
	}
	
	public void clicsearch(int scrollDown)
	{
		waitForElement(searok,20);
		clickElement(searok);
		javascriptExecutorScrollVertical(scrollDown);
	}
	
	public void addCart()
	{
		waitForElement(cart,20);
		clickElement(cart);
	}


	public void addCartVal()
	{
		waitForElement(cartVal,20);
		if(cart.getText().contains("cart"))
		{
			System.out.println("Test Passed");
			
			
		}
			}
	
	public void searclose()
	{
	closeAllBrowsers();
	}

}

