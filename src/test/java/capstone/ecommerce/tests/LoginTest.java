package capstone.ecommerce.tests;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import capstone.ecommerce.utils.ECwrapper;
import capstone.ecommerce.utils.Reports;
import capstone.ecommerce.utils.SeWrappers;

public class LoginTest extends SeWrappers {
	
	ECwrapper ec = new ECwrapper();
	Reports report = new Reports();
	
	
	@Parameters({"browser"})
	@Test	
	public void signupTest1(String browserName)
	{
		try {
			report.setTCDesc("Validating the Login Page with Valid and InValid Data ");
			launchCrossBrowser(browserName,"https://www.bestbuy.com/");			    
			
			
			
			ec.login1();
			ec.login2();
						
		}	
		
	      
		
catch(Exception ex)
{
	System.out.println("Problem while validating Signup and Login");
	ex.printStackTrace();
}
	
}
}

