package InterviewQuestionsAnswers_05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part17_2SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url = "https://www.justdial.com/Bangalore/Bakeries";

	@Test
	public void part17_2SeleniumwithJavaTutorial() throws Throwable {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		Thread.sleep(5000);
		driver.quit();
	}
}
