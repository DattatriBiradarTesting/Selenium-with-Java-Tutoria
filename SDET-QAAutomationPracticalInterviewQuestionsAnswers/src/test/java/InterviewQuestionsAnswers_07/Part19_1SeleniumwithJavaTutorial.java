package InterviewQuestionsAnswers_07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part19_1SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://www.google.com/";

	@Test
	public void part19_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		WebDriverWait myWait=new WebDriverWait(driver, 20);
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		WebElement element=	
				myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Downloads']")));
		element.click();


		Thread.sleep(5000);
		driver.quit();
	}
}
