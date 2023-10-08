package pageObject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonFunctions.Basecls;

public class RegistrationPage extends Basecls{
	WebDriver driver;
	By radiobutton=By.id("gender-female");
	By regfirstname=By.id("FirstName");
	By reglastname=By.id("LastName");
	By email=By.id("Email");
	By passwrd=By.id("Password");
	By cnfrmpswrd=By.id("ConfirmPassword");
	By regbutton=By.id("register-button");
	By reglink=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}
	public void setvalues(String firstname,String lastname,String emailid,String password,String confirmpassword) {
		driver.findElement(regfirstname).sendKeys(firstname);
		driver.findElement(reglastname).sendKeys(lastname);
		driver.findElement(email).sendKeys(emailid);
		driver.findElement(passwrd).sendKeys(password);
		driver.findElement(cnfrmpswrd).sendKeys(confirmpassword);
	}
	
public void Registrationlink() {
	driver.findElement(reglink).click();
	}
public void RegistrationandradioButton() {
	driver.findElement(regbutton).click();
	driver.findElement(radiobutton).click();
}
}
