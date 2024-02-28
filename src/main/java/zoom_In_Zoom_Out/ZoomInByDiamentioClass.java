package zoom_In_Zoom_Out;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZoomInByDiamentioClass 
{
	@Test
	public void zoomInByDiamentioClass()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/accordian");
		
		Dimension d = new Dimension(150,150);
		driver.manage().window().setSize(d)
	}
}
