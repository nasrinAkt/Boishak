package Boishak_StepDefinition;

import Boishak_PageAction.Boishak_HomePageAction;
import Boishak_PageAction.Boishak_LoginPageAction;
import Boishak_PageAction.Boishak_ProfilePageAction;
import Boishak_Utility.Boishak_Base;
import Boishak_Utility.Boishak_Utility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Boishak_Login extends Boishak_Base {
	Boishak_HomePageAction boishak_HomePageAction = new Boishak_HomePageAction();
	Boishak_LoginPageAction boishak_LoginPageAction = new Boishak_LoginPageAction();
	Boishak_ProfilePageAction boishak_ProfilePageAction = new Boishak_ProfilePageAction();
	
	
	@Given("^Launch <\"([^\"]*)\"> Boi$")
	public void launch_Boi(String URL) throws Throwable {
		BoiLaubchURL(URL);
		Boishak_Utility.takeMyScreenshot(driver, "Home page");
	}

	@Then("^click BoiLogin$")
	public void click_BoiLogin() throws Throwable {
		
		boishak_HomePageAction.clickBoiLogin();
	   
	}

	@Then("^Type username password click Login$")
	public void type_username_password_click_Login() throws Throwable {
		
		boishak_LoginPageAction.TypeusernamepasswordclickLogin(Boipro.getProperty("BoiUserName"),Boipro.getProperty("BoiPassword") );
		
	   
	}

	@Then("^Verify user can looginn Successfullyy$")
	public void verify_user_can_looginn_Successfullyy() throws Throwable {
		
		boishak_ProfilePageAction.VerifyusercanlooginnSuccessfullyy();
	   
	}
	@Then("^click logout$")
	public void click_logout() throws Throwable {
	    
		boishak_ProfilePageAction.clicklogout();
		
	}

}
