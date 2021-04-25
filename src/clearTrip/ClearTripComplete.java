package clearTrip;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClearTripComplete {

	@Test
	public void login () throws InterruptedException, IOException{
	
	int i = 1;
	//	System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
	//WebDriver driver = new InternetExplorerDriver();
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
	//	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	//	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.cleartrip.com");
		
		driver.findElement(By.id("FromTag")).sendKeys("Chennai, IN - Chennai Airport (MAA)");
		driver.findElement(By.id("ToTag")).sendKeys("Madurai, IN - Madurai (IXM)");
		//driver.findElement(By.className("icon ir datePicker")).click();
		driver.findElement(By.id("DepartDate")).sendKeys("Sun, 26 Jun, 2017");
		driver.findElement(By.id("SearchBtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement book =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='flightForm']/section[2]/div[4]/div/nav/ul/li[1]/table/tbody[2]/tr[2]/td[3]/button")));
	book.click();
 Thread.sleep(3000);
	File src = driver.getScreenshotAs(OutputType.FILE);
	File des = new File("./snap/screenshot"+i+".jpg");
	FileUtils.copyFile(src, des);
		
	}}
