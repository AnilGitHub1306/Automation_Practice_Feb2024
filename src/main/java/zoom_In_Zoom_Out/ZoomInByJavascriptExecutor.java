package zoom_In_Zoom_Out;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ZoomInByJavascriptExecutor 
{
	@Test
	public void zoomInByJavascriptExecutor() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("zooming");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("document.body.style.zoom='200%'");
		
	}
}
