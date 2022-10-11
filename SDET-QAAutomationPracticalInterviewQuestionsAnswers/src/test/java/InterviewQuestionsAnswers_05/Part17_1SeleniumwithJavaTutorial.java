package InterviewQuestionsAnswers_05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part17_1SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";

	@Test
	public void part17_1SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

	}
}
