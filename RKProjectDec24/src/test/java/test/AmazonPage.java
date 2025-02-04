package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPage {
	
static WebDriver driver ;

public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
    System.out.println("Browser launched");
	driver.get("https://www.amazon.in/amazonprime?ref_=nav_cs_primelink_nonmember");
	System.out.println("url hitted");
	 Thread.sleep(10000);
	
	 List<WebElement> list=driver.findElements(By.tagName("a"));
	  System.out.println(list.size());
	 
	  
	 for(int i=0; i<=list.size(); i++) {
	
		 WebElement a = list.get(i);
		  String c=a.getText();
		 System.out.println(c);
		// System.out.println(list.get(i).getAttribute("herf"));
		// System.out.println(list.get(i).getText());
		
		
	 }
	 
	 driver.quit();
	 System.out.println("Browser closed");
}
}

