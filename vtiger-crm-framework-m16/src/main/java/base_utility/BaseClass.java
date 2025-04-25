package base_utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import generic_utility.FileUtility;
import object_repository.HomePage;
import object_repository.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public FileUtility fUtil = new FileUtility();

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
	public void bc() throws IOException {
		String BROWSER = fUtil.getDataFromPropertyFile("bro");
		String URL = fUtil.getDataFromPropertyFile("url");


		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);
	}

	@AfterClass
	public void ac() {
		driver.close();
	}

	@BeforeMethod
	public void bm() {
		LoginPage lp = new LoginPage(driver);
		lp.login("admin", "password");
	}

	@AfterMethod
	public void am() {
		HomePage hp = new HomePage(driver);
		hp.logout();
	}

}
