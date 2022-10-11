package InterviewQuestionsAnswers_01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part10_SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/";

	@Test
	public void part10_1SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		driver.findElement(By.id("justAnInputBox")).click();
		//selectChoiceValues(driver,"choice 1");
		//selectChoiceValues(driver, "choice 1","choice 2","choice 3","choice 4","choice 5");
		selectChoiceValues(driver, "all");

	}
	public static void selectChoiceValues(WebDriver driver, String... value) throws Throwable {
		List<WebElement> comboTreeTitle = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

		if (!value[0].equalsIgnoreCase("All")) {
			for (WebElement item : comboTreeTitle) {
				String text = item.getText();

				for (String val : value) {
					if (text.equals(val)) {
						item.click();
						break;
					}
				}
			}
		} 
		else 
		{
			try {
			for (WebElement item : comboTreeTitle) {
				item.click();
			}
			}catch (Exception e) {
				
			}
		}
		Thread.sleep(5000);
		driver.quit();
	}
}
