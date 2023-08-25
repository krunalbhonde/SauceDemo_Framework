package stepDefination;

import java.io.IOException;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject.LoginPage; // login page Importing
import utility.World;

public class LoginStep {    // STEP 3
	// never even do not use driver step in login step anyhow
	public LoginPage lp ; // login page class
	public World world;  //world class
	
	public LoginStep(World world) {    // construct
		this.world = world;   //
		this.lp = world.po.getLoginPage();
	}
		
	@Given("I enter the login url")
	public void i_enter_the_login_url() throws IOException {
		lp.loginurl();
	}

	@Given("I enter the username and password")
	public void i_enter_the_username_and_password() {
		lp.setUsername();
		lp.setPassword();
	}

	@Then("I click on the login button")
	public void i_click_on_the_login_button() {
	    lp.clickOnLoginBtn();
	}

	@Then("I verify the homepage")   // Whenever @Then or verify present that time use asset 
	public void i_verify_the_homepage() { // Assert is use for exactly match 
	  Assert.assertEquals(lp.homepageurl(), lp.validateHomepageurl());
	}
}
