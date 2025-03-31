package demo;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.browserstack.com/users/sign_in");

		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.getElementById('user_email_login').value='admin';");
//		js.executeScript("document.getElementById('user_password').value='password';");
		js.executeScript("document.querySelector('input[name=\"user[login]\"]').value='admin';");
		js.executeScript("alert('Hey there!!! correct login credentials to continue');");
	}
}
