package Webelements_Interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactions_14 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		//Using navigate().To
		driver.navigate().to("https://leafground.com/link.xhtml");
		WebElement Dashboard = driver.findElement(By.linkText("Go to Dashboard"));
		Dashboard.click();
		
		// Backward navigation
		driver.navigate().back();
		
		//Usage of partial link text
		WebElement Find = driver.findElement(By.partialLinkText("Find the URL"));
		
		//Finding the link navigation location using get attribute method
		String location = Find.getAttribute("href");
		System.out.println("The link is navigated to:" +location);
		driver.navigate().back();
		
		//Finding the broken link
		WebElement brokenlink = driver.findElement(By.partialLinkText("Broken?"));
		brokenlink.click();
		
		//Page title retrieval
		String title = driver.getTitle();
		if(title.contains("404"))
		{
			System.out.println("The link is broken");
		}
		
		driver.navigate().back();
		
		//Total link present in the page
		List<WebElement> links = driver.findElements(By.partialLinkText("How many links"));
		int totallinks =links.size();
		System.out.println("The total number of links present:" +totallinks);
	}
	

}
