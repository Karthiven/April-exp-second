package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Acti_Userexppage {
	
	WebDriver driver;

	public Acti_Userexppage (WebDriver driver)
	{
		this.driver=driver;
		
	}
	@FindBy(xpath="(//img[@class='sizer'])[3]")
	private WebElement user;
	
	@FindBy(xpath="//input[@value='Create New User']")
	private WebElement createnewuser;
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="passwordText")
	private WebElement password;
	
	@FindBy(name="passwordTextRetype")
	private WebElement passwordre;
	
	@FindBy(name="firstName")
	private WebElement firstName;
	
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	@FindBy(name="overtimeTracking")
	private WebElement overtimeTracking;
	
	@FindBy(xpath="//input[@value='   Create User   ']")
	private WebElement createuser;

	
	public WebElement Users()
	{
		return user;
	}
	
	public WebElement createnewuser()
	{
		return createnewuser;
	}
	
	public WebElement username()
	{
		return username;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement passwordre()
	{
		return passwordre;
	}
	
	
	public WebElement firstName()
	{
		return firstName;
	}
	
	public WebElement lastName()
	{
		return lastName;
	}
	public WebElement overtimeTracking()
	{
		return overtimeTracking;
	}
	public WebElement createuser()
	{
		return createuser;
	}
}
