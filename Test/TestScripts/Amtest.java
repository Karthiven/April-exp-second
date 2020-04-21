package TestScripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.basetwo;

public class Amtest extends basetwo {

	
	@Test
	public static void m1()
	{
		logger=extent.startTest("first test case execution  starts");
		
		String title=driver.getTitle();
		
		if(title.equals("Your Account"))
		{
		logger.log(LogStatus.PASS, "passed this test case");
		}
		
		else
		{
			logger.log(LogStatus.FAIL,"wrong page landed on");
		}
		
}
	}
