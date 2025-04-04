package handling_windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");

		String title = driver.getTitle();
		System.out.println(title);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//span[contains(text(),'Solutions')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Geolocation Testing')]")).click();
		js.executeScript("window.scrollBy(0,40)");

		WebElement link = driver.findElement(
				By.xpath("//a[@id='product-menu-toggle']//span[@class='account-down-caret']//*[local-name()='svg']"));
		Actions newwin = new Actions(driver);
		newwin.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
		// Thread.sleep(2000);
		// js.executeScript("window.scrollBy(0,400)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		System.out.println("a1");
		for (String window : windows) {
			driver.switchTo().window(window);
			if (driver.getTitle().contains("Most Reliable App & Cross Browser Testing Platform | Browserstack")) {
				System.out.println("a2");
				js.executeScript("window.scrollBy(0,1000)");
				System.out.println("b1");
				driver.findElement(By.xpath("//a[@id='logo']//*[local-name()='svg']")).click();

				driver.findElement(By.xpath("//a[@id='signupModalButton']")).click();
				driver.manage().window().setPosition(new Point(2000, 0));
			}
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> windows1 = driver.getWindowHandles();
		System.out.println(windows1);
		System.out.println("a3");
		for (String window : windows1) {
			driver.switchTo().window(window);
			System.out.println("a4");
			js.executeScript("window.scrollBy(0,400)");
		}
	}
}