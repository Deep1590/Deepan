package listeners;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class CreateLead extends Annotations {

	@Test(dataProvider="fetchData")
	
	public void createLead(String company,String fName,String lName) {
		
		//Login signon=new Login();
		
		//signon.login();
		
		
		WebElement elelink=locateElement("linktext", "CRM/SFA");
		click(elelink);
	
		WebElement eleCreateLeadlink = locateElement("linktext","Create Lead1");
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
	
		
		

		WebElement eleSubmit= locateElement("name","submitButton");
		click(eleSubmit);
		
		
		
		
	}
	
	@DataProvider(name="fetchData")
	public Object[][] getdata(){
		
		Object[][] data = new Object[2][3];
		
		data[0][0]="Acc";
		data[0][1]="Dee";
		data[0][2]="CHak";
		
		data[1][0]="Acc1";
		data[1][1]="Acc2";
		data[1][2]="Acc3";
		
		return data;
		
	}
		
	}



