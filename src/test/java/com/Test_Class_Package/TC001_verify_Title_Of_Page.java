package com.Test_Class_Package;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Base_Class_Package.BaseClass;

public class TC001_verify_Title_Of_Page extends BaseClass
{
	@Test
	public  void VeifyTitleOfPage() 
	{
	test= extent.createTest("VeifyTitleOfThePage");
	String actualTitle = driver.getTitle();
	log.info("Actual Title of the page - "+actualTitle);
	
	String expectedTitle = "Google";
	Assert.assertEquals(actualTitle, expectedTitle);
	
	log.info("actualTitle and expected title are not match");

	}
}
