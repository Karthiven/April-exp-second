package Pf;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.basetwo;

public class Amsignpass extends basetwo{
	
	

	public Amsignpass( ) 
	{
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="ap_password")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement inbut;
	
	public WebElement getpass()
	{
		return password;
	}
	
	public WebElement getinbut()
	{
		return inbut;
	}

	

}
