package Webelements_Interactions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactions_12 {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");
		WebElement downloadbutton = driver.findElement(By.id("j_idt93:j_idt95"));
		downloadbutton.click();
		
		//File Operations - Downloads
		
		File file = new File("C:\\Users\\mailm\\Downloads");
		File[] Totalfiles = file.listFiles();
		
		for (File file2 : Totalfiles) 
		{
			if(file2.getName().equals("TestLeaf Logo"))
			{
				System.out.println("File is downloaded and present");
				break;
			}
		}
		
	}

}
