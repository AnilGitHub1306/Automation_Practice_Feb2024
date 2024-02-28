package fileDownloadUpLoad;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class fileDownloadInChromeDriver 
{
	@Test
	public void fileDownload() throws Exception
	{
		System.setProperty("webdriver.chrome.driver",  "./driver/chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		String downloadPath = System.getProperty("user.dir");
		HashMap<String , Object> hm = new HashMap<String , Object>();
		hm.put("download.default_directory", downloadPath );
		option.setExperimentalOption("prefs", hm);
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();	
		driver.get("http://omayo.blogspot.com/p/page7.html");
		
		WebElement downloadButton = driver.findElement(By.xpath("//a[text()='ZIP file']"));
		downloadButton.click();
		
		Thread.sleep(10000);
		
		File file = new File(downloadPath+"\\DownloadDemo-master.zip");
		
		if(file.exists())
		{System.out.println("File Downloaded Successfully");}
		
		else
		{{System.out.println("File not Download");}}
	}
}
