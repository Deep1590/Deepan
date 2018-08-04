package week5.day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class MergeLead extends Annotations 
{
	//RemoteWebDriver driver;
	@Test(groups= {"regression"})
	public void mergeLead() throws InterruptedException

	{

		/*startApp("chrome", "http://leaftaps.com/opentaps");

	WebElement eleUserName = locateElement("id", "username");
	type(eleUserName, "DemoSalesManager");

	WebElement elePassword = locateElement("id","password");
	type(elePassword, "crmsfa");

	WebElement eleLogin = locateElement("class","decorativeSubmit");
	click(eleLogin);

	WebElement eleCrm = locateElement("linktext","CRM/SFA");
	click(eleCrm);*/

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