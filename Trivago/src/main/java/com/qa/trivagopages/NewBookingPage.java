package com.qa.trivagopages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class NewBookingPage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"contentContainer\"]/div[4]/ol/li[1]/div[2]/a/div/div[2]/div[1]/header/h3")
	WebElement hotelname;
	
	public NewBookingPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnHotelName()
	{
		
		hotelname.click();
			
		}
		
	
	public HotelPage goToHotel() {
		
		Set<String> handle=driver.getWindowHandles();
		
		Iterator<String> it=handle.iterator();
		String pw=it.next();
		String cw=it.next();
		driver.switchTo().window(cw);
		return new HotelPage();
		
		
	}
}

		
