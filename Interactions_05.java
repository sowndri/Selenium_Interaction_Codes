package Webelements_Interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Interactions_05 {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		
		WebElement dropdown1=driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
 
		// Select class and object creation for drop down
		Select select = new Select(dropdown1);
		select.selectByIndex(0);
		select.selectByVisibleText("Puppeteer");
		
		//Using Send keys we can perform drop down actions
		
		WebElement dropdown2 = driver.findElement(By.id("j_idt87:country"));
		dropdown2.sendKeys("India");
		
		//To choose multiple options in the list
		WebElement listofCourses = driver.findElement(By.id("j_idt87:auto-complete_input"));
		Select sel = new Select(listofCourses);
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		
		
	}
	

}
