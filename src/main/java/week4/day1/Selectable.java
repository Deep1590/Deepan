package week4.day1;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Selectable extends SeMethods {

	@Test
	
	public void Draggable()
	{
		startApp("chrome", "http://jqueryui.com/sortable/");
		
		
		WebElement eleframe = locateElement("xpath","//iframe[@class='demo-frame']");
		switchToFrame(eleframe);
		
		WebElement Source=locateElement("xpath","//ul[@id='sortable']/li[1]");
		
		
		WebElement Destination=locateElement("xpath","//ul[@id='sortable']/li[4]");
		
		
		draganddrag(Source,Destination);
	}
}