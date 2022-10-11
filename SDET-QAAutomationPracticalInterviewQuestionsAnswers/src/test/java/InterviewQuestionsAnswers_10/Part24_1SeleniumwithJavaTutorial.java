package InterviewQuestionsAnswers_10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part24_1SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url = "http://automationpractice.com/index.php";

	@Test
	public void part24_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));

		Actions act = new Actions(driver);
		// act.moveToElement(women).perform();

		Action action = act.moveToElement(women).build();
		action.perform();
		
		
		Thread.sleep(9000);
		driver.quit();
	}
}
