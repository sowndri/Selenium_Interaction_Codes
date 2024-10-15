package Webelements_Interactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactions_13 {

	public static void main(String[] args) throws Throwable 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");
		WebElement uploadButton =driver.findElement(By.id("j_idt88:j_idt89_label"));
		uploadButton.click();
		
		String FileLocation = ("C:\\Users\\mailm\\Downloads\\TestLeaf Logo.png");
		
		//Clipboard Actions:
		
		StringSelection Location = new StringSelection (FileLocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Location, null);
		
		//Action class is not preferable, Since it is handling with windows
		//Robot class introduce
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
