package Boishak_PageAction;

import org.testng.Assert;

import Boishak_PageLocator.Boishak_AboutUsPageLocator;
import Boishak_Utility.Boishak_Base;
import Boishak_Utility.Boishak_Utility;

public class Boishak_AboutUsPageAction extends Boishak_Base {
	Boishak_AboutUsPageLocator boishak_AboutUsPageLocator = new Boishak_AboutUsPageLocator();
	
	
	
	
	public void VerifyUsercanwatchvideoonaboutuspage() throws Exception {
		Thread.sleep(6000);
	boolean aboutusSuccess = boishak_AboutUsPageLocator.verifyboiAboutUspage.isDisplayed();
	Assert.assertTrue(aboutusSuccess);
	Boishak_Utility.takeMyScreenshot(driver, "about us page");
	}
	
	
}
