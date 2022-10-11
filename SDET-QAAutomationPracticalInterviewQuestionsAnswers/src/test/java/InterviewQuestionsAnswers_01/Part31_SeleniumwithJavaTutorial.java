package InterviewQuestionsAnswers_01;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part31_SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://www.monsterindia.com/";

	@Test
	public void part31_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		driver.findElement(By.xpath("//*[@id='user-signup-actions']/div[1]/div[1]/a[2]")).click();
		// driver.findElement(By.id("file-upload")).sendKeys("D:\\Dattatri_10692547.docx");

		WebElement button = driver.findElement(By.id("file-upload"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",button);
		
		Robot bot=new Robot();
		bot.delay(2000);
		
		StringSelection ss=new StringSelection("D:\\Dattatri_10692547.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		bot.keyPress(KeyEvent.VK_CONTROL);
		bot.keyPress(KeyEvent.VK_V);
		bot.delay(2000);
		
		bot.keyRelease(KeyEvent.VK_CONTROL);
		bot.keyRelease(KeyEvent.VK_V);
		
		bot.delay(2000);
		bot.keyPress(KeyEvent.VK_ENTER);
		bot.keyRelease(KeyEvent.VK_ENTER);

	}
}
