package com.qa.trivagotest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.testbase.TestBase;
import com.qa.trivagopages.NewBookingPage;
import com.qa.trivagopages.RatingOnly;
import com.qa.trivagopages.TrivagoHomePage;
import com.qa.trivagopages.TrivagoListPage;

public class NewBookingTest extends TestBase {
	public TrivagoListPage tlp;
	public RatingOnly ro;
	public NewBookingPage bp=new NewBookingPage();
	public NewBookingTest() {
		
		super();
	}     
	    @BeforeTest
         public void setup() {
        	 
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
    		
    		 
         }
	    @Test(priority=0)
         public void nBp() throws InterruptedException {
	    	//bp=new NewBookingPage();
        	 bp.clickOnHotelName();
         }
	    @Test(priority=1)
         public void gTh() {
	    	//bp=new NewBookingPage();
        	 bp.goToHotel();
         }
}
