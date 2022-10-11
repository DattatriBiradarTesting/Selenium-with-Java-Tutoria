package InterviewQuestionsAnswers_13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part27_1SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url = "https://demo.nopcommerce.com/";

	@Test
	public void part27_1SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		String ClickONLink = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.xpath("//a[@class='ico-register']")).sendKeys(ClickONLink);

		Thread.sleep(5000);
		driver.quit();
	}
}
