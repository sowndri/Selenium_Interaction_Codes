package SeleniumStuffs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtils {
	WebDriver driver = null;

	/**
	 * This method is used for initialsing the browser
	 * 
	 * @param browser
	 * @return the webdriver
	 * @throws Exception
	 */
	public WebDriver InitialiseDriver(String browser) throws Exception {

		System.out.println("The browser name is:" + browser);
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "default":
			System.out.println("Please enter the correct browser.....");
			// break;
			throw new Exception("====Invalid Browser====");
		}
		return driver; // change the void to WebDriver. bcz it returns driver
	}

	/**
	 * This method is used to launch the specified url and validating https
	 * 
	 * @param url
	 * @throws Exception
	 */
	public void launchURL(String url) throws Exception {
		if (url.indexOf("http") != 0) {
			throw new Exception("http(s) not not found");
		}

		driver.get(url);
	}

	public void pagetitle() {
		String title = driver.getTitle();
		System.out.println("The page title will be:" + title);
		

	}
}
