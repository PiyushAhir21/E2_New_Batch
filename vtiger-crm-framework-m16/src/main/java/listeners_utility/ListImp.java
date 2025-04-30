package listeners_utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base_utility.BaseClass;

public class ListImp implements ISuiteListener, ITestListener {
	ExtentReports reports;

//	Source -> Override/implements methods

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Database connection + Report configuration");
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss");
//															28042025_164859
		String time = now.format(dtf);

		ExtentSparkReporter spark = new ExtentSparkReporter(
				"C:\\Users\\User\\git\\E2_new_batch\\vtiger-crm-framework-m16\\AdvanceReports\\" + time + ".html");
		spark.config().setDocumentTitle("vtiger-crm-automation-framework");
		spark.config().setReportName("Beginning");
		spark.config().setTheme(Theme.DARK);

		reports = new ExtentReports();
		reports.attachReporter(spark);
		reports.setSystemInfo("O.S.", "Windows");
		reports.setSystemInfo("VersionOS", "11");
		reports.setSystemInfo("Browser", "Chrome");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println( methodName + " Method started....");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Method successfully passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Method failed !!!");
		TakesScreenshot tks = (TakesScreenshot) BaseClass.sdriver;
		File src = tks.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\User\\git\\E2_new_batch\\vtiger-crm-framework-m16\\errorShots\\ss.png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Method skippedddd....");
	}
	
	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Database close + Report Backup");
		reports.flush();
	}
	
	
	
	
}
