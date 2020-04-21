package Pf;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.basetwo;
import Utility.Properties;

public class Amsignemail extends basetwo{
	
	
	


	public Amsignemail( ) 
	{
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(id="ap_email")
	private WebElement email;
	
	@FindBy(id="continue")
	private WebElement continuebutton;
	
	
	
	
	public WebElement getemail()
	{
		return email;
	}
	
	public WebElement getbut()
	{
		return continuebutton;
	}
	
	public void setemail(String usname) throws IOException
	{
		email.sendKeys(usname);
	}
	


}
