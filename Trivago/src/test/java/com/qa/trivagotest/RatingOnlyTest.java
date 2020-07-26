package com.qa.trivagotest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.testbase.TestBase;
import com.qa.trivagopages.RatingOnly;
import com.qa.trivagopages.TrivagoHomePage;
import com.qa.trivagopages.TrivagoListPage;

public class RatingOnlyTest extends TestBase{

	public TrivagoListPage tlp;
	public RatingOnly ro;
	
	public RatingOnlyTest() {
		
		super();
	}
	@BeforeTest
	public void setUp() {
		
		launch();
		 TrivagoHomePage trivagohome= new TrivagoHomePage();
		 trivagohome.enterCity();
		 trivagohome.selectCity();
		 tlp=trivagohome.clickButton();
		 tlp.cross();
		 tlp.sort();
		 
	}
	@Test(priority=0)
	public void hotelName() {
		
		ro=new RatingOnly();
		
		ro.hotelSize();
		
	}
	@Test(priority=1)
	public void viewDeal() throws InterruptedException {
		
		Thread.sleep(2000);
		ro.dealButton();
		System.out.println("View Deal Button clicked");
		Thread.sleep(5000);
		
	}
	@Test(priority=2)
	public void ld() {
		ro.lowestdeal();
		System.out.println("lowest deal clicked");
	}
	
	@Test(priority=3)
	public void parentw() {
		ro.parentWindow();
	}
	
	
}
