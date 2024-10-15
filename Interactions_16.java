package Webelements_Interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactions_16 {

	public static void main(String[] args) 
	{
		
		// handling with tables
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/table.xhtml");
		
		List<WebElement> Rows = driver.findElements(By.tagName("tr"));
		int RowCount =Rows.size();
		System.out.println("Total Rows in the table: " +RowCount); 
		
		List<WebElement> Columns = driver.findElements(By.tagName("th"));
		int ColumnCount = Columns.size();
		System.out.println("Total Columns in the table: " +ColumnCount);
		
		WebElement Country =driver.findElement(By.xpath("//*[@id=\"form:j_idt89_data\"]/tr[1]/td[2]/span[3]//following::td[1]"));
		String name = Country.getText();
		System.out.println("The name is: " +name);
	}

}
