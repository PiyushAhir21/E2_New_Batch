package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");

		String title = driver.getTitle();
		System.out.println("Title is : " + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url : " + currentUrl);

//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);

		driver.findElement(By.linkText("Meta")).click();

		Thread.sleep(2000);
		driver.close();

//		driver.quit();

	}
}
