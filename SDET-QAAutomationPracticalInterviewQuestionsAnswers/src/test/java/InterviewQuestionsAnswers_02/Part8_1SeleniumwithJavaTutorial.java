package InterviewQuestionsAnswers_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part8_1SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://letcode.in/dropdowns";

	@Test
	public void part8_1SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		selectOptionDown(fruits, "Mango");
		Thread.sleep(3000);
		
		WebElement superheros = driver.findElement(By.xpath("//select[@id='superheros']"));
		selectOptionDown(superheros, "Captain Marvel");
		Thread.sleep(3000);
		
		WebElement lang = driver.findElement(By.xpath("//select[@id='lang']"));
		selectOptionDown(lang, "Python");
		Thread.sleep(3000);
		
		WebElement country = driver.findElement(By.id("country"));
		selectOptionDown(country, "Colombia");
		Thread.sleep(3000);
		
	}
	public static void selectOptionDown(WebElement ele,String value)   {
		Select drp=new Select(ele) ;
			List<WebElement>allOption=drp.getOptions();
			for(WebElement option:allOption) {
				if(option.getText().equals(value))
				{
					option.click();
					break;
				}
			}
	}
	
}
