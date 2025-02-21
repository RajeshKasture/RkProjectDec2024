package javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecuter {

	static WebDriver driver ;
	
	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);

		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver(option); 
		driver.manage().window().maximize();
        System.out.println("Browser launched");
		driver.get("https://www.google.co.in/");
		
	WebElement element =	driver.findElement(By.linkText("//a[text()='Add New Button']"));	
		
		
		
		
		
		
	//	Example 1. JavascriptExecutor in Selenium to refresh the browser window


		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("location.reload()");


	//	Example 2. JavascriptExecutor in Selenium to send text

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("document.getElementByID('element id').value = ‘xyz’;");


	//	Example 3. Generate Alert Pop Window

		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("alert(‘hello world’);");


	//	Example 4. Get InnerText of a Webpage

		JavascriptExecutor js4 = (JavascriptExecutor)driver;
		String Text1 =  js4.executeScript("return document.documentElement.innerText;").toString();


	//	Example 5. Get Title of a WebPage

		JavascriptExecutor js5 = (JavascriptExecutor)driver;
	    String Text2 =  js5.executeScript("return document.title;").toString();


//		Example 6. Scroll Page

		JavascriptExecutor js6 = (JavascriptExecutor)driver;
		 js6.executeScript("window.scrollBy(0,150)");

//			Example 7. Click on Element		 `
		  JavascriptExecutor js7 = (JavascriptExecutor)driver;
	       js7.executeScript("arguments[0].click();", element);

		
		
		
		
	}

}
