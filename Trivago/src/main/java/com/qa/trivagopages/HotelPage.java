package com.qa.trivagopages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class HotelPage extends TestBase {
	
	@FindBy(xpath="//button[@data-element-room-capacity='3']")
	WebElement reservebutton;
		
	public HotelPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public BookingDetailPage clickOnReserve() throws InterruptedException {
		Thread.sleep(5000);
		reservebutton.click();
		return new BookingDetailPage();
	}
}
