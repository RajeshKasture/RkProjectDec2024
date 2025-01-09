package Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import test_Data.TestData;


public class Base{
	TestData td = new TestData();

	WebDriver driver;

	@Test
	public void startup() throws InterruptedException, IOException
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh kasture\\eclipse-workspace\\RKProjectDec24\\Chrome Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get(td.getdataFromProertyFile("url"));
		String originalwindow = driver.getWindowHandle();

		System.out.println("Browser is launched successfully");
		driver.navigate().to("https://www.demoblaze.com/");
		//	System.out.println(driver.getCurrentUrl());
		//	System.out.println(driver.getTitle());

		//	driver.switchTo().newWindow(WindowType.WINDOW);
		//	driver.switchTo().newWindow(WindowType.TAB);
		//	driver.switchTo().window(originalwindow);

		//    driver.manage().window().setSize(new Dimension (1200,1000));
		driver.manage().window().maximize();

/*		Thread.sleep(2000);
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./Screenshots/image1.png"));	
*/
		
/*		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement button=driver.findElement(By.id("login2"));
		js.executeScript("arguments[0].click();", button);
		
		
	*/	
		
		
		
		//driver.close();
		Thread.sleep(2000);
		driver.quit();

	}
	//@Test
	public void Teardown()
	{
		//	driver.close();
		driver.quit();
		System.out.println("Browser is Closed successfully");

	}

	{

	}

}
