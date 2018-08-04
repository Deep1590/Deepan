package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
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
	
		
		
		
		
		driver.findElementByXPath("//span[text()='Email']").click();
		
		Thread.sleep(5000);
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("deepan_suresh@yahoo.com");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(5000);
		
		WebElement valueOfLead = driver.findElementByXPath("(//a[@class='linktext'])[6]");
		String leadName=valueOfLead.getText();
		
		System.out.println("Name of the lead is " + leadName);
		
		driver.findElementByXPath("(//a[@class='linktext'])[6]").click();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		    
	    WebElement text = driver.findElementById("sectionHeaderTitle_leads");
	    
	    String title=text.getText();
	    
	    System.out.println(title);

	        if(title.contains("Duplicate Lead"))
	        {
	            System.out.println("Title Matches");
	        }
	        else
	        {
	        	System.out.println("Title does not Matches");
	        }
	        
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		Thread.sleep(5000);
		
		
		  WebElement text1 = driver.findElementById("viewLead_firstName_sp");
		    
		    String title1=text1.getText();
		    
		    System.out.println(title1);

		        if(title1.contains(leadName))
		        {
		            System.out.println("Lead Name Matches");
		        }
		        else
		        {
		        	System.out.println("Lead Name does not Matches");
		        }
		        
		        driver.close();
	}

}
