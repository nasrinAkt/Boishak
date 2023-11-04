package Boishak_TestRunner;





import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Boishak_Utility.Boishak_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/resources/BoishakFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "Boishak_StepDefinition",tags={"@tag,@tag1,@tag2,@tag3"})


public class Boishak_TestRunner extends AbstractTestNGCucumberTests {

  
@BeforeTest
public void boiStartURL() {
	Boishak_Base boi = new Boishak_Base();
	boi.BoiBrowser();
	
	
}

@AfterTest
public static void boiCloseURL() {
	
Boishak_Base boi = new Boishak_Base();
boi.driver.quit();
}
   
}
	
	

