package testCases;

import java.time.Duration;


import org.testng.annotations.Test;

import commonFunctions.Basecls;
import pageObject.RegistrationPage;

public class RegistrationTest_1 extends Basecls {
	
	
	@Test
	public void test1() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		RegistrationPage rp=new RegistrationPage(driver);
		rp.Registrationlink();
		rp.setvalues("Athidhi", "Dhananjayan", "athidhivava@gmail.com", "athidhi@1234", "athidhi@1234");
		rp.RegistrationandradioButton();
		
		
	}

}
