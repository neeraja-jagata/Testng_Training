package listenersTest;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.TestUtil;
import utilities.MonitoringMail;
import utilities.TestConfig;

public class Listeners implements ITestListener,ISuiteListener {

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		String filePath=null;
		try {
			
			filePath=TestUtil.captureScreenshot(result.getName().toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("org.uncommons.reportng.escape-output","false");
		Reporter.log("<a href=\""+filePath+"\" target=\"blank\">Click here for screenshot</a>");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ISuite suite ) {
		System.out.println(suite.getName());
		TestUtil.zip(System.getProperty("user.dir")+"\\screenshot");
		MonitoringMail mail = new MonitoringMail();
		try {
			mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			
			e.printStackTrace();
		}
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

}
