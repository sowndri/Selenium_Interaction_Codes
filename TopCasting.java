package SeleniumStuffs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCasting {

	public static void main(String[] args) {
/*1. Valid top casting but it can be accessed locally*/
		// Here you can only go with Chromedriver
		// ChromeDriver driver = new ChromeDriver();

/* 2. Valid top casting , recommended*/		
		//WebDriver driver= new ChromeDriver();
/* 3.Valid and recommended for remote and cloud activities*/
		//WebDriver driver = new RemoteWebDriver(remoteaddress, capablities);

	}

}
