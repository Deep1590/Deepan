package week5.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead {
@Test(groups= {"sanity"})
	public void DeleteLead() 
		 throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps");

		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
	
		
		
		
		
		driver.findElementByXPath("//span[text()='Phone']").click();
		
		Thread.sleep(5000);
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9840073724");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(5000);
		
		WebElement valueOfLead = driver.findElementByXPath("(//a[@class='linktext'])[4]");
		String leadName=valueOfLead.getText();
		
		System.out.println("Name of the leadID is " + leadName);
		
		driver.findElementByXPath("(//a[@class='linktext'])[6]").click();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//a[text()='Delete']").click();
		
		Thread.sleep(3000);
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByName("id").sendKeys(leadName);
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		    
	    WebElement text = driver.findElementByClassName("x-paging-info");
	    
	    String title=text.getText();
	    
	    System.out.println("Error message is "+ title);

	        if(title.contains("No records to display"))
	        {
	            System.out.println("Error msg Matches");
	        }
	        else
	        {
	        	System.out.println("Error msg does not Matches");
	        }
	   		        
		        driver.close();
	}

}
