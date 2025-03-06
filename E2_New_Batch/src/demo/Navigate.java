package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();

		Navigation nav = driver.navigate();

//		nav.to("facebook");
		Thread.sleep(2000);
		nav.back();
		Thread.sleep(2000);
		nav.refresh();
		Thread.sleep(2000);
		nav.forward();

		Thread.sleep(3000);
		driver.close();

	}
}
