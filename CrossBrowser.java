package SeleniumStuffs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {

	public static void main(String[] args) throws Exception {
		String browser = "chrome";
		WebDriver driver = null;
		switch (browser) 
		{
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
			//break;
			throw new Exception("====Invalid Browser====");
		}
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		// If you close the browser the session ID becomes Invalid/ Expired
		System.out.println(driver.getTitle()); //NoSuchSessionException: invalid session id
		

	}

}
