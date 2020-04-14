package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PageFactory.Acti_Login;
import Pf.Amsignemail;
import Pf.Amsignpass;
import Utility.Properties;
import Utility.Wait;

public class basetwo { 
	
	public static WebDriver driver=null;
	Amsignemail empage;
	Amsignpass pwpage;
	
	
	
	public void Acti_Setup() throws IOException, InterruptedException
	{
		
		Properties prop=new Properties("Envirnoment");
		
		
		
		if(prop.getdata("env").equals("chrome"))
		{
			
		ChromeOptions option=new ChromeOptions();
		option.addArguments("start-maximized");
		option.addArguments("disable-infobars");
		System.setProperty( "webdriver.chrome.driver",prop.getdata("chromedriver"));
		driver=new ChromeDriver(option);
		Thread.sleep(3000);
		
		}
		
		else if(prop.getdata("env").equals("Firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", prop.getdata("firefoxdriver"));
			driver=new FirefoxDriver();	
			
		}
		Thread.sleep(2000);
		
	}
	
	
	@BeforeMethod
	public void Launch() throws IOException, InterruptedException
	{
		
		Acti_Setup();
		
		Properties prop=new Properties("data2");
		driver.get(prop.getdata("url"));
	
		
		 empage= new Amsignemail();
		 empage.getemail().sendKeys(prop.getdata("username"));
		 empage.getbut().click();
		 
		 pwpage=new Amsignpass();
		 pwpage.getpass().sendKeys(prop.getdata("password"));
		 pwpage.getinbut().click();
		 
		 
		
		

	}
	
	
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	



}
