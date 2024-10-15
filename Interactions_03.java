package Webelements_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactions_03 {

	public static void main(String[] args)
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");
		driver.findElement(By.name("j_idt88:name")).sendKeys("Sowndharya");
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]")).sendKeys("Test");
		String Valuename=driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		System.out.println("The attribute value is:" +Valuename);
		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		WebElement disability=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		Boolean enablevalue=disability.isEnabled();
		System.out.println("The enable value is"+ enablevalue);
		
		
	}

}
