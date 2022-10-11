package InterviewQuestionsAnswers_06;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part18_SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html";

	@Test
	public void part18_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[contains(text(),'TakesScreenshot')]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("HELP")).click();
		

		Thread.sleep(5000);
		driver.quit();
	}
}
