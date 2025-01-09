package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {
	
	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		 
		driver.manage().window().maximize();

        System.out.println("Browser launched");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
/*		
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
	WebElement BoxA = driver.findElement(By.xpath("//li[text()='A']"));
	WebElement BoxD = driver.findElement(By.xpath("//li[text()='D']"));

	Actions act =  new Actions(driver);
	Thread.sleep(2000);
	act.moveToElement(BoxA);
	Thread.sleep(2000);
	act.clickAndHold();
	Thread.sleep(2000);
	act.moveToElement(BoxD);
	Thread.sleep(2000);
	act.release().perform();
	
	Thread.sleep(2000);
	act.doubleClick(BoxA);
	act.build().perform();
	 System.out.println("Double clicked on boxA");
	
	Thread.sleep(2000);
	act.contextClick(BoxD);
	act.build().perform();
    System.out.println("Right clicked on boxD");

    */
		//Drag and drop
		
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		
		WebElement ele1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement ele2 = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions act =  new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(ele1, ele2);
		act.build().perform();
	    System.out.println("drag & droped element");
	    

		
		
	Thread.sleep(2000);
	driver.quit();
    System.out.println("Browser Closed");
		
	}
}
