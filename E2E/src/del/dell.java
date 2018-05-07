package del;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

@Test
public class dell {

	
	public void fish()
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.naukri.com");
//	String s = driver.getWindowHandle();
//	driver.switchTo().window(s).close();
//	System.out.println(s);
	//DesiredCapabilities dc= DesiredCapabilities.chrome();
	//dc.setBrowserName("firefox");
	//dc.setPlatform(Platform.LINUX);
	
	Actions As = new Actions(driver);
	As.doubleClick();
	As.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	
	
	}

}
