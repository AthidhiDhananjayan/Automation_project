package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonFunctions.Basecls;

public class AddressandLogoutPage extends Basecls{
	WebDriver driver;
By emailid=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
By adress=By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[2]/a");
By delete=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/input[2]");
By logout=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
public AddressandLogoutPage(WebDriver driver) {
	this.driver=driver;
}
public void click()  {
	driver.findElement(emailid).click();
	driver.findElement(adress).click();
	driver.findElement(delete).click();
	driver.switchTo().alert().accept();
	driver.navigate().back();
	driver.findElement(logout).click();
}



}