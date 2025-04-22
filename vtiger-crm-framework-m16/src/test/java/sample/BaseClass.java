package sample;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import object_repository.HomePage;
import object_repository.LoginPage;

public class BaseClass {

	WebDriver driver = new ChromeDriver();

	@BeforeSuite
	public void bs() {
		System.out.println("DB connection & Report Configuration");
	}

	@AfterSuite
	public void as() {
		System.out.println("DB connection close & Report Backup");
	}

	@BeforeTest
	public void bt() {
		System.out.println("Pre - conditions");
	}

	@AfterTest
	public void at() {
		System.out.println("Post - condition");
	}

	@BeforeClass
	public void bc() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:8888/");
	}

	@AfterClass
	public void ac() {
		driver.close();
	}

	@BeforeMethod
	public void bm() {

		LoginPage lp = new LoginPage(driver);
		lp.login();
		
	}

	@AfterMethod
	public void am() {
//		Logout code
		HomePage hp = new HomePage(driver);
		hp.logout();
	}

}
