package InterviewQuestionsAnswers_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part15_SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@Test
	public void part15_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		String windowID = driver.getWindowHandle();
		System.out.println(windowID);

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windowIDS = driver.getWindowHandles();

		/*Iterator<String> it = windowIDS.iterator();
		String PARENTWINDOWID = it.next();
		String CHILDWINDOWID = it.next();

		System.out.println("P window ID::" + PARENTWINDOWID);
		System.out.println("C window ID::" + CHILDWINDOWID);

		System.out.println("_________________________________________");

		List<String> windowIDList = new ArrayList<>(windowIDS);
		String PwindowID = windowIDList.get(0);
		String CwindowID = windowIDList.get(1);
		System.out.println(PwindowID);
		System.out.println(CwindowID);

		System.out.println("_________________________________________");

		driver.switchTo().window(PARENTWINDOWID);
		System.out.println("parent window id :: " + driver.getTitle());

		driver.switchTo().window(CHILDWINDOWID);
		System.out.println("child winow id :: " + driver.getTitle());*/
		
		List<String> windowIDList = new ArrayList<>(windowIDS);
		
		for(String windID:windowIDList) {
			String title=driver.switchTo().window(windID).getTitle();
			System.out.println(title);
			if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")) {
				Thread.sleep(5000);
				driver.close();		
			}
		}

	}
}
