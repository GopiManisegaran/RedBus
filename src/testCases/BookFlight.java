package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import clearTrip.ClearTrip;
import pages.BookingPage;
import pages.FlightListPage;

public class BookFlight extends ClearTrip {

	@BeforeClass
	public void setData(){
		browserName ="chrome";
		url = "http://www.cleartrip.com";
		dataSheetName ="TC001";
		
	}
	
	@Test(dataProvider ="readData")
	public void  bookTicket (String  from , String to , String date) throws Exception{
		System.out.println(from);
		System.out.println(to);
		System.out.println(date);
		new BookingPage(driver)
		.enterFromPlace(from)
		.enterToPlace(to)
		.enterDate(date);
		/*.clickSearch()
		.clickBook()
		.takeSnap();*/
	
	
		
	}
}
