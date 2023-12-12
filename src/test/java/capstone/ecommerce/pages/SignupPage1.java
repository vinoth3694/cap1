package capstone.ecommerce.pages;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import capstone.ecommerce.utils.SeWrappers;

public class SignupPage1 extends SeWrappers {
	
//	@FindBy(tagName="a")
//	public WebElement linkVal;
	
	@FindBy(xpath="//h4[text()='United States']")
	public WebElement country;
	
	@FindBy(xpath="//span[text()='North Anchorage (Tikahtnu Commons)']")
	public WebElement confirm;
	
	@FindBy(xpath="//button[@class='c-close-icon']")
	public WebElement pop;
	
	@FindBy(xpath="//span[text()='Account']")
	public WebElement account;
	
	@FindBy(xpath="//a[text()='Create Account']")
	public WebElement create;
	
	@FindBy(name="firstName")
	public WebElement fname;
	
	@FindBy(name="lastName")
	public WebElement lname;
	
	@FindBy(name="email")
	public WebElement mail;
	
	@FindBy(xpath="//input[@id='fld-p1'] ")
	public WebElement pass1;
	
	@FindBy(id="reenterPassword")
	public WebElement pass2;
	
	@FindBy(id="phone")
	public WebElement mobile;
	
	@FindBy(xpath="//button[@type='submit'] ")
	public WebElement button1;
	
	@FindBy(xpath="//a[text()='Return to previous page']")
	public WebElement returnPage;
	
	
	/*public void linkVerify()
	{
		waitForElement(linkVal,20);
List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			
			verifyLinkActive("https://www.bestbuy.com/");
			
		}
	}
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
    } */

	
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
		waitForElement(pop,20);
		clickElement(pop);
	}
	
	

	public void myAccount() throws InterruptedException 
	{
		
		waitForElement(account,20);	
		Thread.sleep(5000);
		actionsMoveToElement(account);
		clickElement(account);
		
	}
	
	public void createNew()
	{
		waitForElement(create,20);
		clickElement(create);
	}
	
	// Account Creation with Incorrect Credentials
	public void setfname(String fn)
	{
		waitForElement(fname,20);
		typeText(fname,fn);
	}
	
	public void setlname(String ln)
	{
		waitForElement(lname,20);
		typeText(lname,ln);
	}
	
	public void setMail(String em)
	{
		waitForElement(mail,20);
		typeText(mail,em);
	}
	
	public void setpassword(String pass)
	{
		waitForElement(pass1,20);
		typeText(pass1,pass);
	}
	
	public void setRepass(String rpass)
	{
		waitForElement(pass2,20);
		typeText(pass2,rpass);
	}
	
	public void setMobile(String ph)
	{
		waitForElement(mobile,20);
		typeText(mobile,ph);
	}
	
	public void clickAcc()
	{
		waitForElement(button1,20);
		clickElement(button1);
	
	}
	
	public void returnToPage()
	{
		waitForElement(button1,20);
		clickElement(returnPage);
		
	}

	

/*	// Account Creation with Correct Credentials

	public void setfname1(String fn)
	{
		waitForElement(fname,20);
		fname.clear();
		typeText(fname,fn);
	}
	
	public void setlname1(String ln)
	{
		waitForElement(lname,20);
		lname.clear();
		typeText(lname,ln);
	}
	
	public void setMail1(String em)
	{
		waitForElement(mail,20);
		mail.clear();
		typeText(mail,em);
	}
	
	public void setpassword1(String pass)
	{
		waitForElement(pass1,20);
		typeText(pass1,pass);
	}
	
	public void setRepass1(String rpass)
	{
		waitForElement(pass2,20);
		pass2.clear();
		typeText(pass2,rpass);
	}
	
	public void setMobile1(String ph)
	{
		waitForElement(mobile,20);
		mobile.clear();
		typeText(mobile,ph);
	}
	
	public void clickAcc1()
	{
		waitForElement(button1,20);
		button1.clear();
		clickElement(button1);
		closeAllBrowsers();
	}


*/



}

