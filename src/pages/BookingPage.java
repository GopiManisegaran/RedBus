package pages;





import org.openqa.selenium.remote.RemoteWebDriver;



import clearTrip.ClearTrip;

public class BookingPage extends ClearTrip{
	
	public BookingPage(RemoteWebDriver driver){
		this.driver = driver;
	

	}
	
	public BookingPage enterFromPlace (String from) throws Exception{
		enterById(prop.getProperty("bookingPage.from.id"), from);
		return this;
	}
	public BookingPage enterToPlace (String to) throws Exception{
		enterById(prop.getProperty("bookingPage.to.id"), to);
		return this;
	}
	public BookingPage enterDate (String date) throws Exception{
		enterById(prop.getProperty("bookingPage.date.id"), date);
		return this;
	}
	
	public FlightListPage clickSearch () throws Exception{
		clickById(prop.getProperty("bookingPage.searchbutton.id"));
		return new FlightListPage(driver);
	}
}
