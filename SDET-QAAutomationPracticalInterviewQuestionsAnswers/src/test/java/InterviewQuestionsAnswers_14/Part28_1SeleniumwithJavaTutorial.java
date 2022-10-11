package InterviewQuestionsAnswers_14;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part28_1SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url = "https://demo.nopcommerce.com/";

	@Test
	public void part27_1SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		/*//Drawing border & Take screenShort
		WebElement Electronics = driver.findElement(By.xpath("//img[@title='Show products in category Electronics']"));
		JavaScriptUtil.drawBroder(Electronics, driver);
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File src=shot.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshots\\Electronics.png");
		FileUtils.copyFile(src, trg);
		
		
		// Getting title of the page
		String title=JavaScriptUtil.getTitleByjs(driver);
		System.out.println(title);
		
		//Click Action
		WebElement Digitaldownloads=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[4]/a"));
		JavaScriptUtil.clickElementByjs(Digitaldownloads, driver);
		
		//Generate alert
		JavaScriptUtil.generateAlert(driver, "This is Alert Popup Window");
		
		//Refreshing the page
		JavaScriptUtil.refreshBrowserByJs(driver);
		
		//Scrolling down page
		JavaScriptUtil.scrollPageDown(driver);
		Thread.sleep(5000);
		
		//Scrolling Up Page
		JavaScriptUtil.scrollPageUp(driver);
		
		//ZoomPage
		JavaScriptUtil.zoomPageByJa(driver);*/
		WebElement Electronics = driver.findElement(By.xpath("//img[@title='Show products in category Electronics']"));
		JavaScriptUtil.flash(Electronics, driver);
		
		//flash
		
		
		
		Thread.sleep(9000);
		driver.quit();
	}
}
