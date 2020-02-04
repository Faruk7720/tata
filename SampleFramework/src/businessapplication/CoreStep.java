package businessapplication;

import org.openqa.selenium.WebDriver;

import db.ObjectRepo;
import db.TestData;
import utility.Helper;

public class CoreStep {
	WebDriver driver;
	public CoreStep(WebDriver driver) {
		this.driver=driver;
		
	}
	public void verifyHomepage() {
		Helper.verifyElement(driver.findElement(ObjectRepo.logo));
		
	}
	public void verifyHomepageTitle() {
		Helper.verifyTitle(driver, TestData.HTitle);
		
	}
	public void hoveroverOnMorgage() {
		Helper.hoverOver(driver, driver.findElement(ObjectRepo.mortgagemenu));
		
	}
	
         
}
