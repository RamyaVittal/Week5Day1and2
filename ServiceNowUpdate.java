package Week5Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ServiceNowUpdate extends ServicenowBase {

@Test
public void update() throws InterruptedException {
	WebElement a = driver.findElement(By.id("filter"));
	a.sendKeys("incidents");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[text()='Incidents'])[1]")).click();
	Thread.sleep(2000);
	driver.switchTo().frame("gsft_main");
	driver.findElement(By.xpath("//tbody[@class='list2_body']//following::a[@class='linked formlink']")).click();
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='incident.urgency']"));
	Select dd = new Select(dropdown);
	dd.selectByVisibleText("1 - High");
	WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='incident.state']"));
	Select dd1 = new Select(dropdown1);
	dd1.selectByVisibleText("In Progress");
	driver.findElement(By.xpath("//button[@id='sysverb_update']")).click();
	driver.findElement(By.xpath("//tbody[@class='list2_body']//following::a[@class='linked formlink']")).click();
	String urg = driver.findElement(By.xpath("(//option[@selected='SELECTED'])[1]")).getText();
	String stat = driver.findElement(By.xpath("(//option[@selected='SELECTED'])[2]")).getText();
	if(urg.equalsIgnoreCase("1 - High")&&stat.equalsIgnoreCase("In Progress")) {
		System.out.println("Successfully Updated");
	}
	
}}
