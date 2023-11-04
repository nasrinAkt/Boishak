package Boishak_StepDefinition;

import Boishak_PageAction.Boishak_AboutUsPageAction;
import Boishak_PageAction.Boishak_HomePageAction;
import Boishak_Utility.Boishak_Base;
import cucumber.api.java.en.Then;

public class Boishak_AboutUs extends Boishak_Base {
	
	Boishak_HomePageAction boishak_HomePageAction = new Boishak_HomePageAction();
	Boishak_AboutUsPageAction Boishak_AboutUsPageAction = new Boishak_AboutUsPageAction();
	
@Then("^click on boi about us link$")
public void click_on_boi_about_us_link() throws Throwable {
	boishak_HomePageAction.clickonboiaboutuslink();
	
}

@Then("^Verify User can watch video on about us page$")
public void verify_User_can_watch_video_on_about_us_page() throws Throwable {
	Boishak_AboutUsPageAction.VerifyUsercanwatchvideoonaboutuspage();  
}


	
	
	
	
	
}
