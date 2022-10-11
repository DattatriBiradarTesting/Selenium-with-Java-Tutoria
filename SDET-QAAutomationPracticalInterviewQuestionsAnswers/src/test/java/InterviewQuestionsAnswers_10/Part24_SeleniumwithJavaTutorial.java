package InterviewQuestionsAnswers_10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part24_SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url = "https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/";

	@Test
	public void part2_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		WebElement min_sider = driver.findElement(By.xpath("//span[1]"));
		System.out.println("Location of the min size slider:: " + min_sider.getLocation());
		System.out.println("Hight wight the element ::" + min_sider.getSize());

		Actions act = new Actions(driver);
		act.dragAndDropBy(min_sider, 100, 0).perform();
		System.out.println("Location of the min size slider:: " + min_sider.getLocation());
		System.out.println("Hight wight the element ::" + min_sider.getSize());

		WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
		act.dragAndDropBy(max_slider, -100, 0).perform();
		System.out.println("MAX Location of the min size slider:: " + max_slider.getLocation());
		System.out.println("MAX Hight wight the element ::" + max_slider.getSize());

		Thread.sleep(9000);
		driver.quit();
	}
}
