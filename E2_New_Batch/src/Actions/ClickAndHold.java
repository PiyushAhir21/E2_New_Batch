package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");

		driver.findElement(By.id("password")).sendKeys("123456789");

		WebElement eye = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		
		
		Actions act = new Actions(driver);
		act.clickAndHold(eye).build().perform();
		Thread.sleep(3000);
		act.release(eye).build().perform();
		
	}

}
