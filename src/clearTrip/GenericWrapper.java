package clearTrip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericWrapper implements Wrapper {
	public RemoteWebDriver driver;
	protected static Properties prop;
	int i = 1;


	public void loadObjects() throws IOException {
		prop=new Properties();
		//prop.load(new FileInputStream(new File("./object.properties")));
		File path = new File ("./object.properties");
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
	}
	public void unloadObjects(){
		prop = null;
	}
	
	public void invokeApp(String browserName, String url) {
		if (browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				driver = new ChromeDriver();
		}
				else if (browserName.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				}
			else {
				System.out.println("invalid browser");
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	
	}

	public void enterById(String id, String from) throws Exception {
	driver.findElement(By.id(id)).clear();
	driver.findElement(By.id(id)).sendKeys(from);
	
		
	}

	
	public void enterByXpath(String xpath, String data) {
		driver.findElement(By.xpath(xpath)).clear();
		driver.findElement(By.xpath(xpath)).sendKeys(data);
		
	}


	public void clickById(String id) throws Exception {
		driver.findElement(By.id(id)).click();

		
	}


	public void clickByXpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		
	}


	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File ("./snap/screenshot"+i+".jpg");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void closeAllBrowsers() {
	driver.quit();
		
	}


		
		
	


	
	
	}



		
	


	
	












	
	

