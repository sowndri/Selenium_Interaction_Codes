package Webelements_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactions_10 {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		
		/**
		 * Frames are nothing but html inside the html
		 * Nested Frames.
		 */
		
		driver.switchTo().frame(0);// If it the first frame, then index will be "0"
		WebElement button1 = driver.findElement(By.id("Click")); // Going inside the iFrame, you will see the html page with id, name;
		button1.click();
		
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println("text");
		
		driver.switchTo().defaultContent();// It will be back to original page.
		
		driver.switchTo().frame(3);
		driver.switchTo().frame("frame2"); // If you see the frame name you can provide.
		WebElement button2 = driver.findElement(By.id("Click"));
		button2.click();
	
		
	
		
	}

}
