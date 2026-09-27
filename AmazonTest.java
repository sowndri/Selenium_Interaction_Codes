package SeleniumStuffs;

/**
 * Calling the methods from BrowserUtils class
 */
public class AmazonTest {

	public static void main(String[] args) throws Exception {
		BrowserUtils obj = new BrowserUtils();
		obj.InitialiseDriver("chrome");
		obj.launchURL("https:www.google.com");
		

	}
	

}
