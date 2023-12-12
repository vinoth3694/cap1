package capstone.ecommerce.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import capstone.ecommerce.utils.ECwrapper;
import capstone.ecommerce.utils.Reports;
import capstone.ecommerce.utils.SeWrappers;

public class BottonlinksTest extends SeWrappers {
	
	ECwrapper ec = new ECwrapper();
	Reports report = new Reports();
	
	@Parameters({"browser"})
	@Test	
	public void BottLinkTest1(String browserName)
	{
		try {
			report.setTCDesc("Validating the Bottom Links of Home Page and Validate its Title ");
			launchCrossBrowser(browserName,"https://www.bestbuy.com/");			    
			
			
			
			ec.bottompageLink();
			
						
		}	
		
	      
		
catch(Exception ex)
{
	System.out.println("Problem while validating Bottom Links");
	ex.printStackTrace();
}
	
	}

}

