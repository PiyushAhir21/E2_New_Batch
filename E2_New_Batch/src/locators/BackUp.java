package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackUp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		WebElement usernameField = driver.findElement(By.id("email"));
//		usernameField.sendKeys("bullet_raja");
//		
//		WebElement passwordField = driver.findElement(By.name("pass"));
//		passwordField.sendKeys("abcd123@");
		
//		driver.findElement(By.linkText("Forgotten password?")).click();
//		driver.findElement(By.partialLinkText("gotten")).click();
			
//		className()
//		driver.findElement(By.className("inputtext")).sendKeys("Bullet_bullet");
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		
		
		/* locators -> Which is used to locate the web element 
		 * Direct 			Expressions
		 * 
		 * id()				cssSelector
		 * name()			xpath
		 * linkText
		 * partialLinkText
		 * className
		 * tagName
		 * */
	}
}
