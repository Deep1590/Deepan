package week6.day2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import week6.reporter.Annotations;



public class CreateLeadNeg extends Annotations  {
	
	@BeforeTest
	public void setValues() {
		 excelFileName = "createleadNeg";
		 testName="createLead";
		 testDesc="Create a lead";
		 category="sanity";
		 author="Deepan";
		 moduleName="Leads";
	}

	@Test(dataProvider="fetchData")
	
	public void createLead(String company,String fName,String lName,String errmsg) {
		
		//Login signon=new Login();
		
		//signon.login();
		
		new MyHomePage()
		.ClickCRM()
		.ClickLead()
		.EnterCompany(company)
		.EnterFirstName(fName)
		.EnterLastName(lName)
		.SubmitPageforNegative(errmsg);
		
		
		
		
		
	}
	
		
	}



