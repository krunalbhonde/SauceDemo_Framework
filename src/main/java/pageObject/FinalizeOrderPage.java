package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinalizeOrderPage {

	private WebDriver driver;
	

	public  FinalizeOrderPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By finish =By.xpath("//*[@id='finish']");
	By finalText = By.xpath("//*[@class='complete-header']");
	
	public void clickOnFinishBtn() {
		driver.findElement(finish).click();
	}
	
	public String finalpageurl() {
		String s2="https://www.saucedemo.com/checkout-complete.html";
		return s2;
	}
	
	public String validateFinalPageurl() {
		return driver.getCurrentUrl();
	}
	
	public String finalTextShow() {
		System.out.println(driver.findElement(finalText).getText());
		return  driver.findElement(finalText).getText();
	}
}
