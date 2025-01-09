package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	
	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		 
		driver.manage().window().maximize();

        System.out.println("Browser launched");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
        System.out.println("Navigated to url");
        Thread.sleep(3000);
        
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(2000);
        org.openqa.selenium.Alert alert = driver.switchTo().alert();
		
        String text = alert.getText();
        System.out.println(text);

        alert.accept();
        System.out.println("Simple alert handled");
        Thread.sleep(2000);
        
        System.out.println("=================================================");

    	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(2000);
        org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
		
        String text1 = alert1.getText();
        System.out.println(text1);

        alert1.dismiss();
        System.out.println("Confirm alert handled");
        Thread.sleep(2000);
        
        System.out.println("=================================================");

        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(2000);
        org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		
        String text2 = alert2.getText();
        System.out.println(text2);

        alert2.sendKeys("Selenium");
        alert2.accept();
        System.out.println("Prompt alert handled");
        Thread.sleep(2000);
        
        System.out.println("=================================================");

        
        
        driver.quit();
        System.out.println("Window closed");

		
		
	}

}
