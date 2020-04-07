package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Acti_createuser_page 
{

	    WebDriver driver;
		public Acti_createuser_page (WebDriver driver)
		{
			this.driver=driver;
			
		}
	
	
		 @FindBy(xpath="//a[@class='content users']//img[@class='sizer']")
		   private WebElement users;
	
		 @FindBy(xpath="//input[@value='Create New User']")
		   private WebElement Create_New_User;
		
		 @FindBy(xpath="//input[contains(@name,'username')]")
		   private WebElement username;
		 
		 @FindBy(xpath="//input[@name='passwordText']")
		   private WebElement password;
	
		 @FindBy(xpath="//input[contains(@name,'passwordTextRetype')]")
		   private WebElement Retype_password;
		 
		 @FindBy(xpath="//select[contains(@name,'active')]")
		   private WebElement Access;
		 
		 @FindBy(xpath="//input[contains(@name,'firstName')]")
		   private WebElement firstname;
		 
		 @FindBy(xpath="//input[contains(@name,'lastName')]")
		   private WebElement lastname;
		 
		 @FindBy(xpath="//input[contains(@name,'middleName')]")
		   private WebElement Middle_intial;
		 
		 @FindBy(xpath="//input[contains(@name,'email')]")
		   private WebElement email_address;
		 
		 @FindBy(xpath="//input[contains(@name,'phone')]")
		   private WebElement phone;
		 
		 @FindBy(xpath="//input[@name='mobile']")
		   private WebElement mobile;
		 
		 
		 @FindBy(xpath="//input[@name='otherContact']")
		   private WebElement othercontact;
		 
		 @FindBy(xpath="//td[@class='formbuttonpane']//input[1]")
		   private WebElement createuser;
	
		 public WebElement users()
			{
				return users;
			}
		 public WebElement Create_New_User()
			{
				return Create_New_User;
			}
		 
		 public WebElement username()
			{
				return username;
			}
		 
		 public WebElement password()
			{
				return password;
			}
		 
		 public WebElement Retype_password()
			{
				return Retype_password;
			}
		 
		 public WebElement Access()
			{
				return Access;
			}
		 
		 public WebElement firstname()
			{
				return firstname;
			}
		 
		 public WebElement lastname()
			{
				return lastname;
			}
		 
		 public WebElement Middle_intial()
			{
				return Middle_intial;
			}
		 
		 public WebElement email_address()
			{
				return email_address;
			}
		 
		 public WebElement phone()
			{
				return phone;
			}
		 
		 public WebElement mobile()
			{
				return mobile;
			}
		 
		 public WebElement othercontact()
			{
				return othercontact;
			}
		 
		 public WebElement createuser()
			{
				return createuser;
			}
		 
}
