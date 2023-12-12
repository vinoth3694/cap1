package capstone.ecommerce.tests;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import capstone.ecommerce.utils.ECwrapper;
import capstone.ecommerce.utils.Reports;
import capstone.ecommerce.utils.SeWrappers;



public class LinkverifyTest extends SeWrappers {
	
ECwrapper ec = new ECwrapper();
	
	Reports report = new Reports();
	
	
	@Parameters({"browser"})
	@Test	
	public void signupTest1(String browserName)
	{
		try {
			report.setTCDesc("Validating the URL to check Links Validity ");
			launchCrossBrowser(browserName,"https://www.bestbuy.com/");			    
			
			
			
			ec.linkValidation("https://www.bestbuy.com/");
						
		}	
		
	      
		
catch(Exception ex)
{
	System.out.println("Problem while validating URL Links");
	ex.printStackTrace();
}
	
}

}

