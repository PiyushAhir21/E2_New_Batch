package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");

		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.id("slider"));

		Actions actions = new Actions(driver);

		actions.moveToElement(slider,50,0).click().perform();
//		actions.moveByOffset(50, 0).perform();

		
	}
}