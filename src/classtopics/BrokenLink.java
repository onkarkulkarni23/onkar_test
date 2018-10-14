package classtopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrokenLink {
	
	@Test
	public void checkURL(){
		WebDriver driver=new FirefoxDriver();
		driver.get("");
		
		List<WebElement> wel=driver.findElements(By.xpath("//a"));
		
		for(WebElement element:wel){
			String href=element.getAttribute("href");
			if(href==""){
				
			}
			
		}
	}

}
