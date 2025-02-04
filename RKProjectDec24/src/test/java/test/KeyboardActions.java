package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {
	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		 
		driver.manage().window().maximize();

        System.out.println("Browser launched");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.co.in/");
		
		 WebElement Searchbox= driver.findElement(By.name("q"));
		 Searchbox.sendKeys("Selenium" + Keys.ENTER);
		 
		 Actions act = new Actions(driver);
		 Action keydown= act.keyDown(Keys.CONTROL).sendKeys("a").build();
		 keydown.perform();
		 
		 
		 
		 Thread.sleep(2000);
			driver.quit();
	        System.out.println("Browser CLosed");
		
	}
}
