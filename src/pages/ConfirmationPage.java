package pages;



import org.openqa.selenium.remote.RemoteWebDriver;

import clearTrip.ClearTrip;

public class ConfirmationPage extends ClearTrip{
	public ConfirmationPage(RemoteWebDriver driver){
		this.driver = driver;
	

	}
	public ConfirmationPage snap (){
		takeSnap();
		return this;
		
	}

}
