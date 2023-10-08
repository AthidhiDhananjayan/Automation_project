package commonFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Basecls {
	public WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
 

}
