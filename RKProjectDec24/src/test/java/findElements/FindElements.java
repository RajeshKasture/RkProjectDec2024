package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {
	 WebDriver driver ;
  @Test
  public void Example() throws InterruptedException {
	  
	  
	  WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();	  
		driver.manage().window().maximize();
	    System.out.println("Browser launched");
		driver.get("https://omayo.blogspot.com/");
		System.out.println("url hitted");
		 Thread.sleep(10000);
		 
		 List<WebElement> elements =driver.findElements(By.xpath("//button"));
		 
		 for(WebElement element : elements)
		 {
			 System.out.println(element.getText());
		 }
		 
		 driver.quit();
		   System.out.println("Browser closed");
	  
  }
  
  
  
}
