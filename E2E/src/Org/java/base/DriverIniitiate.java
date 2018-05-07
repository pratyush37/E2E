package Org.java.base;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Org.java.utility.Logging;
import Org.java.utility.ScreenShot;
import Org.java.utility.extentReport;

public class DriverIniitiate {

	public WebDriver driver;
	EventFiringWebDriver event;
	extentReport list;
	ResourceBundle rb;
	@BeforeMethod
	public void openURL() {
		Logging l = new Logging();
		l.log();
		rb =ResourceBundle.getBundle("details");
		String URL= rb.getString("URL");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		EventFiringWebDriver event = new EventFiringWebDriver(driver);
		extentReport list = new extentReport();
		event.register(list);
		//driver.get(URL);
		event.navigate().to(URL);
	
		ScreenShot s=new ScreenShot();
	try {
		s.takeScreenShot(driver);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
}

	}
	
	
	@AfterMethod
	public void CloseURL() {
		driver.navigate().back();
		driver.close();
		
	}
}
