package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Initialization {

	public static WebDriver start(){
		WebDriver driver=new FirefoxDriver();
		driver.get("");
		return driver;
	}
}
