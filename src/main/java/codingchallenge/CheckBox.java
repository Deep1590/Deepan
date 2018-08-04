package codingchallenge;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
ChromeDriver driver=new ChromeDriver();
		
		
		//to maximize
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/checkbox.html");


		WebElement checkbox = driver.findElementByXPath("(//input[@type='checkbox'])[6]");
		
		System.out.println("The checkbox is selection state is - " + checkbox.isSelected());
	}

}
