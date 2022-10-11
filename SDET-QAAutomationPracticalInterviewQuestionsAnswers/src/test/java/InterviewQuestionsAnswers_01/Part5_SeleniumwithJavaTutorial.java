package InterviewQuestionsAnswers_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part5_SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url = "https://www.snapdeal.com/";
	public static String url1 = "https://www.amazon.com/";

	@Test
	public void part5_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.navigate().to(url1);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
