package Base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.launcher.Java13CommandLauncher;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Down;
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
import Utility.MKD;
import Utility.Properties;
import Utility.Wait;
import pfcms.landingpage;
import pfcms.unpwpage;

public class cmsbase { 
	
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	

	public final static long WAIT_SEC_1 = 1;
    public final static long WAIT_SEC_3 = 3;
    public final static long WAIT_SEC_5 = 5;
    public final static long WAIT_SEC_10 = 10;
    
    
    

	
	public static WebDriver driver=null;
	landingpage lp;
	unpwpage unpw;
	
	
	
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
		
		Properties prop=new Properties("cmsdata");
		driver.get(prop.getdata("url"));         // launching url
		
		doWaitSec(WAIT_SEC_3);
		
		((JavascriptExecutor) driver).executeScript("scroll(0, 800)");
		
	    lp=new landingpage();
	    WebElement e= lp.getlogin();
	    doWaitSec(WAIT_SEC_3);
	    
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
	    
		doWaitSec(WAIT_SEC_3);
		lp.getlogin().click();
		doWaitSec(WAIT_SEC_3);
		
		
		 unpw=new unpwpage();
		 unpw.getun().sendKeys(prop.getdata("username"));
		 doWaitSec(WAIT_SEC_1);
		 unpw.getpwd().sendKeys(prop.getdata("password"));
		 doWaitSec(WAIT_SEC_1);
		 unpw.getsubbuton().click();
		 doWaitSec(WAIT_SEC_1);
		
		 
		 
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

