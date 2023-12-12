package capstone.ecommerce.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import capstone.ecommerce.utils.SeWrappers;

public class MenuBrandsPage extends SeWrappers {
	
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
	
	@FindBy(xpath="//button[text()='Checkout']")
	public WebElement chekout; 
	
	@FindBy(xpath="//button[text()='Continue as Guest']")
	public WebElement goguest;
	
	@FindBy(id="user.emailAddress")
	public WebElement usmail;
	
	@FindBy(id="user.phone")
	public WebElement usphone;
	
	@FindBy(xpath="//span[text()='Continue to Payment Information']")
	public WebElement pay;
	
	@FindBy(xpath="//span[text()='Request failed because of network connection']")
	public WebElement resp;
	

	
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
				clickElement(pop);
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
	
	public void checkOut()
	{
		waitForElement(chekout,20);
		clickElement(chekout);
		
	}
	
	public void gotoguest()
	{
		waitForElement(goguest,20);
		clickElement(goguest);
		javascriptExecutorEndContent();
	}

	public void mailid(String ema)
	{
		waitForElement(usmail,20);
		typeText(usmail,ema);
	}
	
	public void passid(String pwd)
	{
		waitForElement(usphone,20);
		typeText(usphone,pwd);
	}
	
	public void clicguest()
	{
		
		waitForElement(pay,20);
		clickElement(pay);
		javascriptExecutorStartingContent();
		
	}
	
	public void message()
	{
		waitForElement(resp,20);
		if(resp.getText().contains("failed"))
		{
			System.out.println("Problem in Payment submission");
		}
	}
	
	public void accexit()
	{
		closeAllBrowsers();
		
	}
}

