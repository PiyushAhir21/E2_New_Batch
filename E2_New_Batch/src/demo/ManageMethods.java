package demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
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
//		win.fullscreen();

		Dimension dim = win.getSize();
		System.out.println("Dimension is : " + dim);
		System.out.println("Width is : " + dim.getWidth());
		System.out.println("Height is : " + dim.getHeight());

//		height => 768 width => 1366
//		win.setSize(683,384);
//		Dimension dim1 = new Dimension(683, 384);
//		win.setSize(dim1);
		
		Point pt = win.getPosition();
		System.out.println("Position is : " + pt);
		System.out.println("X is : " + pt.getX());
		System.out.println("Y is : " + pt.getY());
		
		
		win.setPosition(new Point(-8,384));
		
		Thread.sleep(5000);
		driver.close();
		
	}
}
