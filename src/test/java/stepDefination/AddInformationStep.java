package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AddInformationPage;
import utility.World;

public class AddInformationStep {
	
	public AddInformationPage ai;
	public World world;
	
	public AddInformationStep(World world) {
		this.world =world;
		this.ai= world.po.getAddInformationPage();
	}
	
	@When("I enter my first name")
	public void i_enter_my_first_name() {
	 ai.setFirstName();  
	}

	@When("I enter my last name")
	public void i_enter_my_last_name() {
	    ai.setLastName();
	}

	@When("I enter my postal code")
	public void i_enter_my_postal_code() {
	    ai.setPostalCode();
	}

	@Then("I click on continue")
	public void i_click_on_continue() {
	   ai.clickOnContinueBtn();
	}
	

}
