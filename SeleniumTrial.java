package Week1Setup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Week5Day1.ProjectSpecifiMethods;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumTrial extends ProjectSpecifiMethods{

	@Test
		 public void CreateLead() throws InterruptedException {
			

			 WebElement el1=driver.findElement(By.xpath("//input[@id='username']"));
			 el1.sendKeys("demosalesmanager");
			 WebElement el2 = driver.findElement(By.xpath("//input[@id='password']"));
			 el2.sendKeys("crmsfa");
			 WebElement el3 = driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']"));
			 el3.click();
			 WebElement el4 = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
			 el4.click();
			 WebElement el5 = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
			 el5.click();
			 WebElement el6 = driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]"));
			 el6.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			 WebElement el7 = driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']"));
			 el7.sendKeys("Amazon dev centre");
			 WebElement el8 = driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']"));
			 el8.sendKeys("Ram");
			 WebElement el9 = driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']"));
			 el9.sendKeys("Vittal");
			 driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Ramyasuku");
			 driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Computer Science dept");
			 driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Student of selenium feb 22 batch");
			 driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("ramya.vittal@gmail.com");
			 WebElement el11= driver.findElement(By.name("generalStateProvinceGeoId"));
			 Select dd = new Select(el11);
			 dd.selectByVisibleText("New York");
			 WebElement el10 = driver.findElement(By.className("smallSubmit"));
			 el10.click();
			 System.out.println(driver.getTitle());
			 driver.findElement(By.linkText("Edit")).click();
			 driver.findElement(By.id("updateLeadForm_description")).clear();
			 driver.findElement(By.name("importantNote")).sendKeys("some values asked to be given");
			 driver.findElement(By.name("submitButton")).click();
			 
			 System.out.println(driver.getTitle());

			 driver.findElement(By.linkText("Duplicate Lead")).click();
			 Thread.sleep(4000);
			 driver.findElement(By.id("createLeadForm_companyName")).clear();
			 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Freshdesk");
			 driver.findElement(By.id("createLeadForm_firstName")).clear();
			 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ram new");
			 driver.findElement(By.name("submitButton")).click();
			 
			 System.out.println(driver.getTitle());
			 

	}

}
