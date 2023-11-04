package Boishak_StepDefinition;

import Boishak_PageAction.Boishak_CartPageAction;
import Boishak_PageAction.Boishak_HomePageAction;
import Boishak_Utility.Boishak_Base;
import cucumber.api.java.en.Then;

public class Boishak_Cart extends Boishak_Base {
	
	Boishak_HomePageAction boishak_HomePageAction =new Boishak_HomePageAction ();
	Boishak_CartPageAction boishak_CartPageAction = new Boishak_CartPageAction ();
	
	
	@Then("^click boi cart link$")
	public void click_boi_cart_link() throws Throwable {
		boishak_HomePageAction.clickboicartlink();   
	}

	@Then("^Verify user in boi cart page$")
	public void verify_user_in_boi_cart_page() throws Throwable {
		boishak_CartPageAction.Verifyuserinboicartpage();
	}


	
	
	
}
