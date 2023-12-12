package capstone.ecommerce.tests;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import capstone.ecommerce.utils.ECwrapper;
import capstone.ecommerce.utils.Reports;
import capstone.ecommerce.utils.SeWrappers;

public class SignupTest extends SeWrappers
{
	ECwrapper ec = new ECwrapper();
	Reports report = new Reports();
	
	
	@Parameters({"browser"})
	@Test
	public void signupTest(String browserName)
	{
		try {
			report.setTCDesc("Validating the SignUp Page with Incorrect and Correct Data");
			launchCrossBrowser(browserName,"https://www.bestbuy.com/");
			
			
			
			ec.selection();	
			
			ec.signUp1();
				
		
	      }
		
	
	catch(Exception ex)
	{
		System.out.println("Problem while validating Signup");
		ex.printStackTrace();
	}
	
}
}

