package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import week6.reporter.Annotations;

public class MyLeadsPage extends Annotations {

	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLeadlink;
	
	public CreateLeadPage ClickLead() {
		click(eleCreateLeadlink);
		return new CreateLeadPage();
	}
}


