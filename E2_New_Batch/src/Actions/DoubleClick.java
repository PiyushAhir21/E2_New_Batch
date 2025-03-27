package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightClick).build().perform();
		
		Thread.sleep(1000);
		
		act.keyDown(Keys.ESCAPE).build().perform();
		act.keyUp(Keys.ESCAPE).build().perform();
		
		Thread.sleep(1000);

		act.doubleClick(doubleClick).build().perform();
		
		
		/*
		 * keyboard actions
		 * sendkeys()
		 * keyDown()
		 * keyUp()
		 */
		
		
		
	}
}
