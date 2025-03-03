package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpliciteWait {

	 WebDriver driver;
	@Test
	public void waitMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get("https://www.demoblaze.com/");

		System.out.println("Browser is launched successfully");
		
	//	WebElement Movies =driver.findElement(By.xpath("//a[normalize-space()='Movies']"));
		WebElement Home =driver.findElement(By.partialLinkText("Home"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Use Explicit Wait to wait for a specific condition
		wait.until(ExpectedConditions.visibilityOf(Home)); 
		
		driver.quit();
		System.out.println("Bowser closed");
	}

}
