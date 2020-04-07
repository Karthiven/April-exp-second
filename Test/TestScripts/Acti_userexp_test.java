package TestScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseTest;
import PageFactory.Acti_createuser_page;
import PageFactory.Acti_Userexppage;
import Utility.Wait;

public class Acti_userexp_test extends BaseTest {
	
	@Test
	public void usexp() throws InterruptedException
	{
		
		
		Acti_Userexppage usp=PageFactory.initElements(driver, Acti_Userexppage.class);
		Thread.sleep(3000);
		usp.Users().click();
		Wait.implictwait(10);
		usp.createnewuser().click();
	}
	
	

}
