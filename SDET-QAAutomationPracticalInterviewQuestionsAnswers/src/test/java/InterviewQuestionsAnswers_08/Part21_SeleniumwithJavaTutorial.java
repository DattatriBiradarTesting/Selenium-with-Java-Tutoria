package InterviewQuestionsAnswers_08;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part21_SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://www.redbus.in/";

	@Test
	public void part21_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(url);

		String Year = "2022";
		String month = "Nov";
		String Date = "22";

		String datexpath = "//label[contains(text(),'Date')]";
		driver.findElement(By.xpath(datexpath)).click();

		while (true) {
			String monthTitle = "//td[@class='monthTitle']";
			String monthYear = driver.findElement(By.xpath(monthTitle)).getText();
			String arr[] = monthYear.split(" ");
			String mon = arr[0];
			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(Year))
				break;
			else {
				String button = "//button[normalize-space()='>']";
				driver.findElement(By.xpath(button)).click();
			}

			String DateSelected = "//table[@class='rb-monthTable first last']//td";
			List<WebElement> allDates = driver.findElements(By.xpath(DateSelected));

			for(WebElement ele:allDates) {
				String dt=ele.getText();
				if(dt.equals(Date)) {
					ele.click();
					break;
				}
			}
		}

	
	}
}
