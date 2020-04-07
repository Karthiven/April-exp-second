package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_createcustomer_page 
{
	WebDriver driver;

	public Acti_createcustomer_page (WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
   @FindBy(xpath="//a[div[text()='Tasks']]")
   private WebElement task;
   
   @FindBy(xpath="//a[contains(text(),'Projects & Customers')]")
   private WebElement prj_cust;
   
   @FindBy(xpath="//body/div[@id='container']/form[@id='customersProjectsForm']/table[@class='mainContentPadding rightPadding']/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/input[1]")
   private WebElement createcust;
   
   @FindBy(name="name")
    private WebElement name;
   
   @FindBy(name="description")
   private WebElement desc;
   
   @FindBy(xpath="//input[@name='createCustomerSubmit'] ")
   private WebElement createcustbtn;
	
   public WebElement task()
	{
		return task;
	}
	
   public WebElement project_cust()
	{
		return prj_cust;
	}
   
   public WebElement custnewcust()
 	{
 		return createcust;
 	}
   
   public WebElement custname()
	{
		return name;
	}
   
   public WebElement custdesc()
	{
		return desc;
	}
    
   public WebElement createbutton()
  	{
  		return createcustbtn;
  	}
}
