package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class parallel {
  @Test( invocationCount=1,threadPoolSize=1 )
  public  void f() {
	  RemoteWebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
	  driver.get("http://tamilrockers.nu");
	  driver.findElement(By.xpath("//*[@id='register_link']")).click();
	 
	  Set<String> win = driver.getWindowHandles();
	  for (String swi : win) {
			driver.switchTo().window(swi);
		  System.out.println(driver.getTitle());

		
	}
  }
}
