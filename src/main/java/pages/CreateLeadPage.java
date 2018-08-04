package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import week6.reporter.Annotations;

public class CreateLeadPage extends Annotations {

	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "createLeadForm_companyName")
	WebElement elecompanyName;

	@FindBy(id = "createLeadForm_firstName")
	WebElement elefirstName;

	@FindBy(id = "createLeadForm_lastName")
	WebElement elelastName;

	@FindBy(name = "submitButton")
	WebElement eleSubmit;
	
	@FindBy(className="errorList")
	WebElement eleError;
	
	public CreateLeadPage EnterCompany(String company) {
		type(elecompanyName, company);
		return this;
	}

	public CreateLeadPage EnterFirstName(String fName) {
		type(elefirstName, fName);
		return this;
	}

	public CreateLeadPage EnterLastName(String lName) {
		type(elelastName, lName);
		return this;
	}

	public ViewLeadPage SubmitPage() {
		click(eleSubmit);
		return new ViewLeadPage();
	}

	public CreateLeadPage SubmitPageforNegative(String errmsg) {
		click(eleSubmit);		
		verifyExactText(eleError, errmsg);
		return this;
	}
	
	
}
