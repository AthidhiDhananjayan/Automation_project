package pageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import commonFunctions.Basecls;

public class LoginPage extends Basecls {
	WebDriver driver;
	By loginlink=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	By email=By.id("Email");
	By passwrd=By.id("Password");
	By loginbuttn=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By emailid=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	By radiobutton=By.id("gender-female");
	By save=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/form/div[3]/input");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public void setvalues(String emailid,String password) {
	driver.findElement(email).sendKeys(emailid);	
	driver.findElement(passwrd).sendKeys(password);
	}
public void LoginLink() {
	driver.findElement(loginlink).click();
}
public void LoginButton() {
	driver.findElement(loginbuttn).click();
}
public void VerificationandComparison() {
	System.out.println("Verifying the mailid is displayed on homepage when loged in");
	
	  boolean email = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).isDisplayed();
	  String emailid = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
	System.out.println("The emailid is displayed:"+" "+email);
	System.out.println("Email:"+ " "+emailid);
	String expected="athidhivava@gmail.com";
	Assert.assertEquals(expected, emailid);
}
	public void SaveEmail() {
	driver.findElement(emailid).click();
	driver.findElement(radiobutton).click();
	driver.findElement(save).click();
		
	}
	
	 

	

	
}
