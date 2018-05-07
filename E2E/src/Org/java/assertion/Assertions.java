package Org.java.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assertions {

	public static boolean ValidateURL(WebDriver driver, String expURL) {
		
		boolean result =false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL)) {
			result = true;
		}
		return result;
	}
	
	public static boolean ValidateTitle(WebDriver driver, String expTitle) {
		
		boolean result =false;
		if(driver.getTitle().equalsIgnoreCase(expTitle)) {
			result = true;
		}
		return result;
	}
	
	public static boolean ValidateElementExists(WebDriver driver, String expXpath) {
		
		boolean result =false;
		try
		{
		driver.findElement(By.xpath(expXpath));
		result = true;
		} catch(Exception e)
		{}
		return result;
	}
	
}
