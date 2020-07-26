package com.qa.trivagotest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.testbase.TestBase;
import com.qa.trivagopages.HotelPage;
import com.qa.trivagopages.NewBookingPage;
import com.qa.trivagopages.RatingOnly;
import com.qa.trivagopages.TrivagoHomePage;
import com.qa.trivagopages.TrivagoListPage;

public class HotelPageTest extends TestBase {
	
	public TrivagoListPage tlp;
	public RatingOnly ro;
	public NewBookingPage bp= new NewBookingPage();
	public HotelPage hp=new HotelPage();
	
	public HotelPageTest() {
		
		super();
	}
	@BeforeTest()
	public void setUp() {
		
		launch();
		TrivagoHomePage trivagohome= new TrivagoHomePage();
		 trivagohome.enterCity();
		 trivagohome.selectCity();
		 tlp=trivagohome.clickButton();
		 tlp.cross();
		 tlp.sort();
		 ro=new RatingOnly();
		 ro.dealButton();
		 ro.lowestdeal();
		bp= ro.parentWindow();
		bp.clickOnHotelName();
		hp=bp.goToHotel();
		
	}
			@Test()
			public void reserve() throws InterruptedException{
				
				Thread.sleep(3000);
				hp.clickOnReserve();
				
			}
}
