package week5.day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class CreateLead extends Annotations {

	@Test(groups= {"smoke"})
	public void createLead() {
		
		//Login signon=new Login();
		
		//signon.login();
		
		
		WebElement elelink=locateElement("linktext", "CRM/SFA");
		click(elelink);
	
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
