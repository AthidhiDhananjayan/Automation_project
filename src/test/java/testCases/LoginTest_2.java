package testCases;


import java.time.Duration;


import org.testng.annotations.Test;

import commonFunctions.Basecls;
import pageObject.LoginPage;

public class LoginTest_2 extends Basecls {
	@Test
	public void test1() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LoginPage lp=new LoginPage(driver);
		lp.LoginLink();
		lp.setvalues("athidhivava@gmail.com", "athidhi@1234");
		lp.LoginButton();
		lp.VerificationandComparison();
		lp.SaveEmail();
	
			}

}
