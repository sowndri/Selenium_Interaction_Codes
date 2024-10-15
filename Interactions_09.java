package Webelements_Interactions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactions_09 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		WebElement button = driver.findElement(By.id("j_idt88:new"));
		button.click();
		String oldwindow = driver.getWindowHandle();// parent window identification method
		
		//When the user click the button, multiple windows are opened , so we need to use getWindowHandles()
		
		Set <String> multiplewindow = driver.getWindowHandles();
		
		for (String newwindow : multiplewindow)
		{
			driver.switchTo().window(newwindow);// Here we are switching the driver to the new window
		}
		driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
		driver.close();
		
		driver.switchTo().window(oldwindow);
		WebElement Multiple = driver.findElement(By.name("j_idt88:j_idt91"));
		Multiple.click();
		int size = driver.getWindowHandles().size();
		System.out.println("The number of windows opened:" +size);
		
		Set <String> handles = driver.getWindowHandles();
		for (String allwindow : handles) 
		{
			if(!allwindow.equals(oldwindow))
			{
				driver.switchTo().window(allwindow);
				driver.close();
			}
		}
	}

}
