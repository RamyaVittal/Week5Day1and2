package Week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Week5Day1.ProjectSpecifiMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends ProjectSpecifiMethods{

	@Test
	public void Edit() throws InterruptedException {
		// TODO Auto-generated method stub
		
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder']//input[@name='firstName']")).sendKeys("Ramya");
		 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'][1]")).click();
		 System.out.println(driver.getTitle());
driver.findElement(By.xpath("//a[@class='subMenuButton' and contains(text(),'Edit')]")).click();
driver.findElement(By.id("updateLeadForm_companyName")).clear();
String newComp = "xxxxxx";
driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(newComp);
driver.findElement(By.name("submitButton")).click();
WebElement ver = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp' and contains(text(),'xxxxxx')]"));
String v2 = ver.getText();
System.out.println(v2);
if(v2.contains(newComp))
	System.out.println("Company name changed");
else
	System.out.println("Nothing");
		//driver.close();
		
	}

}
