package demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");

//		driver.manage().window().minimize();

		Options opt = driver.manage();
		Window win = opt.window();

		win.minimize();
		Thread.sleep(1000);
		win.maximize();
		Thread.sleep(1000);
		win.fullscreen();

		Dimension dim = win.getSize();
		System.out.println("Dimension is : " + dim);
		System.out.println("Width is : " + dim.getWidth());
		System.out.println("Height is : " + dim.getHeight());

		Thread.sleep(3000);
		driver.close();
	}
}
