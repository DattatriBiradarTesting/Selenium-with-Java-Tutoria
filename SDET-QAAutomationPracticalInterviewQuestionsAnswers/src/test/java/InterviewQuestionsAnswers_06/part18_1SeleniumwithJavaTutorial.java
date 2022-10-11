package InterviewQuestionsAnswers_06;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class part18_1SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://demo.automationtesting.in/Frames.html";

	@Test
	public void part18_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

		WebElement outrFrame = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
		driver.switchTo().frame(outrFrame);
		Thread.sleep(5000);

		WebElement innerfreame = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerfreame);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium with java");
		Thread.sleep(5000);
		driver.quit();
		
	}
}
