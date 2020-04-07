package Utility;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.paypal.selion.platform.dataprovider.DataProviderFactory;
import com.paypal.selion.platform.dataprovider.DataResource;
import com.paypal.selion.platform.dataprovider.SeLionDataProvider;
import com.paypal.selion.platform.dataprovider.impl.FileSystemResource;

import mapper.CreateUser_Map;


public class Dataprovider 
{
	@DataProvider(name="createcustomer")
	public static Object[][] createcust() throws IOException, Exception 
	{
			
		return Excelutils.getTableArray(new Properties("Data").getdata("Actitimedata"), "Sheet1");
	}
	
	
	
	@DataProvider(name = "createusers")
	public static Object[][] getExcelDataProvider() throws Exception {
	  DataResource resource =new FileSystemResource(new Properties("Data").getdata("Actitimedata"),CreateUser_Map.class);
	  SeLionDataProvider dataProvider =DataProviderFactory.getDataProvider(resource);
	  return dataProvider.getAllData();
	}
	
	
	

}
