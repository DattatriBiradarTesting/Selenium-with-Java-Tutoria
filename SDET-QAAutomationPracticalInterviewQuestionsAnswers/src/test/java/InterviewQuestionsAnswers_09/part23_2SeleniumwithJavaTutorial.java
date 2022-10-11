package InterviewQuestionsAnswers_09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class part23_2SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url = "https://www.globalsqa.com/demo-site/draganddrop/";

	@Test
	public void part23_1SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
		WebElement item1 = driver.findElement(By.xpath("//body/div[1]/ul[1]/li[1]/img[1]"));
		WebElement item2=driver.findElement(By.xpath("//*[@id='gallery']/li[2]/img"));
		WebElement item3 = driver.findElement(By.id("trash"));
		
		
		Actions act=new Actions(driver);
		act.dragAndDrop(item1, item3).perform();
		act.dragAndDrop(item2, item3).perform();
	}
}
