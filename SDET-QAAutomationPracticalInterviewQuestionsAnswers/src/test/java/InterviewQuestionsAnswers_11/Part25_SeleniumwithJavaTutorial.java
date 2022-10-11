package InterviewQuestionsAnswers_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part25_SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url ="https://the-internet.herokuapp.com/key_presses";

	@Test
	public void part25_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.ALT).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.SPACE).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.CONTROL).perform();
		
		
		
		Thread.sleep(5000);
		driver.quit();	
	}
}
