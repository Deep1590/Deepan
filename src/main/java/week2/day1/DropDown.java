package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//to run in background
		/*ChromeOptions option=new ChromeOptions();
		option.setHeadless(true);

		ChromeDriver driver=new ChromeDriver(option);*/

		ChromeDriver driver=new ChromeDriver();
		
		
		//to maximize
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps");

		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("ACC");
		driver.findElementById("createLeadForm_firstName").sendKeys("DEEPANS");
		driver.findElementById("createLeadForm_lastName").sendKeys("SEKAR");
		
		

		WebElement industry =driver.findElementById("createLeadForm_industryEnumId");
		Select insurance=new Select(industry);
		//insurance.selectByValue("IND_INSURANCE");
		
//Getting the size of the list
		List<WebElement> options = insurance.getOptions();
		int size = options.size();
		System.out.println(size);
		
		//To get the last element of the list
		
		insurance.selectByIndex(size-1);
		
		//to print the last option of the list
		System.out.println(options.get(size-1).getText());
		
	
//Printing all the options in the list
		for (WebElement alloptions : options) {

			System.out.println(alloptions.getText());
		}	

		driver.findElementByLinkText("Logout").click();
	}

}
