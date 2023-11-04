package Boishak_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Boishak_Utility.Boishak_Base;

public class Boishak_AboutUsPageLocator extends Boishak_Base {


	public Boishak_AboutUsPageLocator() {
		
	
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="videoModalLabel")
	public WebElement verifyboiAboutUspage;
	
}
