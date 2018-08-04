package testcase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import wdMethods.SeMethods;

public class MergeLead extends SeMethods 
{
	RemoteWebDriver driver;
@Test
public void mreateLead() throws InterruptedException

{

	startApp("firefox", "http://leaftaps.com/opentaps");
	
	WebElement eleUserName = locateElement("id", "username");
	type(eleUserName, "DemoSalesManager");
	
	WebElement elePassword = locateElement("id","password");
	type(elePassword, "crmsfa");
	
	WebElement eleLogin = locateElement("class","decorativeSubmit");
	click(eleLogin);
	
	WebElement eleCrm = locateElement("linktext","CRM/SFA");
	click(eleCrm);
	
	WebElement eleLeads = locateElement("linktext", "Leads");
	click(eleLeads);
	
	WebElement eleMergeLeads = locateElement("linktext", "Merge Leads");
	click(eleMergeLeads);
	
	WebElement eleFromlead=locateElement("xpath","(//img[@alt='Lookup'])[1]");
	click(eleFromlead);
	
	Thread.sleep(5000);
	
	switchToWindow(0);
	
	Thread.sleep(5000);
	
	
	WebElement eleId=locateElement("name","id");
	type(eleId,"11047");
	
}

}