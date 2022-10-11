package InterviewQuestionsAnswers_01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part14_SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://itera-qa.azurewebsites.net/home/automation";

	@Test
	public void part14_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		// select specific check box
		// driver.findElement(By.id("monday")).click();

		List<WebElement> checkboxDay = driver
				.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("Number of day in check box::" + checkboxDay.size());

		// using for loop

		
		  for(int i=0;i<checkboxDay.size();i++) { checkboxDay.get(i).click(); }
		 

		// using for.. each loop
		
		  for(WebElement box:checkboxDay) { box.click(); }
		 

		// select multiple check box by choice
		
		  for (WebElement dayName : checkboxDay) { String checkboxName =
		  dayName.getAttribute("id"); if (checkboxName.contains("mon") ||
		  checkboxName.contains("sun")) { dayName.click();
		  
		  } }
		 
		int checkboxName = checkboxDay.size();
		for (int i = checkboxName - 3; i < checkboxName; i++) {
			checkboxDay.get(i).click();
		}

		int checkboxName1 = checkboxDay.size();
		
		for(int i=0;i<checkboxName1;i++) {
			if(i<5) {
				checkboxDay.get(i).click();
			}
		}
		Thread.sleep(5000);
		driver.quit();

	}
}
