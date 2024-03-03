package utiltiypackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static String getSceenShot(WebDriver driver, String imageName) throws IOException
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy & hh-mm-ss");
		String date = sdf.format(d);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String path= System.getProperty("user.dir")+"/screenshot/"+date+imageName+".png";
		File destFile    = new File(path);
		FileHandler.copy(sourceFile, destFile);
		return path;
	}

}
