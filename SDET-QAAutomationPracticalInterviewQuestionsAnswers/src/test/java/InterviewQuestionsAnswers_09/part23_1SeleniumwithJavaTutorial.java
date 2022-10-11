package InterviewQuestionsAnswers_09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class part23_1SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";

	@Test
	public void part2_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		WebElement Washington = driver.findElement(By.id("box3"));
		WebElement UnitedStates = driver.findElement(By.id("box103"));
		
		WebElement Rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement Italy=driver.findElement(By.id("box106"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(Washington, UnitedStates).perform();
	
		act.dragAndDrop(Rome, Italy).perform();
	}

}
