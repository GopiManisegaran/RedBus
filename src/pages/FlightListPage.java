package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import clearTrip.ClearTrip;

public class FlightListPage extends ClearTrip {
	public FlightListPage(RemoteWebDriver driver){
		this.driver = driver;

	}
	
	public ConfirmationPage clickBook (){
		clickByXpath(prop.getProperty("FlightListPage.book.Xpath"));
		return new ConfirmationPage(driver) ;
		
	}

}
