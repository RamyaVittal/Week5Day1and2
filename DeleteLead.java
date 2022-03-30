package Week2day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Week5Day1.ProjectSpecifiMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead extends ProjectSpecifiMethods {

	@Test
	public void delete() throws InterruptedException {
		// TODO Auto-generated method stub
		
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		 WebElement e3 = driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]"));
		 e3.click();
		 driver.findElement(By.xpath("//span[@class='x-tab-strip-text ' and contains(text(),'Phone')]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	//	WebElement e1 = driver.findElement(By.name("phoneCountryCode"));
	//	e1.clear();
//	e1.sendKeys("1");
	//driver.findElement(By.name("phoneAreaCode")).sendKeys("1");
		 driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
		 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		 Thread.sleep(3000);
		 WebElement e2 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//descendant::a[@class='linktext'][1]"));
		 String LeadID = e2.getText();
		 System.out.println(LeadID);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			e2.click();// if referred by e2, getting stale exception
		 driver.findElement(By.linkText("Delete")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();// if referred by e3, stale exception
driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadID);
driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
//String verification = driver.findElement(By.xpath("//table/following::div[@class='x-paging-info']")).getText();
List<WebElement> l= driver.findElements(By.xpath("//*[contains(text(),'No records to display')]"));
// verify list size
if ( l.size() > 0){
   System.out.println("Verified! No records to display is present");
} else {
   System.out.println("not deleted properly ");
}
}
//System.out.println( "No records to display :"+verification.equals("No records to display"));
//driver.close();
	}


