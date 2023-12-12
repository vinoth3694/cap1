package capstone.ecommerce.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import capstone.ecommerce.utils.SeWrappers;

public class LoginPage1 extends SeWrappers {
	
	@FindBy(xpath="//h4[text()='United States']")
	public WebElement country;
	
	@FindBy(xpath="//span[text()='North Anchorage (Tikahtnu Commons)']")
	public WebElement confirm;
	
	@FindBy(xpath="//button[@class='c-close-icon']")
	public WebElement pop;
	
	@FindBy(xpath="//span[text()='Account']")
	public WebElement account1;
	
	@FindBy(xpath="//a[text()='Sign In']")
	public WebElement button2;
	
	@FindBy(id="fld-e")
	public WebElement mail1;
	
	@FindBy(id="fld-p1")
	public WebElement pass2;
	
	@FindBy(xpath="//button[text()='Sign In']")
	public WebElement button3;
	
	@FindBy(xpath="//a[text()='Return to previous page']")
	public WebElement returnPage;
	
	
	public void ctrySel()
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
	
	
	public void popup()
	{
		try
		{
		waitForElement(pop,20);
		clickElement(pop);
		}
		catch(Exception ex)
		{
			System.out.println("PopUp Button Not Shown This time");
			ex.printStackTrace();
		}
	}
	
	public void logAcc()
	{
		waitForElement(account1,20);
		clickElement(account1);		
			
	}
	
	public void signinAcc()
	{
		waitForElement(button2,20);
		clickElement(button2);
	}
	
	public void mailid(String ema)
	{
		waitForElement(mail1,20);
		typeText(mail1,ema);
	}

	public void passid(String pwd)
	{
		waitForElement(pass2,20);
		typeText(pass2,pwd);
	}
	
	public void accSignin()
	{
		waitForElement(button3,20);
		clickElement(button3);	
		
	}
	
	public void returnToPage()
	{
		waitForElement(returnPage,20);
		clickElement(returnPage);
	}

}

