package extra;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class AdvanceReports {
	ExtentReports reports;

//	@BeforeSuite
//	public void reportConfig() {
//
//	}

	@Test
	public void generateAdReport() {
//change for push example
		ExtentTest test = reports.createTest("generateAdReport");
		test.log(Status.INFO, "This is info...");
		test.log(Status.WARNING, "This is warning...");
		test.log(Status.PASS, "This is passed...");
		test.log(Status.FAIL, "This is failed...");
		test.log(Status.SKIP, "This is skip...");

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		TakesScreenshot tks = (TakesScreenshot) driver;
		String ss = tks.getScreenshotAs(OutputType.BASE64);

		test.addScreenCaptureFromBase64String(ss);

		driver.close();

	}

//	@AfterSuite
//	public void repBackup() {
//
//	}
}
