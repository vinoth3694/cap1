package capstone.ecommerce.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import capstone.ecommerce.utils.SeWrappers;

public class BottomLinksPage extends SeWrappers{
	
	@FindBy(xpath="//h4[text()='United States']")
	public WebElement country;
	
	@FindBy(xpath="//a[text()='Terms & Conditions']")
	public WebElement terms;
	
	@FindBy(xpath="//h2[text()='Privacy.']")
	public WebElement validate;

	
	public void ctrySel()
	{
		waitForElement(country,20);
		clickElement(country);
		javascriptExecutorEndContent();
	}
	
	public void tercons()
	{
		waitForElement(terms,20);
		clickElement(terms);
		
	}
	
	public void TermconsVali()
	{
		waitForElement(validate,20);
		
		if(validate.getText().equals("Privacy."))
		{
		
		System.out.println("Assertion Passed and the Title is =>"+validate.getText());
		
	}
		
	}
	
	public void exitout()
	{
		closeAllBrowsers();
		
	}
	
}
