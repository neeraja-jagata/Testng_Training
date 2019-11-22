package retryListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	private static ExtentReports extent;
	private static ExtentHtmlReporter htmlReporter;
	public static ExtentReports createInstance(String fileName) {
		
		htmlReporter= new ExtentHtmlReporter(fileName);
		htmlReporter.config().setEncoding("UTF-8");
		htmlReporter.config().setDocumentTitle("Extent Report");
		htmlReporter.config().setReportName("Test Results");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Tester", "Neeraja Jagata");
		extent.setSystemInfo("project", "Testng_Training");
		
		return extent;
		
	}
}
