package mypom;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class RedBusWrapper extends GenericWrapperRedbus {
	
	public String browserName;
	public String dataSheetName;
	
@BeforeMethod
public void beforeMethod() throws Exception {
	invokeApp(browserName);
}
	
@AfterMethod
public void afterMethod (){
	closeAllBrowser();
}

@DataProvider(name="getdata")
 	public Object[][]getData() throws IOException{
		return DataInputProvider.getAllData("./data/"+dataSheetName+".xlsx");
}
}
	


