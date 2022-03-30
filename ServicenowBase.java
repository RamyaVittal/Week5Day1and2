package Week5Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServicenowBase extends ServiceNowLogin{
	public ChromeDriver driver;

	@BeforeMethod
	public void beforeMethodLogin()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev103518.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("SO/53WdBu^et");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}

}
