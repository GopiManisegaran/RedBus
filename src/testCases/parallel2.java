package testCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class parallel2 extends parallel {
  @Test
 
  public void f2() {
	  RemoteWebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	driver =new ChromeDriver();
		//Launch URL
		driver.get("http://legacy.crystalcruises.com/Calendar.aspx");
		//maximazie Browser
		driver.manage().window().maximize();
	List<WebElement> a=driver.findElementsByLinkText("Get-a-Quote");
	a.get(a.size()-1).click();
	a.get(1);
	}
  }

