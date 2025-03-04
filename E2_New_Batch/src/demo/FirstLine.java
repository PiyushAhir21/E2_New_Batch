package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstLine {

	public static void main(String[] args) {
//		ChromeDriver driver = new ChromeDriver();
//		EdgeDriver driver2 = new EdgeDriver();
//		FirefoxDriver driver3 = new FirefoxDriver();
		
//		converting the sub class object into super class type = upcasting
		WebDriver driver = new ChromeDriver();
		 				driver = new EdgeDriver();
		 				driver = new FirefoxDriver();
		
		
		
	}

}
