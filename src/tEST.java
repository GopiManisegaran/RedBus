import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tEST {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//initializig Chrome Driver
		WebDriver driver =new ChromeDriver();
		//Launch URL
		driver.get("https://www.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Contact Us")).click();;
		Set<String> winHandle=driver.getWindowHandles();
		System.out.println(winHandle);
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
	
	}
}
