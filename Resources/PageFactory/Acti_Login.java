package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Acti_Login 
{
	WebDriver driver;
	

	public Acti_Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(name="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pass;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginbtn;
	
	
	public WebElement username()
	{
		return un;
	}
	public WebElement password()
	{
		return pass;
	}
	public WebElement loginbutton()
	{
		return loginbtn;
	}

}
