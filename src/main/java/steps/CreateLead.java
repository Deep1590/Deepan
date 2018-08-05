package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CreateLead {
	
	public ChromeDriver driver;
@Given("Open the browser")
public void browserLaunch() {	
	 driver=new ChromeDriver();
}
@And("Maximize the window")
public void maximizeWindow() {
	driver.manage().window().maximize();
}

@And("Enter the URL")
public void enterUrl() {
	driver.get("http://leaftaps.com/opentaps");
	
}
@And("ENter the username")
public void enterusername() {

	driver.findElementById("username").sendKeys("demosalesmanager");
}
@And("Enter the password")
public void enterpwd() {

	driver.findElementById("password").sendKeys("crmsfa");
}
@And("Click submit button")
public void clicksubmit() {

driver.findElementByClassName("decorativeSubmit").click();
}
@And("Click CRMSFA")
public void clickCRMSFA() {
	
driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("Click Create Lead")
	public void clickcreatelead() {

	driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter the company name as (.*)")
	public void entercompanyname(String company) {

	driver.findElementById("createLeadForm_companyName").sendKeys(company);
	}
	@And("Enter the first name as (.*)")
	public void enterfirstname(String fname) {
	driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	
	}
	@And("Enter the last name as (.*)")
	public void enterlastname(String lname) {
	driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}
	@When("click on submit button")
	public void clickcreate() {
	driver.findElementByName("submitButton").click();
	}
	@Then("Verify Lead is created")
	public void verifycreate() {
		
	System.out.println("Lead is created");
	}
	
	@But("Verify Lead is not created")
	public void verifynotcreate() {
		
	System.out.println("Lead is not created");
	}
}

