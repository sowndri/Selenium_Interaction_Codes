package SeleniumStuffs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
	
/* Get method is not overloaded and accepts only String type
 * To method is overloaded and accepts String and URL type
 * To method is internally calling Get method
 * Hence. there are the difference observed.
 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // To maximize the window
		
		driver.get("https:www.google.com");// Google URL
		
		//driver.manage().window().minimize(); // To minimize the window
		
		Thread.sleep(1500);// wait for 1.5 sec
		
/**Make the driver to navigate from Google to Amazon site */
		driver.navigate().to("https://www.amazon.in"); // Amazon site was navigated
		Thread.sleep(1500);
		
/*** Again navigate to google site*/
		driver.navigate().back(); // Backward Simulation
		Thread.sleep(1500);
		
		driver.navigate().forward(); // Forward Simulation
		Thread.sleep(1200);
		
		
		driver.navigate().refresh(); // Used to refresh the page
/**Whenever the page is refresh, DOM is also Refreshed, which may leads to Stale element exception*/
		
		driver.quit();
		
		
		
		
		

	}

}
