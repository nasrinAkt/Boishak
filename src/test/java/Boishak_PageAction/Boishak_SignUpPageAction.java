package Boishak_PageAction;

import Boishak_PageLocator.Boishak_SignUpPageLocator;
import Boishak_Utility.Boishak_Base;
import Boishak_Utility.Boishak_TestData;
import Boishak_Utility.Boishak_Utility;

public class Boishak_SignUpPageAction extends Boishak_Base {
	Boishak_SignUpPageLocator boishak_SignUpPageLocator = new Boishak_SignUpPageLocator();
	
	public void EnterboiusernameandEnterpasswordclicksignup() throws Exception {
	     Thread.sleep(6000);
		 boishak_SignUpPageLocator.boiSignupusername.sendKeys(Boishak_TestData.boiusername2);
		 Thread.sleep(3000);
		 boishak_SignUpPageLocator.boiSignuppassword.sendKeys(Boishak_TestData.boipassword2);
		 boishak_SignUpPageLocator.boiSignupButton.click();
		 Boishak_Utility.takeMyScreenshot(driver, "signup page");
		
	}
	
	
	
}
