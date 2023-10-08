package testCases;

import org.testng.annotations.Test;

import commonFunctions.Basecls;
import pageObject.AddressandLogoutPage;
import pageObject.LoginPage;

public class AdrdressandLogoutTest_5 extends Basecls{
	@Test
	public void test1()  {
		
	LoginPage lp=new LoginPage(driver);
	lp.LoginLink();
	lp.setvalues("athidhivava@gmail.com", "athidhi@1234");
	lp.LoginButton();
	AddressandLogoutPage al=new AddressandLogoutPage(driver);
	al.click();
	System.out.println("This test is completed");
	}

}
