package Webelements_Interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Interactions_15 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		List <WebElement> elements = driver.findElements(By.xpath("//*[@id=\"form:j_idt111_data\"]/tr[1]/td[1]/li"));
		WebElement To =elements.get(0);
		WebElement From =elements.get(5);
		Actions action = new Actions(driver);
		action.clickAndHold(From).moveToElement(To).release(To).build().perform();
		
	}

}
