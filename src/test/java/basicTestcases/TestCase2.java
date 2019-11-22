package basicTestcases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestCase2 extends BaseTest {
	
/*	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test ;
	
	@BeforeTest
	public void setReport() {
		htmlReporter= new ExtentHtmlReporter(".\\reports\\extent.html");
		htmlReporter.config().setEncoding("UTF-8");
		htmlReporter.config().setDocumentTitle("Extent Report");
		htmlReporter.config().setReportName("Test Results");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Tester", "Neeraja Jagata");
		extent.setSystemInfo("project", "Testng_Training");
	}
	@AfterTest
	public void endReport() {
		extent.flush();
	}
	@BeforeMethod
	public void reportExtentLog(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			String methodName=result.getMethod().getMethodName();
			String logText="<b>"+"TEST CASE:- "+ methodName.toUpperCase()+ " PASSED"+"</b>";
			Markup m= MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			test.fail(m);
		}else if(result.getStatus()==ITestResult.SKIP) {
			
		}else if(result.getStatus()==ITestResult.SUCCESS) {
			String methodName=result.getMethod().getMethodName();
			String logText="<b>"+"TEST CASE:- "+ methodName.toUpperCase()+ " PASSED"+"</b>";
			Markup m= MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			test.pass(m);
		}
	}
	
	*/
	
	
	@Test(priority =5,groups={"functional","regression","smoke","bvt"})
	public void firstTest() {
		//test= extent.createTest("firstTest");
		System.out.println("First test case");
	}
	@Test(priority = 6,groups={"functional","regression"})
	public void secondTest() {
		//test= extent.createTest("secondTest");
		System.out.println("Second Test case");
	}
	@Test(priority = 7,groups= {"functional","bvt"})
	public void thirdTest() {
		System.out.println("Third Test case");
	}
	@Test(priority = 8,groups={"functional","sanity"})
	public void forthTest() {
		System.out.println("Fourth Test case");
		Assert.fail();
		
	}
	@Test (priority = 9,groups={"functional","regression"})
	public void verifySkipException() {
		System.out.println("verifying SkipException Test case");
		if(true)
			throw new SkipException("Test case skipped becouse ......");
	}

	
	
}
