package Boishak_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Boishak_Utility.Boishak_Base;

public class Boishak_LoginPageLocator extends Boishak_Base{

	public Boishak_LoginPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="loginusername")
	public WebElement boiUserName;
	
	@FindBy(id="loginpassword")
	public WebElement boiPassword;
	
	@FindBy(xpath="//button[text()='Log in']")
	public WebElement boiLoginButton;

}
