package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");

		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("ACC");
		driver.findElementById("createLeadForm_firstName").sendKeys("DEEPANS");
		driver.findElementById("createLeadForm_lastName").sendKeys("SEKAR");
		driver.findElementByName("submitButton").click();
	}

}
