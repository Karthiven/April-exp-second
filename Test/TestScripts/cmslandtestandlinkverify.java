package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.cmsbase;
import Utility.MKD;
import pfcms.homepage;

public class cmslandtestandlinkverify extends cmsbase{
	
	homepage hp;
	
	
	@Test
	public void verifylandingpage()
	{
		
		
		logger=extent.startTest(" verifylandingpage");
		
		
		String acpagetitle="Dashboard ‹ opensourcecms — WordPress";
		String pagetitle=driver.getTitle();
		
		System.out.println(pagetitle);
		
		if(pagetitle.equalsIgnoreCase(acpagetitle))
		{
		Assert.assertEquals(pagetitle, acpagetitle, "wrong page landed on");
		logger.log(LogStatus.PASS,"home page landed on");
		}
		else
		{
			Assert.assertEquals(pagetitle, acpagetitle, "wrong page landed on");
			logger.log(LogStatus.FAIL, "not landed on home page");
		}
		
	
	}
	
	@Test
	public void verifypostlink()
	{
		
		
		logger=extent.startTest(" verify post link");
		
		 hp=new homepage();
		 hp.getpostl().click();
		 doWaitSec(WAIT_SEC_1);
		
		System.out.println("pagetitle");
		
		String acpagetitle="Posts ‹ opensourcecms — WordPress";
		String pagetitle=driver.getTitle();
		
		System.out.println(pagetitle);
		
		if(pagetitle.equalsIgnoreCase(acpagetitle))
		{
		Assert.assertEquals(pagetitle, acpagetitle, "wrong page landed on");
		logger.log(LogStatus.PASS,"post page landed on");
		}
		else
		{
			Assert.assertEquals(pagetitle, acpagetitle, "wrong page landed on");
			logger.log(LogStatus.FAIL, "not landed on post page");
		}
	}
	
	@Test
	public void verifymedialink()
	{
		
		
		logger=extent.startTest(" verify media link");
		
		 hp=new homepage();
		 hp.getmedial().click();
		 doWaitSec(WAIT_SEC_1);
		
		System.out.println("pagetitle");
		
		String acpagetitle="Media Library ‹ opensourcecms — WordPresss";
		String pagetitle=driver.getTitle();
		
		System.out.println(pagetitle);
		
		if(pagetitle.equalsIgnoreCase(acpagetitle))
		{
		Assert.assertEquals(pagetitle, acpagetitle, "wrong page landed on");
		logger.log(LogStatus.PASS,"media page landed on");
		}
		else
		{
			//Assert.assertEquals(pagetitle, acpagetitle, "wrong page landed on");
			logger.log(LogStatus.FAIL, "not landed on media page");
		}
		
		
	}

	
	

}
