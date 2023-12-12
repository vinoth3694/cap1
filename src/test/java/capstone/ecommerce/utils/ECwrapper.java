package capstone.ecommerce.utils;
import org.openqa.selenium.support.PageFactory;



import capstone.ecommerce.pages.LoginPage1;
import capstone.ecommerce.pages.LoginPage2;
import capstone.ecommerce.pages.MenuBrandsPage;
import capstone.ecommerce.pages.PaypalPage;
import capstone.ecommerce.pages.SearchaddPage;
import capstone.ecommerce.pages.ShopdepartPage;
import capstone.ecommerce.pages.BottomLinksPage;
import capstone.ecommerce.pages.HomePage1;
import capstone.ecommerce.pages.HomePage2;
import capstone.ecommerce.pages.LinkVerifyPage;
import capstone.ecommerce.pages.SignupPage1;
import capstone.ecommerce.pages.SignupPage2;

public class ECwrapper extends SeWrappers
{
	
	public void linkValidation(String url)
	{
		LinkVerifyPage lp = PageFactory.initElements(driver, LinkVerifyPage.class);
		
		lp.linktag(url);
		lp.exitPag();
		
	}
	
	// Account Creation with Invalid Data
	public void selection() throws InterruptedException 
	{
	SignupPage1 sign = PageFactory.initElements(driver, SignupPage1.class);
	
	//sign.linkVerify();
	//sign.verifyLinkActive(null);;
	sign.ctrySel();
	sign.greatdeals();
	
	sign.popup();
	sign.myAccount();
	sign.createNew();
	
	sign.setfname("v@v123");
	sign.setlname("P&a21");
	sign.setMail("vIg1!$%@gmail.com");
	sign.setpassword("123123123");
	sign.setRepass("123123123");
	sign.setMobile("7815124sfvh");
	captureScreenshot("Validation1-Signup");
	sign.clickAcc();
	sign.returnToPage();
	

	
    }
	
	// Account Creation with Valid Data
	public void signUp1() 
	{
		SignupPage2 sign1 = PageFactory.initElements(driver, SignupPage2.class);
		
		
		sign1.myAccount();
		sign1.createNew();
		
		sign1.setfname1("vignesh");
		sign1.setlname1("P");
		sign1.setMail1("vickyphysics1998@gmail.com");
		sign1.setpassword1("@Vignesh1998");
		sign1.setRepass1("@Vignesh1998");
		sign1.setMobile1("7092909386");
		sign1.clickAcc1(1300);
		sign1.signupCheck();
		captureScreenshot("Validation2-Signup");	
		sign1.returnToPage1();
		
		
			
	}
	
	// Account Login with Invalid Data
	public void login1() 
	{
		LoginPage1 log1 = PageFactory.initElements(driver, LoginPage1.class);
		
		log1.ctrySel();
		log1.greatdeals();
	
		log1.popup();		
		
		log1.logAcc();
		log1.signinAcc();
		log1.mailid("Vihhi@mail.com");
		log1.passid("121221");
		log1.accSignin();
		captureScreenshot("Validation3-Login");
		log1.returnToPage();
		
			
	}
	
	// Account Login with Valid Data
	public void login2() 
	{
		LoginPage2 log1 = PageFactory.initElements(driver, LoginPage2.class);
		
		//log1.popup();
		log1.logAcc();
		log1.signinAcc();
		log1.mailid("vickyphysics1998@gmail.com");
		log1.passid("@Vignesh1998");
		log1.accSignin();
		captureScreenshot("Validation4-Login");
		log1.errorSignin();
		log1.returnToPage2();
			
	}
	
	public void homepageLink1()
	{
		HomePage1 mu = PageFactory.initElements(driver, HomePage1.class);
		
		mu.ctrySel();	
		mu.allLinks();
		mu.hdeals();
		
		mu.tdeals();
		mu.dod();
		mu.mbbm();
		mu.crecard();
		mu.gifcard();
		mu.gifIdea();
		
				
		
	}
	
	public void homepageLink2()
	{
		HomePage2 mu1 = PageFactory.initElements(driver, HomePage2.class);
		
		//mu1.ctrySel();
		//mu1.greatdeals();
				
		mu1.moreclic();
		mu1.morecli1();
		mu1.moreclic1();
		mu1.morecli2();
		mu1.moreclic2();
		mu1.morecli3();
		mu1.moreclic3();
		mu1.morecli4();
				
		mu1.closBrow1();
		
		
	}
	
	public void bottompageLink() throws InterruptedException
	{
		BottomLinksPage bot = PageFactory.initElements(driver, BottomLinksPage.class);
		
		bot.ctrySel();
		bot.tercons();
		bot.TermconsVali();
		bot.exitout();
		
		
	}
	
	public void shopByDept() throws InterruptedException
	{
		ShopdepartPage sd = PageFactory.initElements(driver, ShopdepartPage.class);
		
		sd.ctrySel();
		sd.selMenu();
		sd.tvshows();
		sd.selectType();
		sd.printres();
		
		sd.addcart();
		
		sd.addcartVali();
		sd.micart();
		captureScreenshot("Validation5-cart");
		sd.exitbrow();
		
	}
	
	public void searchAdd() 
	{
		SearchaddPage sp = PageFactory.initElements(driver, SearchaddPage.class);
		
		sp.ctrySel();
		sp.searchBr("Asus");
		sp.clicsearch(300);
		sp.addCart();
		captureScreenshot("Validation6");
		sp.addCartVal();
		captureScreenshot("Validation7");
		sp.searclose();
		
		
	}
	
	public void selBrands() 
	{
		MenuBrandsPage mp = PageFactory.initElements(driver, MenuBrandsPage.class);
		
		mp.ctrySel();
		mp.selMenu();
		mp.clicBrand();
		mp.clicSamsung();
		mp.clicShopnow();
		mp.clicCart();
		mp.cartVald();
		captureScreenshot("Validation8-Brands");
		mp.goCart();
		mp.checkOut();
		
		mp.gotoguest();
		mp.mailid("vickyphysics1998@gmail.com");
		mp.passid("8989881998");
		mp.clicguest();
		mp.message();
		captureScreenshot("Validation9-Payment");
		mp.accexit();
		
		
		
	}
	
	public void paymentusingChecoutPay()
	{
	
	PaypalPage mp = PageFactory.initElements(driver, PaypalPage.class);
	

	mp.ctrySel();
	mp.selMenu();
	mp.clicBrand();
	mp.clicSamsung();
	mp.clicShopnow();
	mp.clicCart();
	mp.cartVald();
	captureScreenshot("Validation10-checkout");
	mp.goCart();
	mp.checkOutPay();
	captureScreenshot("Validation11-Paypal");
	mp.checkOutValidate();	
	captureScreenshot("Validation12");
	mp.exitPay();
}

	
	
	
	

}
