package Base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PageFactory.Acti_Login;
import Pf.Amsignemail;
import Pf.Amsignpass;
import Utility.Properties;
import Utility.Wait;

public class basetwo { 
	
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	


    public final static long WAIT_SEC_3 = 3;
    public final static long WAIT_SEC_5 = 5;
    public final static long WAIT_SEC_10 = 10;
    
    
    

	
	public static WebDriver driver=null;
	Amsignemail empage;
	Amsignpass pwpage;
	
	
	public static void doWaitSec(long seconds) {
        try
        {
            Thread.sleep(seconds * 1000);
        } 
        catch (InterruptedException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
        }
    }
	
	
	
	public void Acti_Setup() throws IOException, InterruptedException  //Loading chrome driver setup
	{
		
		Properties prop=new Properties("Envirnoment");
		
		
		
		if(prop.getdata("env").equals("chrome"))
		{
			
		ChromeOptions option=new ChromeOptions();
		option.addArguments("start-maximized");
		option.addArguments("disable-infobars");
		System.setProperty( "webdriver.chrome.driver",prop.getdata("chromedriver"));
		driver=new ChromeDriver(option);
		doWaitSec(WAIT_SEC_3);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
                

		}
		
		else if(prop.getdata("env").equals("Firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", prop.getdata("firefoxdriver"));
			driver=new FirefoxDriver();	
			
		}
		doWaitSec(WAIT_SEC_3);
		
	}
	
	
	@BeforeTest                                                //Report generation setup
	public void startReport()
	{
		extent=new ExtentReports("./Reports/a.html", true);
		
		extent.addSystemInfo("Host Name", "Karthi test").
		addSystemInfo("Environment", "Automation Testing").
		addSystemInfo("User Name ", "First Test");
		
		extent.loadConfig(new File("./extent-config.xml"));
	}
	
	

	
	@BeforeMethod                                                  //Login with un and pwd
	public void Launch() throws IOException, InterruptedException
	{
		
		Acti_Setup(); // setups being loaded
		
		Properties prop=new Properties("data2");
		driver.get(prop.getdata("url"));         // launching url
	
		//enter email and click on continue
		 
		 empage= new Amsignemail();
		 empage.setemail(prop.getdata("username"));  //method written in page to set email
		 empage.getbut().click();
			doWaitSec(WAIT_SEC_3);
		//enter password and click on login 
		 
		 pwpage=new Amsignpass();
		 pwpage.getpass().sendKeys(prop.getdata("password"));  // directly entering pw here
		 pwpage.getinbut().click();
			doWaitSec(WAIT_SEC_3);
		 
		 
	}
	
	
	
	@AfterMethod         //close the browser
	public void close()
	{
		driver.close();
	}
	
	
	@AfterTest          // push the report logs
	public void endreport()
	{
		extent.flush();
	}
	
	



}
