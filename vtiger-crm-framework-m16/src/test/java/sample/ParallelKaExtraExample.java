package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelKaExtraExample {

	@Parameters("browser")
	@BeforeMethod
	public void beforeClass(String browser) {
		String BRO = browser;
		WebDriver driver = null;
		if (BRO.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BRO.equals("edge")) {
			driver = new EdgeDriver();
		}
	}


	@Test
	public void add() {
		System.out.println("This is add..");
	}

}
