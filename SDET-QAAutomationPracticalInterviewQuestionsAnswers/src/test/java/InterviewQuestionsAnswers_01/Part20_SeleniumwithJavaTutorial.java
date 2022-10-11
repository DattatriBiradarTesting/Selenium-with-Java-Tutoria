package InterviewQuestionsAnswers_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part20_SeleniumwithJavaTutorial {

	public static WebDriver driver;
	public static String url = "https://demo.opencart.com/admin/";

	@Test
	public void part20_SeleniumwithJavaTutorial() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(url);

		driver.findElement(By.name("username")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//a[normalize-space(text()) ='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();

		String text = driver.findElement(By.xpath("//*[@id='form-order']/div[2]/div[2]")).getText();
		System.out.println(text);

		int total_pages = Integer.valueOf(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));
		System.out.println("Total Number of pages:: " + total_pages);

		for (int p = 1; p <= 5; p++) {
			Thread.sleep(3000);
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			System.out.println("Active Page :: " + active_page.getText());
			Thread.sleep(3000);
			active_page.click();

			Thread.sleep(3000);
			int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr"))
					.size();
			System.out.println("Number of Rows:: " + rows);
			
			for(int r=1;r<=rows;r++) {
	 String OrderID=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
	 String StoreName= driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
	 String CustomerDaitels=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
     String statusID=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
     
          if(statusID.equals("Pending")) {
    	 System.out.println(OrderID+"   "+StoreName+"   "+CustomerDaitels+"   "+statusID);
    	 
     }
			}

			String pageno = Integer.toString(p + 1);
			driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='" + pageno + "']")).click();
		}

	}
}
