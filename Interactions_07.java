package Webelements_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactions_07 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		
		// Handling with radio buttons
		
		WebElement Default = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[1]"));
		Boolean status =Default.isSelected();
		System.out.println(status);
		
		WebElement agegroup = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/div"));
		agegroup.click();
		
	}

}
