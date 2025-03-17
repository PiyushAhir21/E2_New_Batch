package locators;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

//		WebElement email = driver.findElement(By.className("_aa4b"));
//		email.sendKeys("qspiders@gmail.com");

		
//		WebElement password = driver.findElement(By.name("pass"));
//		password.sendKeys("kuch bhi");
//		
//	WebElement loginBtn = driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
//		loginBtn.click();
//		
//		WebElement forgotLink = driver.findElement(By.linkText("Forgotten password?"));
//		forgotLink.click();
//		
//
//		WebElement forgotPartialLink = driver.findElement(By.partialLinkText("For"));
//		forgotPartialLink.click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		
		driver.close();
	}
}
