package Boishak_PageAction;

import org.testng.Assert;

import Boishak_PageLocator.Boishak_HomePageLocator;
import Boishak_Utility.Boishak_Base;

public class Boishak_HomePageAction extends Boishak_Base{
    
	Boishak_HomePageLocator boishak_HomePageLocator = new Boishak_HomePageLocator();
	
	public void clickBoiLogin() {
		
		boishak_HomePageLocator.boiLoginLink.click();
		
		
	}
	
	public void clickonsignuplink() {
		boishak_HomePageLocator.boiSignupLink.click();	
		
		
		
	}
	public void VerifyboiusercanSignup() throws Exception {
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
       boolean signupsuccess = boishak_HomePageLocator.boiSignupLink.isDisplayed();
		Assert.assertTrue(signupsuccess);
		
	}
	public void clickboicartlink() {
		
		boishak_HomePageLocator.boiCartLink.click();
		
	}
	
	public void clickonboiaboutuslink() throws Exception {
		Thread.sleep(2000);
		boishak_HomePageLocator.boiAboutUsLink.click();
		
		
	}
}
