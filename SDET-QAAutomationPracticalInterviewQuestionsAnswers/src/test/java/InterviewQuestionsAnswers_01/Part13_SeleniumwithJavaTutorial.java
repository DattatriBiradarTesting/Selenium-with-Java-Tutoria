package InterviewQuestionsAnswers_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part13_SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://www.makemytrip.com/flights/";

	@Test
	public void part2_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(url);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();

		Thread.sleep(5000);
		driver.quit();
	}
}
