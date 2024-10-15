package Webelements_Interactions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactions_06 {

	public static void main(String[] args) 
	{
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		
		//1. Simple Alert
		
		WebElement SimpleAlertbutton = driver.findElement(By.id("j_idt88:j_idt91"));
		SimpleAlertbutton.click();
		Alert alert = driver.switchTo().alert(); 
		alert.accept();
		
		//2.Confirm Alert
		WebElement ConfirmAlertbutton = driver.findElement(By.id("j_idt88:j_idt93"));
		ConfirmAlertbutton.click();
		Alert Confirmalert = driver.switchTo().alert();
		Confirmalert.dismiss();
		
		//3. Prompt Alert
		WebElement PromptAlertbutton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[1]"));
		PromptAlertbutton.click();
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("Duckling");
		promptalert.accept();
			
	}

}
