package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	private WebDriver driver;
	
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By basketContainer = By.xpath("//*[@id='shopping_cart_container']");
	//By checkout = By.xpath("//*[@id=['checkout']");
	By checkout =By.cssSelector("#checkout");

	
	public void clickOnBasketContainer() {
		driver.findElement(basketContainer).click();
	}
	
	public String basketpagepageurl() {
		String s1="https://www.saucedemo.com/cart.html";
		return s1;
	}
	
	public String validateBasketpageurl() {
		return driver.getCurrentUrl();
	}
	
	public void clickOnCheckoutBtn() {
		driver.findElement(checkout).click();
	}
	
}
