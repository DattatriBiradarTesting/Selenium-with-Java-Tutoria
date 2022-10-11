package InterviewQuestionsAnswers_04;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part16_SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://www.amazon.com/";

	@Test
	public void part16_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		List<WebElement> amazonLinks = driver.findElements(By.tagName("a"));
		System.out.println("amazon :: " + amazonLinks.size());
		
		//noraml for loop
		/*for(int i=0;i<amazonLinks.size();i++) {
			System.out.println(amazonLinks.get(i).getText());
			System.out.println(amazonLinks.get(i).getAttribute("href"));
		}*/
		
		for(WebElement link:amazonLinks) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}

		
		Thread.sleep(5000);
		driver.quit();
	}
}
