package capstone.ecommerce.tests;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import capstone.ecommerce.utils.ECwrapper;
import capstone.ecommerce.utils.Reports;
import capstone.ecommerce.utils.SeWrappers;

public class ShopByDeptTest extends SeWrappers{
	

	ECwrapper ec = new ECwrapper();
	Reports report = new Reports();
	
	
	@Parameters({"browser"})
	@Test	
	public void deptshop(String browserName)
	{
		try {
			report.setTCDesc("Validating the Shop By Department Menu ");
			launchCrossBrowser(browserName,"https://www.bestbuy.com/");			    
			
			
			
			ec.shopByDept();
			
						
		}	
		
	      
		
catch(Exception ex)
{
	System.out.println("Problem while validating Shop By Department Menu");
	ex.printStackTrace();
}
	
	}


}

