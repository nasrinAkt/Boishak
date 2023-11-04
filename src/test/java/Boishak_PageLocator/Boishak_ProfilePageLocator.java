package Boishak_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Boishak_Utility.Boishak_Base;

public class Boishak_ProfilePageLocator extends Boishak_Base {

public Boishak_ProfilePageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="nameofuser")
	public WebElement boiProfile;
	
	@FindBy(id="logout2")
	public WebElement boiLogout;
	
	@FindBy(id="")
	public WebElement u;
	
	
	
}
