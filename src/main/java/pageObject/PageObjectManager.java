package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	public CheckOutPage cp;
	public AddInformationPage ai;
	public FinalizeOrderPage fop;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage getLoginPage() {
		lp=new LoginPage(driver);
		return lp;
		
	}
	
	public InventoryPage getInventoryPage() {
		ip = new InventoryPage(driver);
		return ip;
		
	}
	
	public CheckOutPage getCheckOutPage() {
		cp = new CheckOutPage(driver);
		return cp;
	}
	
	public AddInformationPage getAddInformationPage() {
		ai = new AddInformationPage(driver);
		return ai;
	}
	
	public FinalizeOrderPage getFinalizeOrderPage() {
		fop = new FinalizeOrderPage(driver);
		return fop;
	}
	

	

}