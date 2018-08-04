package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import week6.reporter.Annotations;

public class MyHomePage extends Annotations {

	public MyHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(linkText="Leads")
	WebElement elelink;
	
	public MyLeadsPage ClickCRM() {
		click(elelink);
		return new MyLeadsPage();
	}*/
	
	public MyLeadsPage ClickCRM() {
		WebElement elelink = locateElement("linkText", prop.getProperty("MyHomePage.leads.link"));
		click(elelink);
		return new MyLeadsPage();
	}

	
}


