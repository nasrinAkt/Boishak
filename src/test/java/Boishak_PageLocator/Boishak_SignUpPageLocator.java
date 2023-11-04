package Boishak_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Boishak_Utility.Boishak_Base;

public class Boishak_SignUpPageLocator extends Boishak_Base {

    public Boishak_SignUpPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="sign-username")
	public WebElement boiSignupusername;
	
	@FindBy(id="sign-password")
	public WebElement boiSignuppassword;
	
	@FindBy(xpath="//button[text()='Sign up']")
	public WebElement boiSignupButton;
}
	
	
	
	

