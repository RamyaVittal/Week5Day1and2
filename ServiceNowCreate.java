package Week5Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ServiceNowCreate extends ServicenowBase implements ServiceNowInterface{
	
	@Test
	public void CreateIncident() throws InterruptedException {
		
		WebElement a = driver.findElement(By.id("filter"));
		a.sendKeys("incidents");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Incidents'][1]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//a[@class='breadcrumb_link']/b[text()='All']")).click();
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		String incidentid = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		//driver.findElement(By.xpath("//input[@id='sys_display.incident.caller_id']")).sendKeys("Ramya");
		
		driver.findElement(By.id("lookup.incident.caller_id")).click();
		 Set<String> allWindowHandleSet = driver.getWindowHandles();
		 List<String> allWindowHandleList = new ArrayList<String>();
		 allWindowHandleList.addAll(allWindowHandleSet);
		 String newWindow = allWindowHandleList.get(1);
		 driver.switchTo().window(newWindow);
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//td[3]/a[@class='glide_ref_item_link'][1]")).click();
		 Thread.sleep(2000);
		 System.out.println("Something to check if the above code executed without any issue");
		 String defaultWin = allWindowHandleList.get(0);
		 driver.switchTo().window(defaultWin);
		driver.switchTo().frame("gsft_main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.id("incident.short_description")).sendKeys("Some description to be added");
		 driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("RamyaABCDEFG");
			driver.findElement(By.xpath("//button[@id='sysverb_insert']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Search' and @class='form-control']")).sendKeys(incidentid,Keys.ENTER);
		 Thread.sleep(1000);
		 WebElement tablecol3=driver.findElement(By.xpath("//tbody[@class='list2_body']//following::a[@class='linked formlink']"));
		String firstcol3val = tablecol3.getText();
		if(incidentid.equals(firstcol3val)) {
			System.out.println("Incident successfully created");
		}

	}

}
