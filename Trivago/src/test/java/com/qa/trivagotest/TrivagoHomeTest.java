package com.qa.trivagotest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.testbase.TestBase;
import com.qa.trivagopages.TrivagoHomePage;

public class TrivagoHomeTest extends TestBase {
	
				
	public TrivagoHomeTest() {
		
		super();
		
	}
	@BeforeTest
	public void initialize() {
		
		launch();
		
		
	}
	@Test
	 public void homePageTest() {
TrivagoHomePage tp=new TrivagoHomePage();
		
		tp.enterCity();
		tp.selectCity();
		tp.clickButton();
	}
	
}
