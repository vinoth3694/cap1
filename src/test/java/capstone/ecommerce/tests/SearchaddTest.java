package capstone.ecommerce.tests;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import capstone.ecommerce.utils.ECwrapper;
import capstone.ecommerce.utils.Reports;
import capstone.ecommerce.utils.SeWrappers;

public class SearchaddTest extends SeWrappers {


	ECwrapper ec = new ECwrapper();
	Reports report = new Reports();
	
	
	@Parameters({"browser"})
	@Test	
	public void seachandAdd(String browserName)
	{
		try {
			report.setTCDesc("Validating the Shop By search the product and add it ");
			launchCrossBrowser(browserName,"https://www.bestbuy.com/");			    
			
			
			
			ec.searchAdd();
			
						
		}	
		
	      
		
catch(Exception ex)
{
	System.out.println("Problem while validating search bar");
	ex.printStackTrace();
}
	
	}


}
