package Webelements_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactions_02 {
	
	/**
	 * Partial Link Text can be used when the link undergoes slight changes not often in the applications
	 *Example: It may change as "Contact us"; "Contact Address"; "Contact"
	 */

	public static void main(String[] args)
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/link.xhtml;jsessionid=node0gq9zotw60n1vyekknlb4n31q7145504.node0");
		//driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.findElement(By.partialLinkText("Go to")).click();
	}

}
