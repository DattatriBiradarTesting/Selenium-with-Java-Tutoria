package InterviewQuestionsAnswers_01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part11_SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://www.google.com/";

	@Test
	public void part11_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		driver.findElement(By.name("q")).sendKeys("java tutorial");

		Thread.sleep(3000);
		List<WebElement> googleList = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
		System.out.println("Size of AutoSuggestions :: " + googleList.size());
		
		for(WebElement listItem:googleList)
		{
			if(listItem.getText().contains("java tutorial geeksforgeeks")) {
				listItem.click();
				break;
			}
		}
	
		Thread.sleep(5000);
		driver.quit();
	}
}
