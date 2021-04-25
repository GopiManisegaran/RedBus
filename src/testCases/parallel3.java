package testCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class parallel3 {
  @Test
  public void f3() throws InterruptedException {
	  RemoteWebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch URL
		driver.get("https://www.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Contact Us").click();;
		Set<String> winHandle=driver.getWindowHandles();
		//print last window open
		for (String a : winHandle) {
			driver.switchTo().window(a);
			System.out.println(driver.getTitle());
	 	}
		String winTitle=driver.getTitle();
		System.out.println(winTitle);
		
		//print 1st window open
		for (String b : winHandle) {
			driver.switchTo().window(b);
			break;
				}
		String winTitle1=driver.getTitle();
		System.out.println(winTitle1);
		Thread.sleep(5000);
		//close current window
		driver.close();
		//close all window open during run time
		driver.quit();
  }	
}
