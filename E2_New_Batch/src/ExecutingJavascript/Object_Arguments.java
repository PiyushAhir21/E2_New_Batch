package ExecutingJavascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object_Arguments {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		WebElement ele1 = driver.findElement(By.name("login"));
		WebElement ele2 = driver.findElement(By.id("email"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].click()", ele1);

		String usn = "admin";
//		jse.executeScript("arguments[0].value='admin' ", ele2);
		jse.executeScript("arguments[0].value=arguments[1] ", ele2, usn);

	}
}
