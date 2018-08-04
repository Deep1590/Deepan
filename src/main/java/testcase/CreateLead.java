package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class CreateLead extends SeMethods {

	@Test
	public void createLead() {
		
		//Login signon=new Login();
		
		//signon.login();
		
		
		startApp("chrome", "http://leaftaps.com/opentaps");
		
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCrm = locateElement("linktext","CRM/SFA");
		click(eleCrm);
	
		WebElement eleCreateLeadlink = locateElement("linktext","Create Lead");
		click(eleCreateLeadlink);
		
		WebElement elecompanyNametext = locateElement("xpath","//span[contains(text(),'Company Name')]");
		getText(elecompanyNametext);

		WebElement elecompanyName = locateElement("createLeadForm_companyName");
		type(elecompanyName, "Accenture");
		
		WebElement elefirstName = locateElement("createLeadForm_firstName");
		type(elefirstName, "Deepan1");
		
		WebElement elelastName = locateElement("createLeadForm_lastName");
		type(elelastName, "Chakravarthi1");
		
		WebElement eleDropDown=locateElement("name", "dataSourceId");
		click(eleDropDown);
		
		selectDropDownUsingText(eleDropDown, "Conference");
	
		verifyTitle("Create Lead | opentaps CRM");
		

		//WebElement eleSubmit= locateElement("name","submitButton");
		//click(eleSubmit);
		
		
		
		
	}


}
