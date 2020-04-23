package pfcms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.cmsbase;

public class unpwpage extends cmsbase{
	
	
	public unpwpage()
	{
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(id="user_login")
	private WebElement un;
	
	@FindBy(id="user_pass")
	private WebElement pwd;
	
	@FindBy(id="wp-submit")
	private WebElement submit;	
	
	
	public  WebElement getun()
	{
		return  un;
	}
	
	
	public  WebElement getpwd()
	{
		return  pwd;
	}	
	
	public  WebElement getsubbuton()
	{
		return  submit;
	}	
}
