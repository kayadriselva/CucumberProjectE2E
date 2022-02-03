package org.qa.amazon.hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.qa.amazon.base.Browserfactory;
import org.qa.amazon.base.ExcelFileRead;
import org.qa.amazon.base.Propertyinitialization;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class HooksFile extends Browserfactory {
	
	public Propertyinitialization propinit;
	public Properties prop;
	public Browserfactory  browserinit;
	public String testdatafile = "./src/test/resources/TestData.xlsx";
	public ExcelFileRead excelfileread;
	
	
	@Before(order=0)
	public void getproperty()
	{
		propinit= new Propertyinitialization();
		prop = propinit.property_init();
	}
	
	@Before(order=1)
	public void browserlaunch()
	{
		browserinit=new Browserfactory();
		browserinit.browser_init(prop.getProperty("browser"));
		excelfileread= new ExcelFileRead();
		excelfileread.readexcel(testdatafile, prop.getProperty("sheetname"));
	}

	@After(order=0)
	public void teardown()
	{
		driver.quit();
	}
	
	@AfterStep
	public void getScreenshot(Scenario scenario)
	{
		/*if (scenario.isFailed())
		{*/
			String screenshotname = scenario.getName();
			TakesScreenshot tk=(TakesScreenshot)driver;
		byte[] srcpath = tk.getScreenshotAs(OutputType.BYTES);
		scenario.attach(srcpath, "image/png", screenshotname);
		//}
	}

}
