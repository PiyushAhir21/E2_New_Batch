package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import leadsTest.BaseClass;

public class Demo2 {

	@Test
	public void div() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(5000);
		driver.close();
	}

}
