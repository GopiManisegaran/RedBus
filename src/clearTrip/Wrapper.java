package clearTrip;

import javax.swing.Spring;

public interface Wrapper {
  
	public void invokeApp(String browserName, String  url);
	public void enterById(String id , String data) throws Exception;
	public void enterByXpath(String xpath , String data);
	public void clickById(String id) throws Exception;
	public void clickByXpath(String xpath );
	public void takeSnap();
	public void closeAllBrowsers();
	
	
	
	
}
