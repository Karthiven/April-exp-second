package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageFactory.Acti_Login;
import Utility.Properties;
import Utility.Wait;

public class BaseTest
{
	
	
	/*@BeforeClass
	public void loadjars() throws IOException
	{
	  File dest=new File("C:/tools");
	  File src=new File("./jars/.");	
		dest.mkdir();
		FileChannel sourceChannel = null;
	    FileChannel destChannel = null;
	    try {
	        sourceChannel = new FileInputStream(src).getChannel();
	        destChannel = new FileOutputStream(dest).getChannel();
	        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
	       }finally{
	           sourceChannel.close();
	           destChannel.close();
	       }
	}*/
	 
	public static WebDriver driver=null;
	@BeforeMethod()
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
		Properties prop=new Properties("Data");
		driver.get(prop.getdata("url"));
		Wait.implictwait(5);
		
		Acti_Login lg=PageFactory.initElements(driver, Acti_Login.class);
		lg.username().sendKeys(prop.getdata("username"));
		lg.password().sendKeys(prop.getdata("password"));
		lg.loginbutton().click();
	
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
