package test;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoading {
	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
//		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		option.setPageLoadStrategy(PageLoadStrategy.EAGER);

		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver(option);
		 
		driver.manage().window().maximize();

        System.out.println("Browser launched");
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		 Thread.sleep(2000);
		driver.quit();
        System.out.println("Browser CLosed");

	}
}
