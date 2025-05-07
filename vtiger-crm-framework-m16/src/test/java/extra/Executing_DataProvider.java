package extra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Executing_DataProvider {
	@Test(dataProvider = "getData")
	public void loginToFaceBook(String un, String pwd) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
		
		
		
		driver.get("https://www.facebook.com/");

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(un);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pwd);

		Thread.sleep(5000);
		driver.close();
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] arr = new Object[3][2];
		arr[0][0] = "James";
		arr[0][1] = "Gosling";

		arr[1][0] = "Steve";
		arr[1][1] = "Jobs";

		arr[2][0] = "Shambhu sir";
		arr[2][1] = "Java KING";
		return arr;

	}

}
