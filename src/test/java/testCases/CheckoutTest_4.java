package testCases;

import java.time.Duration;
import org.testng.annotations.Test;

import commonFunctions.Basecls;
import pageObject.CheckoutPage;
import pageObject.HomePage;
import pageObject.LoginPage;

public class CheckoutTest_4 extends Basecls {
	@Test
	public void test1() {
		LoginPage lp=new LoginPage(driver);
		lp.LoginLink();
		lp.setvalues("athidhivava@gmail.com", "athidhi@1234");
		lp.LoginButton();
		HomePage hp=new HomePage(driver);
		hp.shopcart();
		hp.termsandcondtns();
		hp.checkout();
		
		
		CheckoutPage cp=new CheckoutPage(driver);
		cp.dropdown();
		cp.setvalues("xyz","India" , "Pkd", "kizhi", "56784", "67853268", "785");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		cp.click();
		System.out.println("This test is completed");
	}

}
