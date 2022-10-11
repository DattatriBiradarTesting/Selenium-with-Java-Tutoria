package InterviewQuestionsAnswers_08;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class part21_2SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://www.dummyticket.com/dummy-ticket-for-visa-application/";

	@Test
	public void part21_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(url);

		String caleder = "//input[@id='dob']";
		driver.findElement(By.xpath(caleder)).click();

		String month = "//select[@class='ui-datepicker-month']";
		Select month_drp = new Select(driver.findElement(By.xpath(month)));
		month_drp.selectByVisibleText("Nov");

		String year = "//select[@class='ui-datepicker-year']";
		Select year_drp = new Select(driver.findElement(By.xpath(year)));
		year_drp.selectByVisibleText("1999");

		String Date = "15";
		String DateAll = "//table[@class='ui-datepicker-calendar']//td";
		List<WebElement> allDates = driver.findElements(By.xpath(DateAll));

		for (WebElement ele : allDates) {
			String dt = ele.getText();
			if (dt.equals(Date)) {
				ele.click();
				break;
			}
		}
	}
}
