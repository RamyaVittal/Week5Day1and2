package Week5Day1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Day1Assign2TestAttributes {
	
@Test(priority=-1)	
public void TC001() {
	System.out.println("This TC001 will be executed first as per Alphabetical order");
}
@Test(dependsOnMethods="TC001")
public void TC002() {
	System.out.println("This TC002 will be executed Second as per Alphabetical order");

}
@Test(priority=-2)
public void TC003() {
	System.out.println("This TC003 will be executed Third as per Alphabetical order");

}
@Test
@Ignore
public void TC004() {
	System.out.println("This TC004 will be executed fourth as per Alphabetical order");

}
@Test(enabled=false)
public void TC005() {
	System.out.println("This TC005 will be executed fifth as per Alphabetical order");

}
@Test()
public void TC006() {
	System.out.println("This TC006 will be executed Sixth as per Alphabetical order");

}
}
