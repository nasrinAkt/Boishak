package Boishak_PageAction;


import Boishak_PageLocator.Boishak_LoginPageLocator;
import Boishak_Utility.Boishak_Base;

public class Boishak_LoginPageAction extends Boishak_Base {
	
	Boishak_LoginPageLocator boishak_LoginPageLocator = new Boishak_LoginPageLocator();

	public void TypeusernamepasswordclickLogin(String u,String p) throws InterruptedException {
		Thread.sleep(6000);
		boishak_LoginPageLocator.boiUserName.sendKeys(u);
		boishak_LoginPageLocator.boiPassword.sendKeys(p);
		boishak_LoginPageLocator.boiLoginButton.click();
	}
	
}
