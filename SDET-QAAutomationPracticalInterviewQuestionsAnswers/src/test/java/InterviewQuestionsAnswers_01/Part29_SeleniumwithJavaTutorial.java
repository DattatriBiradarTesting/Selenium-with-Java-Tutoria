package InterviewQuestionsAnswers_01;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part29_SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url = "https://demo.nopcommerce.com/";

	@Test
	public void part29_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		Set<Cookie> coo = driver.manage().getCookies();
		System.out.println("The cookies how match in there :: " + coo.size());

		for (Cookie cookie : coo) {
			System.out.println(cookie.getName() + " :: " + cookie.getValue());
		}
		System.out.println("________________________________________");

		Cookie cookieObj = new Cookie("My Cookies adding", "123456");
		driver.manage().addCookie(cookieObj);

		coo = driver.manage().getCookies();
		System.out.println("Size of Cookies after adding :: " + coo.size());

		System.out.println("________________________________________");
		//driver.manage().deleteCookie(cookieObj);
		driver.manage().deleteCookieNamed("My Cookies adding");
		coo = driver.manage().getCookies();
		System.out.println("Size of Cookes after deletion:: " + coo.size());
		
		System.out.println("________________________________________");
		driver.manage().deleteAllCookies();
		coo=driver.manage().getCookies();
		System.out.println("Size of last cookies :: "+ coo.size());
		
		Thread.sleep(5000);
		driver.quit();
	}
}
