package Webelements_Interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Interactions_08 
{

		public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		
		//Handling with check boxes
		WebElement Basic = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		Basic.click();
		if(Basic.isSelected());
		{
			Basic.click(); // to de-select , we need to perform click option again.
		}
		
		WebElement Disable = driver.findElement(By.id("j_idt87:j_idt102"));
		Boolean status = Disable.isEnabled();
		System.out.println(status);
	
		
	}

}
