package Webelements_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactions_04 {

	public static void main(String[] args)
	{
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/button.xhtml");
		
		//1. Finding the height and Width of the button
		WebElement Sizebutton=driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[2]/div[1]"));
		int Height = Sizebutton.getSize().getHeight();
		int Width= Sizebutton.getSize().getWidth();
		System.out.println("The Height is:"+ Height);
		System.out.println("The Width is:"+ Width);
		
		//2. Find the color of the button
		WebElement colorbutton=driver.findElement(By.id("j_idt88:j_idt100"));
		String color=colorbutton.getCssValue("background-color");
		System.out.println("The color of the button is :" +color);
		
		//3.Find the position of the button
		WebElement ButtonPosition = driver.findElement(By.id("j_idt88:j_idt94"));
		Point xypoint = ButtonPosition.getLocation();
		int Xvalue=xypoint.getX();
		int Yvalue=xypoint.getY();
		System.out.println("X value is :" +Xvalue + "Y value is:" +Yvalue);
		
	}

}
