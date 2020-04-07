package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseTest;
import PageFactory.Acti_createcustomer_page;
import PageFactory.Acti_createuser_page;
import Utility.Dataprovider;
import Utility.Wait;
import mapper.CreateUser_Map;


public class Acti_user_test extends BaseTest
{
	@Test(dataProvider="createusers", dataProviderClass=Dataprovider.class)
	public void createcust(CreateUser_Map data) throws EncryptedDocumentException, IOException, InterruptedException
	{
		Acti_createuser_page createuser=PageFactory.initElements(driver, Acti_createuser_page.class);
		createuser.users().click();
		Wait.implictwait(10);
		createuser.Create_New_User().click();
		Wait.implictwait(10);
		createuser.username().sendKeys(data.Username());
		createuser.password().sendKeys(data.Password());
		createuser.Retype_password().sendKeys(data.Password());
		createuser.firstname().sendKeys(data.Firstname());
		createuser.lastname().sendKeys(data.Lastname());
		createuser.Middle_intial().sendKeys(data.Middle_Initial());
		createuser.email_address().sendKeys(data.E_mail_Address());
		createuser.phone().sendKeys(data.Phone());
		createuser.mobile().sendKeys(data.Mobile());
		createuser.othercontact().sendKeys(data.Other_Contact());
		createuser.createuser().click();
		
		
	
		
	}
}
