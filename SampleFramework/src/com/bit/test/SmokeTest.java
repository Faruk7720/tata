package com.bit.test;

import org.junit.Test;

import businessapplication.CoreStep;
                                                   // shahid sunday 11/10/2019
public class SmokeTest extends BaseTest {
	@Test
	public void test1() {
		CoreStep c=new CoreStep(driver);
		c.verifyHomepageTitle();
		c.verifyHomepage();
		c.hoveroverOnMorgage();
		
		
	}

}
