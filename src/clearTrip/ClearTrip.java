package clearTrip;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInProvider;

public class ClearTrip extends GenericWrapper{
	
	public String browserName;
	public String dataSheetName;
	public String url;
	
	@BeforeTest
	public void beforeTest () throws IOException{
		loadObjects();

	}
	
	@BeforeMethod
	public void beforeMethod (){
		invokeApp(browserName, url);
	}

	@AfterTest
	public void afterTest(){
		unloadObjects();
	}
	@DataProvider(name = "readData")
	public Object [][] getData() throws IOException{
		return DataInProvider.getAllData("./data/"+dataSheetName+".xlsx");		
		
	}
	
	
}
