package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import week6.reporter.Annotations;

public class ViewLeadPage extends Annotations {

	public ViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="viewLead_firstName_sp")
	WebElement eleFirstName;
	
	public ViewLeadPage VerifyFirstName() {
		verifyExactText(eleFirstName, "Deep");
		return this;
	}
	
	
}


