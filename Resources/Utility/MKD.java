package Utility;




import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.basetwo;


public class MKD extends basetwo{
	
	
	
	
	
	public static void mousemove(WebElement ele)
	{
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
		
	}
	

	public static void mousemoveclick(WebElement ele)
	{
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
		act.click().build().perform();
		
	}
	
		
	public static String getsimpletimeinsec()
	{
	
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String formattedDate = sdf.format(date);
		System.out.println(formattedDate);
		return  formattedDate;
	}
	
	
	
	
}
