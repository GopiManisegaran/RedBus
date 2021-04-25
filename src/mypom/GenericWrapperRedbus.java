package mypom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericWrapperRedbus implements Wrapper{

	 public RemoteWebDriver driver;
	 int i = 1;
	public void invokeApp(String browser) throws Exception {
	try {
		if (browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		   driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("mozilla")) {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");	
			driver = new FirefoxDriver();	
			}

		else if (browser.equalsIgnoreCase("ie"))	
		{
			System.setProperty("webdriver.ie.driver", "./driver/iedriver.exe");	
			driver = new InternetExplorerDriver();	
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
		
	

	
	public void enterById(String id, String data) throws Exception {
		driver.findElement(By.id(id)).clear();
		driver.findElement(By.id(id)).sendKeys(data);
	}

	
	public void enterByName(String name, String data) throws Exception {
		driver.findElement(By.id(name)).clear();
		driver.findElement(By.id(name)).sendKeys(data);
		
	}


	public void enterByXpath(String Xpath, String data) throws Exception {
		driver.findElement(By.id(Xpath)).clear();
		driver.findElement(By.id(Xpath)).sendKeys(data);
		
	}


	public void clickById(String id, String data) throws Exception {
		driver.findElement(By.id(id)).clear();
		driver.findElement(By.id(id)).sendKeys(data);
		
	}


	public void clickByName(String name, String data) throws Exception {
		driver.findElement(By.id(name)).clear();
		driver.findElement(By.id(name)).sendKeys(data);
		
	}

	
	public void clickByXpath(String Xpath, String data) throws Exception {
		driver.findElement(By.id(Xpath)).clear();
		driver.findElement(By.id(Xpath)).sendKeys(data);
		
	}


	public void closeAllBrowser() {
		driver.quit();
	
	}




	
	public void takeSnap() {
		try {
			File src = driver.getScreenshotAs(OutputType.FILE);
			File des = new File("./Snaps/Screenshot"+ i +".jpg");
			FileUtils.copyFile(src, des);
			i++;
		} catch (WebDriverException e) {

			System.err.println("cannot perform the screen shot action");
			throw new RuntimeException("stop execution");

		} catch (IOException e) {

			System.err.println("problem in source or destination path or folder accessibility");
			
			throw new RuntimeException("stop execution");
	}


	}


}
