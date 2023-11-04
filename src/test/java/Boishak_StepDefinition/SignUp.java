package Boishak_StepDefinition;

import Boishak_PageAction.Boishak_HomePageAction;
import Boishak_PageAction.Boishak_SignUpPageAction;
import Boishak_Utility.Boishak_Base;
import cucumber.api.java.en.Then;

public class SignUp extends Boishak_Base {
	Boishak_HomePageAction boishak_HomePageAction = new Boishak_HomePageAction();
	Boishak_SignUpPageAction boishak_SignUpPageAction = new Boishak_SignUpPageAction();
	@Then("^click on signup link$")
	public void click_on_signup_link() throws Throwable {
	
		boishak_HomePageAction.clickonsignuplink();
		
		
		
	}

	@Then("^Enter boi username and Enter password click signup$")
	public void enter_boi_username_and_Enter_password_click_signup() throws Throwable {
		
		boishak_SignUpPageAction.EnterboiusernameandEnterpasswordclicksignup();
	    
	}

	@Then("^Verify boiuser can Signup$")
	public void verify_boiuser_can_Signup() throws Throwable {
		boishak_HomePageAction.VerifyboiusercanSignup();
		
		
	}


}
