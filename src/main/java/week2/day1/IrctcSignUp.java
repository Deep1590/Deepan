package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
ChromeDriver driver=new ChromeDriver();
		
		
		//to maximize
		driver.manage().window().maximize();

		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

		driver.findElementById("userRegistrationForm:userName").sendKeys("Venba92018");
		driver.findElementById("userRegistrationForm:password").sendKeys("Venba@92018");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Venba@92018",Keys.TAB);
		Thread.sleep(5000);
		WebElement security = driver.findElementById("userRegistrationForm:securityQ");
		
		//WebElement security = driver.findElementByClassName("labeltxt");
		
			Select petName=new Select(security);
			petName.selectByIndex(1);
			
			driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Jillu");
			
			driver.findElementById("userRegistrationForm:firstName").sendKeys("Venba");
			
			driver.findElementById("userRegistrationForm:gender:1").click();
			
			driver.findElementById("userRegistrationForm:maritalStatus:1").click();
			
			WebElement date = driver.findElementById("userRegistrationForm:dobDay");
			Select day=new Select(date);
			day.selectByValue("09");
			
			WebElement month = driver.findElementById("userRegistrationForm:dobMonth");
			Select month1=new Select(month);
			month1.selectByIndex(0);
			
			WebElement year = driver.findElementById("userRegistrationForm:dateOfBirth");
			Select year1=new Select(year);
			year1.selectByValue("1990");
			
			WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
			Select job=new Select(occupation);
			job.selectByIndex(6);
			
			WebElement country = driver.findElementById("userRegistrationForm:countries");
			Select nation=new Select(country);
			nation.selectByValue("94");
			
			Thread.sleep(5000);
			
			driver.findElementById("userRegistrationForm:email").sendKeys("Venba@v.com");
				
			driver.findElementById("userRegistrationForm:mobile").sendKeys("9966332255");
			
			WebElement nationality = driver.findElementById("userRegistrationForm:nationalityId");
			Select citizen=new Select(nationality);
			citizen.selectByValue("94");
			
			driver.findElementById("userRegistrationForm:mobile").sendKeys("9966332255");
			
			driver.findElementById("userRegistrationForm:address").sendKeys("Chennai");
			
			
			driver.findElementById("userRegistrationForm:pincode").sendKeys("600063",Keys.TAB);
			
			Thread.sleep(5000);
			
			WebElement city = driver.findElementById("userRegistrationForm:cityName");
			Select city1=new Select(city);
			city1.selectByValue("Kanchipuram");
		
			Thread.sleep(5000);
			
			WebElement postOffice = driver.findElementById("userRegistrationForm:postofficeName");
			Select po=new Select(postOffice);
			po.selectByValue("Old Perungalathur B.O");
			
			driver.findElementById("userRegistrationForm:landline").sendKeys("0444258523");
			
			
			
			
			
			
			
	}

}
