package week5.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class EditLead extends Annotations{
@Test(groups= {"sanity"})
	public  void editLead() throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
	
		/*List<WebElement> lstDrp = driver.findElements(By.name("firstName"));
		lstDrp.get(1).sendKeys("DEEPANS");*/
		
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("DEEPAN");
		
		driver.findElementByXPath("(//td[@class='x-btn-center'])[7]").click();
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		
		Thread.sleep(5000);
		    
	    WebElement text = driver.findElementById("sectionHeaderTitle_leads");
	    
	    String title=text.getText();
	    
	    System.out.println(title);

	        if(title.contains("View Lead"))
	        {
	            System.out.println("Title Matches");
	        }
	        else
	        {
	        	System.out.println("Title does not Matches");
	        }
	        
		driver.findElementByXPath("//a[text()='Edit']").click();
		Thread.sleep(5000);
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("ACC");
		
		driver.findElementByXPath("//input[@name='submitButton']").click();
		Thread.sleep(5000);
		
		  WebElement text1 = driver.findElementById("viewLead_companyName_sp");
		    
		    String title1=text1.getText();
		    
		    System.out.println(title1);

		        if(title1.contains("ACC"))
		        {
		            System.out.println("Company Matches");
		        }
		        else
		        {
		        	System.out.println("COmpany does not Matches");
		        }
		        
		        driver.close();
	
	}

}
