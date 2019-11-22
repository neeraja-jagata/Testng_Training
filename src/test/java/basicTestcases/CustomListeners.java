package basicTestcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed --->"+ result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		/*System.setProperty("org.uncommons.reportng.escape-output","false");
		String filePath="C:\\Users\\Neeraja\\Desktop\\exception.jpg" ;
		Reporter.log("<a href=\""+filePath+"\" target=\"blank\">Click here for screenshot</a>");*/
		System.out.println("Capturing screenshot for failed test --->"+ result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape-output","false");
		String filePath="C:\\Users\\Neeraja\\Desktop\\exception.jpg" ;
		Reporter.log("<a href=\""+filePath+"\" target=\"blank\">Click here for screenshot</a>");
		System.out.println("Test skipped --->"+ result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
	//zip code
		
	}

}
