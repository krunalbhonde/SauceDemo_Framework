package stepDefination;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CheckOutPage;
import utility.World;

public class CheckOutStep {

	public CheckOutPage cp;
	public World world;
	
	public CheckOutStep(World world) {
		this.world =world;
		this.cp =world.po.getCheckOutPage();
	}
	
	@When("I click on the Basket Container")
	public void i_click_on_the_basket_container() {
	 cp.clickOnBasketContainer();  
	}

	@Then("I verify the basket page")
	public void i_verify_the_basket_page() {
	    Assert.assertEquals(cp.basketpagepageurl(), cp.validateBasketpageurl());
	}

	@When("I click on checkout")
	public void i_click_on_checkout() {
	   cp.clickOnCheckoutBtn();
	}
}
