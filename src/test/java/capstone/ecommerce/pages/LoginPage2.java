package capstone.ecommerce.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import capstone.ecommerce.utils.SeWrappers;

public class LoginPage2 extends SeWrappers {
	
	
	
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
	
	@FindBy(xpath="//div[text()='Sorry, something went wrong. Please try again.']")
	public WebElement signinErr;
	
	@FindBy(xpath="//a[text()='Return to previous page']")
	public WebElement returnPage2;
	
	
	
	
	public void logAcc()
	{
		waitForElement(account1,20);
		actionsMoveToElement(account1);
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
		//div[text()='Sorry, something went wrong. Please try again.']
		
	}
	public void errorSignin()
	{
		String str1 = signinErr.getText();
		if(str1.equals("Sorry, something went wrong. Please try again."));
		{
			System.out.println("While clicking SignIn button error Message Pop's Up even Though corect Credentials are entered");
		}
				
	}
	
	public void returnToPage2()
	{
		waitForElement(returnPage2,20);
		clickElement(returnPage2);
		closeAllBrowsers();
		
	}
}
