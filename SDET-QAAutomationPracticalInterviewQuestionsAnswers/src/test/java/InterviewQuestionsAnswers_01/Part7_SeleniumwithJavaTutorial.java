package InterviewQuestionsAnswers_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part7_SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://admin-demo.nopcommerce.com/login";

	@Test
	public void part7_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement EmailLogin = driver.findElement(By.id("Email"));
		EmailLogin.clear();
		Thread.sleep(5000);
		EmailLogin.sendKeys("admin@yourstore.com");
		
		// caputured getAttribute value
		System.out.println("result from getAttribute() method::"+EmailLogin.getAttribute("value"));
		System.out.println("result from the data-val-required  getAttribute() method::"+EmailLogin.getAttribute("data-val-required"));
		
		System.out.println("result from gettText() method::"+EmailLogin.getAttribute("value"));
		System.out.println("result from getText() method::"+EmailLogin.getAttribute("value"));

		

		

		Thread.sleep(5000);
		driver.quit();

	}

}
