package Week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Week5Day1.ProjectSpecifiMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact extends ProjectSpecifiMethods {

	@Test
	public void createcon() {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
			driver.findElement(By.id("firstNameField")).sendKeys("Ramya");
			driver.findElement(By.id("lastNameField")).sendKeys("Vittal");
			 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ramyasuku");
			 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Suku");
			 driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("CSE");
			 driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Student of selenium feb 22 batch");
			 driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("ramya.vittal@gmail.com");
			 WebElement el11= driver.findElement(By.name("generalStateProvinceGeoId"));
			 Select dd = new Select(el11);
			 dd.selectByVisibleText("New York");
			 driver.findElement(By.className("smallSubmit")).click();
			 driver.findElement(By.linkText("Edit")).click();
			 driver.findElement(By.id("updateContactForm_description")).clear();
			 driver.findElement(By.name("importantNote")).sendKeys("some values asked to be given");
			 driver.findElement(By.name("submitButton")).click();
			 
			 System.out.println(driver.getTitle());

		

	}

}
