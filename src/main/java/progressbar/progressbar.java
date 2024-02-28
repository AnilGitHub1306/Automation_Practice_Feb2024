package progressbar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class progressbar 
{
	public void progressbar ()
	{
	System.setProperty("webdriver.chrome.driver",  "./driver/chromedriver.exe");
			
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();	
	driver.get("https://demoqa.com/progress-bar");	
			
	JavascriptExecutor js = (JavascriptExecutor) driver;
			
	WebElement startbutton = driver.findElement(By.xpath("//button[@id='startStopButton']"));
			
	js.executeScript("arguments[0].scrollIntoView();", startbutton);
	startbutton.click();
			
			// Wait for the progress bar to complete or reach a specific state
	WebDriverWait wait =new WebDriverWait(driver,20); // Set the timeout as per your requirement
	       
	WebElement progressBarEle = driver.findElement(By.id("progressBar"));
	js.executeScript("arguments[0].scrollIntoView();", progressBarEle); 
wait.until(ExpectedConditions.attributeToBe(progressBarEle, "value", 100));
	
	        
	        // Continue with further actions after the progress bar is complete
	WebElement result = driver.findElement(By.id("result"));
	System.out.println("Progress bar completed. Result: " + result.getText());
	        
	        // Close the browser
	driver.quit();		
	}
	

}
