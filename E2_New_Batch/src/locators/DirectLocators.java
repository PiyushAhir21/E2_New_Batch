package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

		Thread.sleep(2000);
		WebElement un = driver.findElement(By.name("username"));
		un.sendKeys("admin");
		
//		<input value="123451">
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.cssSelector("input[type='password']"));
		pwd.sendKeys("1234567");
		
//		<button type="submit">
		WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
		loginBtn.click();
	}
}
