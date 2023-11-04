package Boishak_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Boishak_Utility.Boishak_Base;

public class Boishak_CartPageLocator extends Boishak_Base {

public Boishak_CartPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//button[text()='Place Order']")
	public WebElement verifyCartLink;
	
	
	
}
