package Boishak_PageAction;

import org.testng.Assert;

import Boishak_PageLocator.Boishak_CartPageLocator;
import Boishak_Utility.Boishak_Base;

public class Boishak_CartPageAction extends Boishak_Base {

	Boishak_CartPageLocator boishak_CartPageLocator = new Boishak_CartPageLocator();
	public void Verifyuserinboicartpage() throws Exception {
		Thread.sleep(4000);
	boolean CartPageVerification = boishak_CartPageLocator.verifyCartLink.isDisplayed();
		Assert.assertTrue(CartPageVerification); 
		
	}
	
	
}
