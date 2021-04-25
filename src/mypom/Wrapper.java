package mypom;

public interface Wrapper {
	
	public void invokeApp (String browser) throws Exception;
	
	public void enterById (String id, String data) throws Exception;
	
	public void enterByName (String name , String data) throws Exception;
	
	public void enterByXpath (String Xpath, String data) throws Exception;
	
    public void clickById (String id, String data) throws Exception;
	
	public void clickByName (String name , String data) throws Exception;
	
	public void clickByXpath (String Xpath, String data) throws Exception;
	
	public void takeSnap();
	
	public void closeAllBrowser ();
	

}
