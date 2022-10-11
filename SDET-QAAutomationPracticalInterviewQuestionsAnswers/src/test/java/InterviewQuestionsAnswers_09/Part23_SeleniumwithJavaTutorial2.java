package InterviewQuestionsAnswers_09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part23_SeleniumwithJavaTutorial2 {
	public static WebDriver driver;
	public static String url = "https://swisnl.github.io/jQuery-contextMenu/demo.html";

	@Test
	public void part23_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		String rightclick = "//span[contains(text(),'right click me')]";
		WebElement button = driver.findElement(By.xpath(rightclick));
		
		Actions act=new Actions(driver);
		act.contextClick(button).perform();

		
		Thread.sleep(7000);
		driver.quit();
	}
}
