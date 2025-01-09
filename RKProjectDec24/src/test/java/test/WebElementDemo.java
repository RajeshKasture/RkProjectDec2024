package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementDemo {

	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);

		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver(option);
		 
		driver.manage().window().maximize();

        System.out.println("Browser launched");
/*		
		driver.get("https://www.google.co.in/");
		
		// Find Element
		WebElement Searchbox = driver.findElement(By.name("q"));
		Searchbox.sendKeys("Selenium" + Keys.ENTER);
		 System.out.println("Searched selenium");
		
//		WebElement Searchbtn =  driver.findElement(By.name("btnK"));
//		Searchbtn.click();
//		 System.out.println("Click on Searchbtn");
		 
//		driver.findElement(By.id(""));
		
		driver.quit();
        System.out.println("Browser Closed");
*/
    	// Find Element
/*		
       driver.get("https://trytestingthis.netlify.app/");
		
    List<WebElement> elements =driver.findElements(By.tagName("select"));
  
   
    for(WebElement element : elements)
    	
    {
    	System.out.println(element.getText());
    }
    
        Thread.sleep(2000);
		driver.quit();
        System.out.println("Browser Closed");
		
		*/
     // Find Element within element
        
 //       driver.get("https://www.google.co.in/");
        
 //       WebElement form = driver.findElement(By.tagName("form"));
  //      form.findElement(By.name("q")).sendKeys("Java" + Keys.ENTER);
        
        
        //Get tagname , text ,css
      
//        WebElement Searchbox= driver.findElement(By.name("q"));
//        System.out.println(Searchbox.getTagName() +  Searchbox.getText()  + Searchbox.getCssValue("color"));
     
        //Check element is enabled & selected
        driver.get("https://the-internet.herokuapp.com/");
        
        driver.findElement(By.partialLinkText("Checkboxes")).click();
       WebElement checkbox= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        
       System.out.println(checkbox.isEnabled());
       System.out.println(checkbox.isSelected());

       
        Thread.sleep(2000);
		driver.quit();
        System.out.println("Browser Closed");
		
	}
}
