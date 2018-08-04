package week6.reporter;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends Annotations  {
	
	@BeforeTest
	public void setValues() {
		 excelFileName = "createlead";
		 testName="createLead";
		 testDesc="Create a lead";
		 category="Lead";
		 author="Deepan";
		 moduleName="Smoke";
	}

	@Test(dataProvider="fetchData")
	
	public void createLead(String company,String fName,String lName) {
		
		//Login signon=new Login();
		
		//signon.login();
		
		
		WebElement elelink=locateElement("linktext", "CRM/SFA");
		click(elelink);
	
		WebElement eleCreateLeadlink = locateElement("linktext","Create Lead");
		click(eleCreateLeadlink);
		
		WebElement elecompanyNametext = locateElement("xpath","//span[contains(text(),'Company Name')]");
		getText(elecompanyNametext);

		WebElement elecompanyName = locateElement("createLeadForm_companyName");
		type(elecompanyName, company);
		
		WebElement elefirstName = locateElement("createLeadForm_firstName");
		type(elefirstName, fName);
		
		WebElement elelastName = locateElement("createLeadForm_lastName");
		type(elelastName, lName);
		
		WebElement eleDropDown=locateElement("name", "dataSourceId");
		click(eleDropDown);
		
		selectDropDownUsingText(eleDropDown, "Conference");
	
		verifyTitle("Create Lead | opentaps CRM");
		

		WebElement eleSubmit= locateElement("name","submitButton");
		click(eleSubmit);
		
		
		
		
	}
	
		
	}



