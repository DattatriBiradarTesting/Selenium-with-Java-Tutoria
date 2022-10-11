package InterviewQuestionsAnswers_12;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part26_2SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url ="https://demo.nopcommerce.com/";

	@Test
	public void part26_1SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		WebElement section=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File src=section.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshots\\nopCommercedemostore.png");
		FileUtils.copyFile(src, trg);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
