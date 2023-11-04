package Boishak_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Boishak_Base {

	public static WebDriver driver;
	public static Properties Boipro;
	public Boishak_Base() {
	try {
		FileInputStream boiFle	= new FileInputStream(System.getProperty("user.dir")+("//src/test//java//Boishak_Config//Boishak_Config.Properties" ));
		    Boipro = new Properties();
			Boipro.load(boiFle);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Please,look the code");
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void BoiBrowser() {
	String BoiAllBrowser = Boipro.getProperty("BoiBrowser1");
	
	if(BoiAllBrowser.equalsIgnoreCase("Chrome")) {
		   System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+("//Boishak_ChromeDriver//chromedriver.exe"));
		   ChromeOptions opp = new ChromeOptions();
		   opp.addArguments("--remote-allow-origins=*"); 
		   driver = new ChromeDriver();
		   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Boishak_Utility.pageLoadTimeout));
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Boishak_Utility.implicitlyWait));
		   driver.manage().window().maximize();	
		
		
	}
	else if(BoiAllBrowser.equalsIgnoreCase("Edge")) {
		 System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+("//Boishak_EdgeDriver//msedgedriver.exe"));
		   EdgeOptions opp1 = new EdgeOptions();
		   opp1.addArguments("--remote-allow-origins=*"); 
		   driver = new EdgeDriver();
		   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Boishak_Utility.pageLoadTimeout));
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Boishak_Utility.implicitlyWait));
		   driver.manage().window().maximize();	
	
	}
	
	}
	public static void BoiLaubchURL(String URL) {
		
		driver.get(Boipro.getProperty("BoiURL"));
		
	}
	
}
