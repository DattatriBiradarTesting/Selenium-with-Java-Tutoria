package InterviewQuestionsAnswers_05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part17_SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://the-internet.herokuapp.com/javascript_alerts";

	@Test
	public void part17_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
		Alert alertwindow = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("The message displaeyed on alert:: " + alertwindow.getText());
		Thread.sleep(3000);
		alertwindow.sendKeys("Vinayak");
		Thread.sleep(3000);
		alertwindow.accept();

		
	}
}
