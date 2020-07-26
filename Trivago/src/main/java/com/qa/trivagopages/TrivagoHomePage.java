package com.qa.trivagopages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class TrivagoHomePage extends TestBase {

	
	@FindBy(xpath="//input[@id='querytext']")
	WebElement citysearch;
	
	@FindBy(xpath="//ul[@role='listbox']//li[@id='suggestion-64975/200']")
	WebElement selectoption;
	
	@FindBy(xpath="//button[@class='btn btn--primary btn--regular search-button js-search-button']")
	WebElement searchbutton;
	
	
	public TrivagoHomePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterCity() {
		
		citysearch.sendKeys("Bengaluru");
		
	}
	
	public void selectCity() {
		
		selectoption.click();
	}
	
	public TrivagoListPage clickButton() {
		
		searchbutton.click();
		return new TrivagoListPage();
	}
}

