package InterviewQuestionsAnswers_01;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part30_SeleniumwithJavaTutorial {
	public static WebDriver driver;
	public static String url = "https://file-examples.com/index.php/sample-documents-download/sample-pdf-download//";
	
	
	@Test
	public void part29_SeleniumwithJavaTutorial() throws Throwable {
		 String location=System.getProperty("user.dir")+"\\Download\\";
		HashMap preference=new HashMap();
		preference.put("plugins.always_open_pdf_externally",true);
		preference.put("download.default_directory", location);
		
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("prefs", preference);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();

		
	}
}
