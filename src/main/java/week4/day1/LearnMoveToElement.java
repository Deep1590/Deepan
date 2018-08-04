package week4.day1;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import wdMethods.SeMethods;

public class LearnMoveToElement extends SeMethods{
	


	@Test
	public  void moveToElement() {
		// TODO Auto-generated method stub
		
		startApp("chrome", "https://www.flipkart.com/");
		
		WebElement eleclose = locateElement("xpath","//button[text()='✕']");
		eleclose.click();
		
		WebElement eleAppliances = locateElement("xpath", "//span[text()='TVs & Appliances']");
		WebElement eleThomson = locateElement("xpath", "//span[text()='Thomson']");
		
		mousehover(eleAppliances,eleThomson);
	}

}
