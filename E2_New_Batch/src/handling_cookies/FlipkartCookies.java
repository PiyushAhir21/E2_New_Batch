package handling_cookies;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartCookies {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.zomato.com/");

		Set<Cookie> allCookies = driver.manage().getCookies();
		for (Cookie cookie : allCookies) {
			System.out.println(cookie);
		}

		Cookie ck = driver.manage().getCookieNamed("fbcity");
		System.out.println(ck);

		Cookie ck2 = new Cookie("id", "007");
		driver.manage().addCookie(ck2);

		allCookies = driver.manage().getCookies();
		for (Cookie cookie : allCookies) {
			System.out.println(cookie);
		}

		driver.manage().deleteCookie(ck2);
		driver.manage().deleteCookieNamed("fbcity");
		allCookies = driver.manage().getCookies();
		for (Cookie cookie : allCookies) {
			System.out.println(cookie);
		}

		System.out.println("after deleting see whats coming....");
		driver.manage().deleteAllCookies();
		allCookies = driver.manage().getCookies();
		for (Cookie cookie : allCookies) {
			System.out.println(cookie);
		}

	}
}
