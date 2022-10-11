package InterviewQuestionsAnswers_09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part23_SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3";

	@Test
	public void part23_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		driver.switchTo().frame("iframeResult");
		WebElement field1 = driver.findElement(By.id("field1"));
		field1.clear();
		field1.sendKeys("welcome to selenium testing");

		WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		
		Actions act=new Actions(driver);
		act.doubleClick(doubleClick)
		.pause(3000)
		.perform();

		Thread.sleep(7000);
		driver.quit();
	}
}
