package capstone.ecommerce.tests;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import capstone.ecommerce.utils.ECwrapper;
import capstone.ecommerce.utils.Reports;
import capstone.ecommerce.utils.SeWrappers;



public class PaypalTest extends SeWrappers{
	
	ECwrapper ec = new ECwrapper();
	Reports report = new Reports();
	
	
	@Parameters({"browser"})
	@Test	
	public void selectbyBrand(String browserName)
	{
		try {
			report.setTCDesc("Validating the Brands");
			launchCrossBrowser(browserName,"https://www.bestbuy.com/");			    
			
			
			
			//ec.searchAdd();
			report.setTCDesc("Validating the Checkout with Valid Credentials");
			ec.paymentusingChecoutPay();
						
		}	
		
		catch(Exception ex)
		{
			System.out.println("Problem while validating Brands Menu");
			ex.printStackTrace();
		}
			
			}
		


}

