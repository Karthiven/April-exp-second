package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import PageFactory.Acti_createcustomer_page;
import PageFactory.Acti_Login;
import Utility.Dataprovider;
import Utility.Excel;
import Utility.Wait;

public class Acti_createcustomer_test extends BaseTest
{
	@Test(dataProvider="createcustomer", dataProviderClass=Dataprovider.class)
	public void createcust(String Customername, String CustomerDescription, String Status) throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		
		System.out.println(Customername+"----->"+CustomerDescription+"---->"+Status);
		
		Acti_createcustomer_page custpage=PageFactory.initElements(driver, Acti_createcustomer_page.class);
		custpage.task().click();
		Wait.implictwait(10);
		custpage.project_cust().click();
		Wait.implictwait(10);
		custpage.custnewcust().click();
		Wait.implictwait(10);
		custpage.custname().sendKeys(Customername);
		custpage.custdesc().sendKeys(CustomerDescription);
		custpage.createbutton().click();
		
		
	}

}
