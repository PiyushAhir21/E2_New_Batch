package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Actions act = new Actions(driver);

		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("1234567890");
		act.keyDown(Keys.CONTROL)
			.keyDown("a")
			.keyUp("a")
			.keyUp(Keys.CONTROL)
			.build().perform();

		WebElement eye = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));

		act.clickAndHold(eye).build().perform();
		Thread.sleep(3000);
		act.release(eye).build().perform();
	}
}