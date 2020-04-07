package TestScripts;

import java.io.File;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WorkReport {
	ExtentReports extent;
	ExtentTest logger;
	
	@BeforeTest
	public void startReport()
	{
		extent=new ExtentReports("./Reports/a.html", true);
		
		extent.addSystemInfo("Host Name", "Karthi test").
		addSystemInfo("Environment", "Automation Testing").
		addSystemInfo("User Name ", "First Test");
		
		extent.loadConfig(new File("./extent-config.xml"));
	}
	
	@Test
	public void testsample()
	{
		logger=extent.startTest("samplete3st starts");
		logger.log(LogStatus.PASS, "passed this test case");
	}
	
	@AfterTest
	public void endreport()
	{
		extent.flush();
	}
	

}
