package com.qa.trivagopages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testbase.TestBase;

public class TrivagoListPage extends TestBase{

	@FindBy(xpath="//button[@data-qa='close-map-button']")
	WebElement crossButton;
	
	@FindBy(xpath="//select[@id='mf-select-sortby']")
	WebElement sortBy;
		


		public TrivagoListPage() {
			
			PageFactory.initElements(driver, this);
		}
		
		public void cross() {
			
			crossButton.click();
		}
		
		public RatingOnly sort() {
			
			sortBy.click();
			Select select=new Select(sortBy);
			select.selectByValue("4");
			return new RatingOnly();
		}
		
		
		
		
		

}	