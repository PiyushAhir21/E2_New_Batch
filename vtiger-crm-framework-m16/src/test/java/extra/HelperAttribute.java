package extra;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HelperAttribute {

	@Test
	public void a() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.close();
	}

	@Test(dependsOnMethods = {"c","a"})
	public void b() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.close();
	}

	@Test
	public void c() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.close();
	}
}
