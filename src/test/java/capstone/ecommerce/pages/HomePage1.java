package capstone.ecommerce.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;



import capstone.ecommerce.utils.SeWrappers;

public class HomePage1 extends SeWrappers {
	
	@FindBy(xpath="//h4[text()='United States']")
	public WebElement country;	
	
	@FindBy(xpath="//div[@class='bottom-fluid-container ']")
	public WebElement links;
	
	@FindBy(xpath="//a[text()='Holiday Deals']")
	public WebElement holy;
	
	
	@FindBy(xpath="//a[text()='Top Deals']")
	public WebElement tdeal;
	
	@FindBy(xpath="//a[text()='Deal of the Day']")
	public WebElement dotd;
	
	@FindBy(xpath="//a[text()='My Best Buy Memberships']")
	public WebElement memb;
	
	@FindBy(xpath="//a[text()='Credit Cards']")
	public WebElement cc;
	
	@FindBy(xpath="//a[text()='Gift Cards']")
	public WebElement gc;
	
	@FindBy(xpath="//a[text()='Gift Ideas']")
	public WebElement gi;
		
	
	public void ctrySel()
	{
		waitForElement(country,20);
		clickElement(country);
	}
	
	
	public void allLinks()
	{
		waitForElement(holy,20);
       List<WebElement> allTitles = driver.findElements(By.xpath("//div[@class='bottom-fluid-container ']"));
		
		
		for(int i = 0; i<allTitles.size();i++)
		{
			
			
			System.out.println("The Home Page Link Titles are : "+allTitles.get(i).getText());
			
			
		}
		
	}
	
	
	public void hdeals()
	{
		waitForElement(holy,20);
		clickElement(holy);
		Assert.assertTrue(driver.getTitle().equals("Sales and Promotions at Best Buy: On Sale Electronics, Coupons and Promo Codes"));
		System.out.println("Assertion Passed and the Title is =>"+driver.getTitle());
				
	}
	
	
	
	public void tdeals()
	{
		waitForElement(tdeal,20);
		clickElement(tdeal);
		Assert.assertTrue(driver.getTitle().equals("Top Deals and Featured Offers on Electronics - Best Buy"));
		System.out.println("Assertion Passed and the Title is =>"+driver.getTitle());
				
	}
	
	public void dod()
	{
		waitForElement(dotd,20);
		clickElement(dotd);
		Assert.assertTrue(driver.getTitle().equals("Deal of the Day: Electronics Deals - Best Buy"));
		System.out.println("Assertion Passed and the Title is =>"+driver.getTitle());
				
	}
	
	public void mbbm()
	{
		waitForElement(memb,20);
		clickElement(memb);
		Assert.assertTrue(driver.getTitle().equals("My Best Buy Memberships"));
		System.out.println("Assertion Passed and the Title is =>"+driver.getTitle());
				
	}
	
	public void crecard()
	{
		waitForElement(cc,20);
		clickElement(cc);
		Assert.assertTrue(driver.getTitle().equals("Best Buy Credit Card: Rewards & Financing"));
		System.out.println("Assertion Passed and the Title is =>"+driver.getTitle());
				
	}
	
	public void gifcard()
	{
		waitForElement(gc,20);
		clickElement(gc);
		Assert.assertTrue(driver.getTitle().equals("Gifts Cards and E-Gift Cards - Best Buy"));
		System.out.println("Assertion Passed and the Title is =>"+driver.getTitle());
				
	}
	
	public void gifIdea()
	{
		waitForElement(gi,20);
		clickElement(gi);
		
	}
	
	
	}

