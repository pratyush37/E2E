package Org.java.pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	ResourceBundle rb;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		rb = ResourceBundle.getBundle("details");
	}
	
	public void EnterUsername(String uname)
	{
		driver.findElement(By.id(rb.getString("login_username_id"))).sendKeys(uname);
	}
	
}
