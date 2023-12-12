package capstone.ecommerce.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import capstone.ecommerce.utils.SeWrappers;

public class PaypalPage extends SeWrappers {
	
	@FindBy(xpath="//h4[text()='United States']")
	public WebElement country;
	
	@FindBy(xpath="//button[@class='c-button-unstyled hamburger-menu-button']")
	public WebElement menu; 
	
	@FindBy(xpath="//button[text()='Brands']")
	public WebElement brand; 
	
	@FindBy(xpath="//a[text()='Samsung']")
	public WebElement sams; 
	
	@FindBy(xpath="(//a[text()='Shop now'])[2]")
	public WebElement shop; 
	
	@FindBy(id="survey_invite_no")
	public WebElement pop; 
	
	
	@FindBy(xpath="//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button']")
	public WebElement add; 
	
	@FindBy(xpath="//h2[text()='Protect your headphones']")
	public WebElement cartval; 
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	public WebElement cartgo; 
	
		
	@FindBy(xpath="//button[@class='checkout-buttons__paypal btn v-medium']")
	public WebElement paypal;
	
	@FindBy(xpath="//span[text()='This site can’t be reached']")
	public WebElement validate;
	
	

	
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
	
	public void clicBrand()
	{
		waitForElement(brand,20);
		clickElement(brand);
	}
	
	public void clicSamsung()
	{
		waitForElement(sams,20);
		clickElement(sams);
	}
	
	public void clicShopnow()
	{
		waitForElement(shop,20);
		clickElement(shop);
	}
	
	public void popUps()
	{
		try
		{
			if(pop.isDisplayed())
			{
				waitForElement(pop,20);
				dismissAlert();
			}
			else
			{
				System.out.println("No PopUp's Appeared");
			}
		}
		catch(Exception ex)
		{	
		System.out.println("No PopUp's Appeared");
		ex.printStackTrace();
		}
	
		}
	
	
	public void clicCart()
	{
		waitForElement(add,20);
		clickElement(add);
	}
	
	public void cartVald()
	{
		waitForElement(cartval,20);
		if(cartval.getText().equals("Protect your headphones"))
		{
			System.out.println("Test Passed and the Title is Validated");
		}
	}
	
	public void goCart()
	{
		waitForElement(cartgo,20);
		clickElement(cartgo);
	}
	
	public void checkOutPay()
	{
		waitForElement(paypal,20);
		clickElement(paypal);
	}
	
	public void checkOutValidate()
	{
		//waitForElement(validate,20);
		if(validate.isDisplayed())
		{
			System.out.println("Problem While going to the Payment Page");
		}
		else
		{
			System.out.println("Payment Page Opened");
		}
	}
	
	public void exitPay()
	{
		closeAllBrowsers();
	}
	
	
	
	

	

}

