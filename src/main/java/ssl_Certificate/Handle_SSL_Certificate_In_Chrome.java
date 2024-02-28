package ssl_Certificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

public class Handle_SSL_Certificate_In_Chrome 
{
	@Test
	public void handle_SSL_Certificate_In_Chrome() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
	//	op.addArguments("--ignore-certificate-errors"); 
	//	op.setAcceptInsecureCerts(true);
		op.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://self-signed.badssl.com");
		
		System.out.println("url opened");
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
	}
}
