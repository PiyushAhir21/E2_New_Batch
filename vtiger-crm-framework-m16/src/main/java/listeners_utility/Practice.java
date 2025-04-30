package listeners_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners_utility.Listeners_implementation.class)
public class Practice {
	public static WebDriver sdriver;
	@Test(retryAnalyzer = listeners_utility.Listeners_implementation.class)
	public void dummy1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		sdriver = driver;
		driver.get("https://facebook.com/");
		
		Thread.sleep(3000);
		Assert.assertTrue(false);
	}
	
	@Test
	public void dummy2() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		sdriver = driver;
		driver.get("https://facebook.com/");
		
		Thread.sleep(3000);
		Assert.assertTrue(true);
	}

}
