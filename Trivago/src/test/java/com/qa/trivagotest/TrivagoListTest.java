package com.qa.trivagotest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.testbase.TestBase;
import com.qa.trivagopages.TrivagoHomePage;
import com.qa.trivagopages.TrivagoListPage;

public class TrivagoListTest extends TestBase{
	public TrivagoListPage tlp;
	 public TrivagoListTest() {
		 
		 super();
	 }
	 @BeforeTest
	 public void setUp() {
		 
		 launch();
		 TrivagoHomePage trivagohome= new TrivagoHomePage();
		 trivagohome.enterCity();
		 trivagohome.selectCity();
		 tlp=trivagohome.clickButton();
		 
				 
	 }
	 @Test
 public void xyz() {
	 tlp.cross();
	 tlp.sort();
 }
}
