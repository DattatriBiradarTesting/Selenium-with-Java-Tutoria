package InterviewQuestionsAnswers_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Part6_SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url = "https://demo.nopcommerce.com/";

	@Test
	public void part6_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		// findElement single webelement
		String smallsearchterms = "small-searchterms";
		WebElement smallsearchterm = driver.findElement(By.id(smallsearchterms));
		smallsearchterm.sendKeys("Vinayak");

		// findElements multiple webelement
		String headermenu = "//div[@class='footer-upper']//a";
		List<WebElement> menuHader = driver.findElements(By.xpath(headermenu));
		System.out.println("Number Multiple Links Caputur:: " + menuHader.size());
		for (WebElement link : menuHader) {
			System.out.println(link.getText());
		}

		Thread.sleep(5000);
		driver.quit();

	}

}
