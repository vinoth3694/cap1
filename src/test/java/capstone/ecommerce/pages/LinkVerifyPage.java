package capstone.ecommerce.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import capstone.ecommerce.utils.SeWrappers;

public class LinkVerifyPage extends SeWrappers {
	
	@FindBy(tagName="a")
	public WebElement lk;

	public void linktag(String url)
	 {
		// waitForElement(lk,20);
		
		 verifyUrl(url);
		 
		 
	 }
 
 	public void exitPag()
 	{
 		closeAllBrowsers();
 	}

}

