package codingchallenge;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// TODO Auto-generated method stub
		
ChromeDriver driver=new ChromeDriver();
		
		
		//to maximize
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Dropdown.html");

		
			
		

		
		WebElement dropdown = driver.findElementById("dropdown1");
		Select dropdown1=new Select(dropdown);
		
		
		List<WebElement> options = dropdown1.getOptions();
		int size = options.size();
		
		
		dropdown1.selectByIndex(size-1);
		
		
	

	}

}
