package listeners_utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IRetryAnalyzer;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners_implementation implements ITestListener, ISuiteListener, IRetryAnalyzer {
	ExtentReports report;
	ExtentTest test;

	@Override
	public void onStart(ISuite suite) {
		System.out.println("DB connection & Report Configuration");
		ExtentSparkReporter spark = new ExtentSparkReporter(
				"C:\\Users\\User\\git\\E2_new_batch\\vtiger-crm-framework-m16\\AdvanceReports\\adRep.html");
		spark.config().setDocumentTitle("vtiger-crm");
		spark.config().setReportName("Second Report");
		spark.config().setTheme(Theme.STANDARD);

		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Windows", "10");
	}

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + " Method is started....");
		test = report.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Successfully passed!!!");
		test.log(Status.PASS, "Successfully passed!!!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed!!!");
		test.log(Status.FAIL, "Failed!!!");
		TakesScreenshot tks = (TakesScreenshot) Practice.sdriver;
		String ss = tks.getScreenshotAs(OutputType.BASE64);

//		test.addScreenCaptureFromBase64String(ss, "ErrorShot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped!!!");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("DB close & Report Backup");
		report.flush();
	}

	int count = 0;
	int initCount = 5;

	@Override
	public boolean retry(ITestResult result) {
		if (count < initCount) {
			count++;
			return true;
		} else {
			return false;
		}
	}

}
