package InterviewQuestionsAnswers_13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part27_2SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

	@Test
	public void part27_1SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		System.out.println("Location (x,y):: " + logo.getLocation());
		System.out.println("Location (X):: " + logo.getLocation().getX());
		System.out.println("Location (Y):: " + logo.getLocation().getY());

		System.out.println("_____________________________________________");

		System.out.println("Location (X):: " + logo.getRect().getX());
		System.out.println("Location (Y):: " + logo.getRect().getY());

		System.out.println("_____________________________________________");

		System.out.println("Location SIZE(X<Y)::" + logo.getSize());
		System.out.println("Location SIZE(X- Width)::" + logo.getSize().getWidth());
		System.out.println("Location SIZE(Y- Hight)::" + logo.getSize().getHeight());

		System.out.println("_____________________________________________");

		System.out.println(logo.getRect().getDimension().getWidth());
		System.out.println(logo.getRect().getDimension().getHeight());

		Thread.sleep(5000);
		driver.quit();
	}
}
