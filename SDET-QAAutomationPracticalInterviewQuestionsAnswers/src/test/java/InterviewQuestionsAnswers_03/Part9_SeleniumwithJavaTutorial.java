package InterviewQuestionsAnswers_03;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Part9_SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url = "https://www.hdfcbank.com/";

	@Test
	public void part8_1SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		List<WebElement> ProductType = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));

		System.out.println("Number of Options1 ::" + ProductType.size());
		for (WebElement ptype : ProductType) {
			if (ptype.getText().equals("Accounts")) {
				ptype.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		List<WebElement> SelectProduct = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		System.out.println("Number of Options2 :: "+SelectProduct.size());
		for(WebElement Accounts:SelectProduct) {
			if(Accounts.getText().equals("Current Accounts")) {
				Accounts.click();
				break;
			}
		}

		Thread.sleep(5000);
		driver.quit();
	}
}
