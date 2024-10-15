package Webelements_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Interactions_11 {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		
		// Performing Drag and drop using mouse action:
		
		WebElement From = driver.findElement(By.id("form:drag_content"));
		WebElement To = driver.findElement(By.id("form:drop_header"));
		
		Actions action = new Actions (driver);
		//action.clickAndHold(From).moveToElement(To).release(To).build().perform();
		
		action.dragAndDrop(From, To).build().perform();
		
		
	}

}
