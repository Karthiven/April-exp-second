package pfcms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.cmsbase;

public class homepage extends cmsbase {
	
	
	public homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'Posts')]")    
	private WebElement Postl;
	
	@FindBy(xpath="//div[contains(text(),'Media')]")    
	private WebElement medial;
	
	@FindBy(xpath="//div[contains(text(),'Pages')]")    
	private WebElement Pagesl ;
	
	
	public WebElement getpostl()
	{
		return Postl;
	}
	
	public WebElement getmedial()
	{
		return medial;
	}
	
	public WebElement getPagesl()
	{
		return Pagesl;
	}
	

}
