package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddInformationPage {
	private WebDriver driver;
	
	public AddInformationPage(WebDriver driver) {
		this.driver =driver;
	}
	
	By firstName = By.xpath("//*[@id='first-name']");
	By lastName = By.xpath("//*[@id='last-name']");
	By postalCode = By.xpath("//*[@id='postal-code']");
	By continueBtn = By.xpath("//*[@id='continue']");
	
	
	public void setFirstName() {
		driver.findElement(firstName).sendKeys("Narendra");
	}
	public void setLastName() {
		driver.findElement(lastName).sendKeys("Modi");
	}
	public void setPostalCode() {
		driver.findElement(postalCode).sendKeys("440028");
	}
	public void clickOnContinueBtn() {
		driver.findElement(continueBtn).click();
	}
	

}
