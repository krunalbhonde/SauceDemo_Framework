package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

	private WebDriver driver;
	
	public InventoryPage(WebDriver driver) {
		this.driver =driver;
	}
	
	By backPack = By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']");
	By bikeLight = By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light']");
	By boltTshirt = By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
	By fleeceJacket = By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']");
	By onesie = By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']");
	By redTshirt = By.xpath("//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
	
	By removeBackPack = By.xpath("//*[@id='remove-sauce-labs-backpack']");
	By removeBikeLight = By.xpath("//*[@id='remove-sauce-labs-bike-light']"); 
	By removeBoltTshirt= By.xpath("//*[@id='remove-sauce-labs-bolt-t-shirt']"); 
	By removeFleeceJacket = By.xpath("//*[@id='remove-sauce-labs-fleece-jacket']"); 
	By removeOnesie = By.xpath("//*[@id='remove-sauce-labs-onesie']"); 
	By removeRedTshirt = By.xpath("//*[@id='remove-test.allthethings()-t-shirt-(red)']"); 
	
	public void clickOnBackPack() {
		driver.findElement(backPack).click();
	}
	public String getTextOnBackPackBtn() {
		return driver.findElement(removeBackPack).getText();
		
	}
	public void clickOnBikeLight() {
		driver.findElement(bikeLight).click();
		
	}
	public String getTextOnBikeLightBtn() {
		return driver.findElement(removeBikeLight).getText(); 
	}
	public void clickOnBoltTshirt() {
		driver.findElement(boltTshirt).click();
	}
	public String getTextBoltTshirtBtn() {
		return driver.findElement(removeBoltTshirt).getText();
	}
	public void clickOnFleeceJacket() {
		driver.findElement(fleeceJacket).click();
	}
	public String getTextFleeceJacketBtn() {
		return driver.findElement(removeFleeceJacket).getText();
	}
	public void clickOnOnesie() {
		driver.findElement(onesie).click();
		}
	public String getTextOnesieBtn() {
		return driver.findElement(removeOnesie).getText();
	}
	public void clickOnredTshirt() {
		driver.findElement(redTshirt).click();
	}
	public String getTextRedTshirtBtn() {
		return driver.findElement(removeRedTshirt).getText();
	}
}
