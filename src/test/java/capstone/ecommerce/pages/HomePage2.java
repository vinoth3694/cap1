package capstone.ecommerce.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;



import capstone.ecommerce.utils.SeWrappers;

public class HomePage2 extends SeWrappers {
	
	/* @FindBy(xpath="//h4[text()='United States']")
	public WebElement country;
	
	@FindBy(xpath="//span[text()='North Anchorage (Tikahtnu Commons)']")
	public WebElement confirm;  */
	
	@FindBy(xpath="//span[text()='More']")
	public WebElement mor;
	
	@FindBy(xpath="//a[text()='Yes, Best Buy Sells That']")
	public WebElement yes;
	
	@FindBy(xpath="//span[text()='More']")
	public WebElement mor1;
	
	@FindBy(xpath="//a[text()='Donate to St. Jude']")
	public WebElement donate;
	
	@FindBy(xpath="//span[text()='More']")
	public WebElement mor2;
	
	@FindBy(xpath="//a[text()='Best Buy Outlet']")
	public WebElement bbo;
	
	@FindBy(xpath="//a[text()='Best Buy Business']")
	public WebElement bbb;
	
	@FindBy(xpath="//span[text()='More']")
	public WebElement mor3;
	
	
	
	
	
	
	
/*	public void ctrySel()
	{
		waitForElement(country,20);
		clickElement(country);
	}
	
	public void greatdeals()
	{
		waitForElement(confirm,20);
		
		String str = confirm.getText();
		
		if(str.equals("North Anchorage (Tikahtnu Commons)"));
		{
			System.out.println("Condition Satisfied");
		} 					
		
	}
	*/
	
	public void moreclic()
	{
		//waitForElement(mor,40);
		actionsDoubleClick(mor);
						
	}
	
	public void morecli1()
	{
		//waitForElement(yes,40);
		actionsDoubleClick(yes);
		Assert.assertTrue(driver.getTitle().equals("Yes, Best Buy Sells That – Best Buy"));
		System.out.println("Assertion Passed and the Title is =>"+driver.getTitle());
				
	}
	
	public void moreclic1()
	{
		//waitForElement(mor1,40);
		actionsDoubleClick(mor1);
						
	}
	
	public void morecli2()
	{
		//waitForElement(donate,40);
		actionsDoubleClick(donate);
		Assert.assertTrue(driver.getTitle().equals("St. Jude Children's Research Hospital - Best Buy"));
		System.out.println("Assertion Passed and the Title is =>"+driver.getTitle());
				
	}
	
	public void moreclic2()
	{
		//waitForElement(mor2,40);
		actionsDoubleClick(mor2);
						
	}
	
	public void morecli3()
	{
		//waitForElement(bbo,40);
		actionsDoubleClick(bbo);
		Assert.assertTrue(driver.getTitle().equals("Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy"));
		System.out.println("Assertion Passed and the Title is =>"+driver.getTitle());
				
	}
	
	public void moreclic3()
	{
		//waitForElement(mor3,30);
		actionsDoubleClick(mor3);
						
	}
	
	public void morecli4()
	{
		//waitForElement(bbb,30);
		actionsDoubleClick(bbb);
		Assert.assertTrue(driver.getTitle().equals("Best Buy for Business - Best Buy"));
		System.out.println("Assertion Passed and the Title is =>"+driver.getTitle());
				
	}
	
		
	public void closBrow1()
	{		
		closeAllBrowsers();
		
	}
	
	
	
	}

