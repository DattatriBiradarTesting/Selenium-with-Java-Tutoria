package InterviewQuestionsAnswers_04;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part16_1SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "http://www.deadlinkcity.com/";

	@Test
	public void part2_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		List<WebElement> BrokenLink = driver.findElements(By.tagName("a"));
		int Broken = 0;

		for (WebElement element : BrokenLink) {
			String url = element.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("URL is Empty");
				continue;
			}
			URL link = new URL(url);
			try {
			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
			httpconn.connect();
			if (httpconn.getResponseCode() >= 400) {
				System.out.println(httpconn.getResponseCode() + url + " is" + " Broken Links");
				Broken++;
			} else {
				System.out.println(httpconn.getResponseCode() + url + "is" + "Valid Links");
			}
			System.out.println("Number of Broken Links:  " + Broken);
			}
		catch(Exception e) {
			
		}
	
	}
	}
}
