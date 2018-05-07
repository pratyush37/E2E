package Org.java.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentReport implements ITestListener,WebDriverEventListener{

@Override
public void onFinish(ITestContext arg0) {
	// TODO Auto-generated method stub
}

@Override
public void onStart(ITestContext arg0) {
	// TODO Auto-generated method stub
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailure(ITestResult arg0) {
	// TODO Auto-generated method stub
	ExtentReports er = new ExtentReports("./Report/Report.html");
	ExtentTest t1 = er.startTest("TC001");
	t1.log(LogStatus.PASS, "Passed");
	System.out.println("vballe");
	er.endTest(t1);
	er.flush();
	er.close();
}

@Override
public void onTestSkipped(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestStart(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestSuccess(ITestResult arg0) {
	// TODO Auto-generated method stub
	ExtentReports er = new ExtentReports("./Report/Report.html");
	ExtentTest t1 = er.startTest("TC001");
	t1.log(LogStatus.PASS, "Passed");
	System.out.println("balle");
	er.endTest(t1);
	er.flush();
	er.close();

	}


@Override
public void afterAlertAccept(WebDriver arg0) {
	// TODO Auto-generated method stub
	
	System.out.println("as");
}

@Override
public void afterAlertDismiss(WebDriver arg0) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void afterClickOn(WebElement arg0, WebDriver arg1) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void afterNavigateBack(WebDriver arg0) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void afterNavigateForward(WebDriver arg0) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void afterNavigateRefresh(WebDriver arg0) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void afterNavigateTo(String arg0, WebDriver arg1) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void afterScript(String arg0, WebDriver arg1) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void beforeAlertAccept(WebDriver arg0) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void beforeAlertDismiss(WebDriver arg0) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void beforeClickOn(WebElement arg0, WebDriver arg1) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void beforeNavigateBack(WebDriver arg0) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void beforeNavigateForward(WebDriver arg0) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void beforeNavigateRefresh(WebDriver arg0) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void beforeNavigateTo(String arg0, WebDriver arg1) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void beforeScript(String arg0, WebDriver arg1) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

@Override
public void onException(Throwable arg0, WebDriver arg1) {
	// TODO Auto-generated method stub
	System.out.println("as");
}

}
