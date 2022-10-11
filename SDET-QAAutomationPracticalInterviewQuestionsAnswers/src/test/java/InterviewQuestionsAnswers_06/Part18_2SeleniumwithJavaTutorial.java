package InterviewQuestionsAnswers_06;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part18_2SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width";

	@Test
	public void part18_2SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());
		
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.xpath("/html/body/p")).getText());
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
