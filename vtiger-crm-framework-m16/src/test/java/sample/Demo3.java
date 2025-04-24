package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import leadsTest.BaseClass;

public class Demo3 {

	@Test
	public void multi() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		Thread.sleep(5000);
		driver.close();
	}

}
