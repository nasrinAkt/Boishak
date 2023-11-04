package Boishak_PageAction;

import org.testng.Assert;

import Boishak_PageLocator.Boishak_ProfilePageLocator;
import Boishak_Utility.Boishak_Base;
import Boishak_Utility.Boishak_Utility;

public class Boishak_ProfilePageAction extends Boishak_Base{
	Boishak_ProfilePageLocator boishak_ProfilePageLocator = new Boishak_ProfilePageLocator();
	
	public void VerifyusercanlooginnSuccessfullyy() throws Exception {
		Thread.sleep(5000);
	boolean profileverification	= boishak_ProfilePageLocator.boiProfile.isDisplayed();
	Assert.assertTrue(profileverification);	
	Boishak_Utility.takeMyScreenshot(driver, "profile page");	
	}
	
	public void clicklogout() {
		
		boishak_ProfilePageLocator.boiLogout.click();
		
	}
	
	
}
