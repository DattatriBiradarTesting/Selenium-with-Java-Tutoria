package InterviewQuestionsAnswers_13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part27_SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url = "https://jqueryui.com/tooltip/";

	@Test
	public void part27_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		driver.switchTo().frame(0);
		WebElement inputindex = driver.findElement(By.id("age"));
		String tooptrip = inputindex.getAttribute("title");
		System.out.println(tooptrip);

		driver.quit();
	}
}
