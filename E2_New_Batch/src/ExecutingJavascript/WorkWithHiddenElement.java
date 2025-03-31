package ExecutingJavascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithHiddenElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com");
		
//		WebElement custom = driver.findElement(By.id("custom_gender"));
//		custom.sendKeys("Male");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].value='Male'", custom);
		jse.executeScript("document.querySelector('input[name=email]').value=\"admin\"");
	}
}
