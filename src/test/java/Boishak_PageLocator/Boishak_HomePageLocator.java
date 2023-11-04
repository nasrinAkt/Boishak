package Boishak_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Boishak_Utility.Boishak_Base;

public class Boishak_HomePageLocator extends Boishak_Base {

	
	public Boishak_HomePageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="login2")
	public WebElement boiLoginLink;
	
	@FindBy(id="signin2")
	public WebElement boiSignupLink;
	
	@FindBy(id="cartur")
	public WebElement boiCartLink;
	
	@FindBy(xpath="//a[text()='About us']")
	public WebElement boiAboutUsLink;
}
