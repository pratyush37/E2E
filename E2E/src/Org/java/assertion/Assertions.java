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
	
public static boolean ValidateElementExists(WebDriver driver, String loctype, String locValue) {
		
		boolean result =false;
		try
		{
		if(loctype.equalsIgnoreCase("xpath"))
		{
		driver.findElement(By.xpath(locValue));
		}
		else if(loctype.equalsIgnoreCase("Id"))
		{
		driver.findElement(By.id(locValue));
		}
		result = true;
		} catch(Exception e)
		{}
		return result;
	}
	
public static boolean ValidateTextPresentonElement(WebDriver driver, String loctype, String locValue ,String ExpText) {
	
	boolean result =false;
	String ActValue = "";
	try
	{
	if(loctype.equalsIgnoreCase("xpath"))
	{
	ActValue = driver.findElement(By.xpath(locValue)).getText();
	}
	else if(loctype.equalsIgnoreCase("Id"))
	{
	ActValue = driver.findElement(By.id(locValue)).getText();
	}
	
	if(ActValue.equalsIgnoreCase(ExpText))
	{
		result = true;
	}

	} catch(Exception e)
	{}
	return result;
}
	
public static boolean ValidateTextPresentonPage(WebDriver driver, String ExpText) {
	
	boolean result =false;
	if(driver.getPageSource().contains(ExpText))
	{
		result = true;
	}
	return result;
}
	
public static boolean ValidateAttribute(WebDriver driver, String loctype, String locValue ,String Attributename , String ExpValue) {
	
	boolean result =false;
	String ActValue = "";
	try
	{
	if(loctype.equalsIgnoreCase("xpath"))
	{
	ActValue = driver.findElement(By.xpath(locValue)).getAttribute(Attributename);
	}
	else if(loctype.equalsIgnoreCase("Id"))
	{
	ActValue = driver.findElement(By.id(locValue)).getText();
	}
	
	if(ActValue.equalsIgnoreCase(ExpValue))
	{
		result = true;
	}

	} catch(Exception e)
	{}
	return result;
}

public static boolean ValidateElementVisibility(WebDriver driver, String loctype, String locValue) {
	boolean result =false;
	try
	{
	if(loctype.equalsIgnoreCase("xpath"))
	{
	result = driver.findElement(By.xpath(locValue)).isDisplayed();
	}
	else if(loctype.equalsIgnoreCase("Id"))
	{
	result = driver.findElement(By.id(locValue)).isDisplayed();
	}
	} catch(Exception e)
	{}
	return result;
}

public static boolean ValidateElementEnable(WebDriver driver, String loctype, String locValue) {
	boolean result =false;
	try
	{
	if(loctype.equalsIgnoreCase("xpath"))
	{
	result = driver.findElement(By.xpath(locValue)).isEnabled();
	}
	else if(loctype.equalsIgnoreCase("Id"))
	{
	result = driver.findElement(By.id(locValue)).isEnabled();
	}
	} catch(Exception e)
	{}
	return result;
}

}

