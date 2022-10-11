package InterviewQuestionsAnswers_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Part8_SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url = "https://www.opencart.com/index.php?route=account/register";

	@Test
	public void part8_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement input_country = driver.findElement(By.id("input-country"));
		Select countryName = new Select(input_country);
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,300)", "");

		/*
		 * countryName.selectByVisibleText("American Samoa"); Thread.sleep(5000);
		 * countryName.selectByValue("10"); Thread.sleep(5000);
		 * countryName.selectByIndex(13);
		 */

		// selecting option from dropdown without using methods
		List<WebElement> allOptons = countryName.getOptions();
		for(WebElement option:allOptons) {
			if(option.getText().equals("Philippines")) {
				option.click();
				break;
			}
		}

		Thread.sleep(5000);
		driver.quit();

	}

}
