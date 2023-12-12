package capstone.ecommerce.tests;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import capstone.ecommerce.utils.ECwrapper;
import capstone.ecommerce.utils.Reports;
import capstone.ecommerce.utils.SeWrappers;

public class HomeTest1 extends SeWrappers {
	
	ECwrapper ec = new ECwrapper();
	Reports report = new Reports();
	
	
	@Parameters({"browser"})
	@Test	
	public void HomepageLinkTest1(String browserName)
	{
		try {
			report.setTCDesc("Validating the HomePage Links and its Titles ");
			launchCrossBrowser(browserName,"https://www.bestbuy.com/");			    
			
			
			
			ec.homepageLink1();
			ec.homepageLink2();
			
						
		}	
		
	      
		
catch(Exception ex)
{
	System.out.println("Problem while validating HomePage Links");
	ex.printStackTrace();
}
	
	}
}
