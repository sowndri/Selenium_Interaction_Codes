package SeleniumStuffs;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		// Open the browser

		//EdgeDriver driver = new EdgeDriver(); 
		
		//FireFoxDriver driver = new FireFoxDriver();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		// To get the title
		String title = driver.getTitle();
		System.out.println("The title of the page is:" + title);

		// To validate the title
		if (title.equals("Google")) // .equals method is used -->bcz its string type
		{
			System.out.println("Test case is passed");
		} else {
			System.out.println("Test case is failed");
		}
		// Close the browser
		driver.quit();
		
		// After performing quit operations, it will throw Session ID as "Null"
		//Closes the current browser
		System.out.println(driver.getTitle()); //NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?

	}

}
