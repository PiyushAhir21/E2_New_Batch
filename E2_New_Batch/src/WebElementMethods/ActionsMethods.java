package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement unField = driver.findElement(By.name("email"));
		unField.sendKeys("Bullet_raja");

//		WebElement passField = driver.findElement(By.cssSelector("input[type='password']"));
//		passField.sendKeys("123456");

//		Thread.sleep(3000);
//		unField.clear();
//		Thread.sleep(1000);
//		unField.sendKeys("papa_ki_pari");

		WebElement loginBtn = driver.findElement(By.name("login"));
		String text = loginBtn.getText();
		String tag = loginBtn.getTagName();
		System.out.println(tag);
		
		String attValue = loginBtn.getAttribute("class");
		System.out.println(attValue);
		
		String cssValue = loginBtn.getCssValue("text-align");
		System.out.println(cssValue);
		
		if (loginBtn.isDisplayed()) {
			loginBtn.submit();
		}
	}
}
