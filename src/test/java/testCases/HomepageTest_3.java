package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunctions.Basecls;
import pageObject.HomePage;
import pageObject.LoginPage;

public class HomepageTest_3 extends Basecls {
	@Test
	public void tests() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		HomePage hp=new HomePage(driver);
		
		 WebElement desktops = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"));
		
		Actions act=new Actions(driver);
		act.moveToElement(desktops).perform();
		hp.click();
		WebElement display = driver.findElement(By.id("products-pagesize"));
		Select dw=new Select(display);
		dw.selectByIndex(0);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		hp.cartclick();
		
		JavascriptExecutor jd=(JavascriptExecutor)driver;
		jd.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		hp.shopcart();
		WebElement country = driver.findElement(By.id("CountryId"));
		Select con=new Select(country);
		con.selectByIndex(3);
		hp.termsandcondtns();
		hp.checkout();
	LoginPage lp=new LoginPage(driver);
			lp.LoginLink();
			lp.setvalues("athidhivava@gmail.com", "athidhi@1234");
			lp.LoginButton();
			System.out.println("This test is completed");

}
}
