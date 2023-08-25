package stepDefination;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.InventoryPage;
import utility.World;

public class InventoryStep {
	
	public InventoryPage ip;
	public World world;
	
	public InventoryStep(World world) {
		this.world =world;
		this.ip=world.po.getInventoryPage();
	}
	

@When("I click on add to cartbutton for backpack")
public void i_click_on_add_to_cartbutton_for_backpack() {
   ip.clickOnBackPack();
}
@When("I click on add to cartbutton for bike light")
public void i_click_on_add_to_cartbutton_for_bike_light() {
   ip.clickOnBikeLight();
}

@When("I click on add to cartbutton for bolt t-shirt")
public void i_click_on_add_to_cartbutton_for_bolt_t_shirt() {
    ip.clickOnBoltTshirt();
}

@When("I click on add to cartbutton for flees jacket")
public void i_click_on_add_to_cartbutton_for_flees_jacket() {
   ip.clickOnFleeceJacket();
}

@When("I click on add to cartbutton for onesie")
public void i_click_on_add_to_cartbutton_for_onesie() {
    ip.clickOnOnesie();
}

@When("I click on add to cartbutton for red t-shirt")
public void i_click_on_add_to_cartbutton_for_red_t_shirt() {
    ip.clickOnredTshirt();
}


@Then("I verify button appears on backpack  with {string} tag")
public void i_verify_button_appears_on_backpack_with_tag(String string) {
	Assert.assertEquals(ip.getTextOnBackPackBtn(), string);
}

@Then("I verify button appears on bike light  with {string} tag")
public void i_verify_button_appears_on_bike_light_with_tag(String string) {
	Assert.assertEquals(ip.getTextOnBikeLightBtn(), string);
   
}

@Then("I verify button appears on bolt t-shirt  with {string} tag")
public void i_verify_button_appears_on_bolt_t_shirt_with_tag(String string) {
	Assert.assertEquals(ip.getTextBoltTshirtBtn(), string);
}

@Then("I verify button appears on flees jacket  with {string} tag")
public void i_verify_button_appears_on_flees_jacket_with_tag(String string) {
	Assert.assertEquals(ip.getTextFleeceJacketBtn(), string);
}

@Then("I verify button appears on onesie  with {string} tag")
public void i_verify_button_appears_on_onesie_with_tag(String string) {
	Assert.assertEquals(ip.getTextOnesieBtn(), string);
}

@Then("I verify button appears on red t-shirt  with {string} tag")
public void i_verify_button_appears_on_red_t_shirt_with_tag(String string) {
	Assert.assertEquals(ip.getTextRedTshirtBtn(), string);
}


}
