package InterviewQuestionsAnswers_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part4_SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url = "https://demo.nopcommerce.com/register";

	@Test
	public void part4_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		String smallsearchterms = "small-searchterms";
		String gendermale = "gender-male";
		String genderfemale = "gender-female";

		WebElement smallsearchterm = driver.findElement(By.id(smallsearchterms));
		System.out.println("isDisplayed status :: " + smallsearchterm.isDisplayed());
		System.out.println("isEnabled status :: " + smallsearchterm.isEnabled());

		WebElement male = driver.findElement(By.id(gendermale));
		WebElement female = driver.findElement(By.id(genderfemale));

		System.out.println(male.isSelected());
		System.out.println(female.isSelected());

		male.click();

		System.out.println(male.isSelected());
		System.out.println(female.isSelected());

		female.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());

		Thread.sleep(5000);
		driver.quit();

	}

}
