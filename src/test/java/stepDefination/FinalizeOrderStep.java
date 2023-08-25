package stepDefination;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.FinalizeOrderPage;
import utility.World;

public class FinalizeOrderStep {
	
	public FinalizeOrderPage fop;
	public World world;
	
	public FinalizeOrderStep(World world) {
		this.world = world;
		this.fop= world.po.getFinalizeOrderPage();
	}
	
	@When("I click on finish")
	public void i_click_on_finish() {
	   fop.clickOnFinishBtn();
	}

	@Then("I verify finalpage")
	public void i_verify_finalpage() {
	   Assert.assertEquals(fop.finalpageurl(), fop.validateFinalPageurl());
	}

	@Then("I verify {string} text")
	public void i_verify_text(String string) {
	   Assert.assertEquals(fop.finalTextShow(), string);
	}
}
