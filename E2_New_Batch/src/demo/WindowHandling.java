package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		to open the url
		driver.get("https://www.instagram.com/");

//		to click on meta link
		driver.findElement(By.xpath("//span[text()='Meta']")).click();
		
//		to take the session id of parent 
		String parentID = driver.getWindowHandle();
		System.out.println("Parent id : " + parentID);

//		to take all IDs
		Set<String> IDs = driver.getWindowHandles();
		IDs.remove(parentID);
		
//		iterated the foreach loop to go to the particular webpage
		for (String id : IDs) {
			System.out.println("Child id : "+ id);
			driver.switchTo().window(id);
		}
		
		Thread.sleep(1000);
//		to click on shop meta link
		driver.findElement(By.linkText("Shop Meta")).click();
//		driver.close();
	}
}
