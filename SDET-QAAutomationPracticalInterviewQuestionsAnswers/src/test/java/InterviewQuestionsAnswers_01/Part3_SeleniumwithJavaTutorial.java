package InterviewQuestionsAnswers_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part3_SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url="https://demo.nopcommerce.com/";
	
@Test
	public void part3_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		System.out.println("Title of the web page is :: "+driver.getTitle());
		System.out.println("Current URl the web page is :: "+ driver.getCurrentUrl());
		System.out.println("Page source the web page is :: "+ driver.getPageSource());
		
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
