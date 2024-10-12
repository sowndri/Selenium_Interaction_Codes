package Webelements_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactions_01 {

	public static void main(String[] args)
	{
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).sendKeys("Sowndharya"+Keys.ENTER);//Pressing enter key by concatenation
	
		
	}

}
