package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import commonFunctions.Basecls;

public class HomePage extends Basecls{
	WebDriver driver;
	By desktop=By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[1]/a");
	By cart=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input");
	By addtocart=By.id("add-to-cart-button-72");
	By shoppingcartlink=By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");
	By chckout=By.id("checkout");
	By agree=By.xpath("//*[@id=\"termsofservice\"]");
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public void click() {
	  driver.findElement(desktop).click();
	}
	  public void cartclick() {
		driver.findElement(cart).click();
		driver.findElement(addtocart).click();
	}
	  public void shopcart() {
		  driver.navigate().refresh();
		  driver.findElement(shoppingcartlink).click();
	  }
	  public void checkout() {
		  driver.findElement(chckout).click();
		  
	  }
	  public void termsandcondtns()
	  {
		  driver.findElement(agree).click();
	  }

}
