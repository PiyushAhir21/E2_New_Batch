package extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners_utility.ListImp.class)
public class ExampleOfListeners {
	@Test
	public void first() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shaadi.com/");

		Thread.sleep(1000);
		Assert.assertTrue(false);
	}
}
