package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Elements {
	
	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().minimize();

		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		WebElement Password= driver.findElement(By.name("password"));
		Password.sendKeys("admin123");
		
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(Password)).click();
		
		//driver.findElement(RelativeLocator.with(By.name(null)).toRightOf(Password));
		//WebElement emailLocator = (RelativeLocator.with(By.tagName("input")).above(By.id("password"));
	    //WebElement cancelLocator = (RelativeLocator.with(By.tagName("button")).toLeftOf(By.id("submit"));
		//WebElement submitLocator = (RelativeLocator.with(By.tagName("button")).toRightOf(By.id("cancel"));
		//WebElement emailLocator = (RelativeLocator.with(By.tagName("input")).near(By.id("lbl-email"));
		
		Thread.sleep(3000);
		driver.quit();
	

	}

}
