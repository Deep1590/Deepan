package week4.day1;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class DragAndDrag extends SeMethods {

	@Test
	
	public void Draggable()
	{
		startApp("chrome", "http://jqueryui.com/droppable/");
		
		
		WebElement eleframe = locateElement("xpath","//iframe[@class='demo-frame']");
		switchToFrame(eleframe);
		
		WebElement Source=locateElement("id","draggable");
		WebElement Destination=locateElement("id","droppable");
		
		draganddrag(Source,Destination);
	}
}
