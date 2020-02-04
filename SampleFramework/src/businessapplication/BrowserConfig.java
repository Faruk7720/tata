package businessapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
                                                     //shahid sunday 11/10/2019
public class BrowserConfig {
	static WebDriver driver;
	public static WebDriver openBrowser() {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\faruk\\Downloads\\chromedriver.exe");
		
		if(driver==null) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bankrate.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		return driver;
	}
}
