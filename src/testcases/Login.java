package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.Initialization;

public class Login {
	WebDriver driver;

	@BeforeClass
	public void start(){
		driver=Initialization.start();
		
		
	}
	
	@Test
}
