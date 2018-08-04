package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver=new ChromeDriver();
		
		
		//to maximize
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps");

		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		List<WebElement> dropDownValue= driver.findElementsByTagName("select");
		
		int size=dropDownValue.size();
		
		System.out.println(size);
		
	
	
		//System.out.println(dropDownValue.get(2).getText());
		
		for (WebElement alloptions : dropDownValue) {

			System.out.println(alloptions.getText());
		}
		
		
	}

}
