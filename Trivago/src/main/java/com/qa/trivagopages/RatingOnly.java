package com.qa.trivagopages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class RatingOnly extends TestBase{

	
	@FindBy(xpath="//li[@class='hotel-item item-order__list-item js_co_item']")
	
	List<WebElement> allHotel;
	
	@FindBy(xpath="//*[@id=\"4600452\"]/div/article/div[1]/div[2]/section/div[2]/article[2]/span")
	WebElement viewdealbutton;
	
	@FindBy(xpath="//*[contains(text(),'pay at the property')]")
	WebElement deal;
	
   public RatingOnly() {
	  
	   PageFactory.initElements(driver, this);
	   
   }
   
   public void hotelSize() {
	   
	   
	   int size=allHotel.size();
	  
	   System.out.println(size);
	   for(int i=0;i<size;i++) {
		   
		  System.out.println(allHotel.get(i).getText());
			  
		   }
	   
		   
	   }
   			public void dealButton() {
   				
   				viewdealbutton.click();
   				
   				
   				
   			}
   			
   			public void lowestdeal() {
   				
   				deal.click();
   			}
   			
   			
   			public NewBookingPage parentWindow()
   			{
   				
   				Set<String> handler=driver.getWindowHandles();
   				
   			Iterator<String> s=	handler.iterator();
   		String parentWindow=s.next();
   		System.out.println("parent window="+ parentWindow);
   		String childWindow=s.next();
   		System.out.println("child window="+childWindow);
   		driver.switchTo().window(childWindow);
   		
   		return new NewBookingPage();
   		
   				
   				
   				
   				
   			}
	   
   }
   
   
   