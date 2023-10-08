package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import commonFunctions.Basecls;

public class CheckoutPage extends Basecls {
	WebDriver driver;
	By newaddrs=By.id("billing-address-select");
	By cmpny=By.id("BillingNewAddress_Company");
	By country1=By.id("BillingNewAddress_CountryId");
	By city2=By.ByXPath.id("BillingNewAddress_City");
	By adrss1=By.id("BillingNewAddress_Address1");
	//By adrss2=By.id("BillingNewAddress.Address2");
	By zip=By.id("BillingNewAddress_ZipPostalCode");
	By ph=By.id("BillingNewAddress_PhoneNumber");
	By fax=By.id("BillingNewAddress_FaxNumber");
	By cntnue=By.xpath("//*[@id=\"billing-buttons-container\"]/input");
	By cntnue2=By.xpath("//*[@id=\"billing-buttons-container\"]/input");
	By cntnue3=By.xpath("//*[@id=\"shipping-buttons-container\"]/input");
	By cntnue4=By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input");
	By cntnue5=By.xpath("//*[@id=\"payment-method-buttons-container\"]/input");
	By cntnue6=By.xpath("//*[@id=\"payment-info-buttons-container\"]/input");
	By cnfirm=By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input");
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
public void setvalues(String company,String country,String city,String adress1,String zipcode,String phno,String faxno  ) {
	driver.findElement(cmpny).sendKeys(company);
	driver.findElement(country1).sendKeys(country);
	driver.findElement(city2).sendKeys(city);
	WebElement add = driver.findElement(adrss1);
	add.sendKeys("Kizhi");
	Actions act=new Actions(driver);
	act.keyDown(add,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	act.keyDown(add,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	act.keyDown(add,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	act.perform();
	//driver.findElement(adrss2);
	driver.findElement(zip).sendKeys(zipcode);
	driver.findElement(ph).sendKeys(phno);
	driver.findElement(fax).sendKeys(faxno);;
}
public void dropdown() {
	WebElement newadd = driver.findElement(newaddrs);
	newadd.click();
	Select dp=new Select(newadd);
	dp.selectByIndex(1);
}
public void click() {
	
	driver.findElement(cntnue).click();
	
	JavascriptExecutor jd=(JavascriptExecutor)driver;
	jd.executeScript("window.scrollBy(0,500)");
	driver.findElement(cntnue2).click();
	JavascriptExecutor jf=(JavascriptExecutor)driver;
	jf.executeScript("window.scrollBy(0,500)");
	driver.findElement(cntnue3).click();
	JavascriptExecutor jp=(JavascriptExecutor)driver;
	jp.executeScript("window.scrollBy(0,500)");
	JavascriptExecutor jo=(JavascriptExecutor)driver;
	jo.executeScript("window.scrollBy(0,500)");
	driver.findElement(cntnue4).click();
	JavascriptExecutor jh=(JavascriptExecutor)driver;
	jh.executeScript("window.scrollBy(0,500)");
	driver.findElement(cntnue5).click();
	JavascriptExecutor jk=(JavascriptExecutor)driver;
	jk.executeScript("window.scrollBy(0,500)");
	driver.findElement(cntnue6).click();
	JavascriptExecutor jr=(JavascriptExecutor)driver;
	jr.executeScript("window.scrollBy(0,7000)");
	driver.findElement(cnfirm).click();
	
	
}










}
