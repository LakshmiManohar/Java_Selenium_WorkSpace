/*Program to navigate into registration page list and print entire web table and check table 467 id is available or not @HMS Wesite */
package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class WebElement_HMs {
	WebDriver d;
  @Test(description = "HMS, Check the Record in the table")
  public void Test01() {
	  d.findElement(By.linkText("HMS")).click();
	  d.navigate().to("http://selenium4testing.com/hms/");
	  d.findElement(By.name("username")).sendKeys("user1");
	  d.findElement(By.name("password")).sendKeys("user1");
	  d.findElement(By.name("submit")).click();
	  d.findElement(By.xpath(".//*[@id='navigation']/li[1]/div")).click();
	  d.findElement(By.linkText("Registration List")).click();
	  String s;
	  s = d.findElement(By.className("box")).getText();
	  System.out.println(s+"\n\n\n");
	  String [] str = s.split("\n");
	  for(int i=0;i<str.length;i++){
		  if(str[i].contains("467")){
	  System.out.println(str[i]);
		  }else{
			  System.out.println("Not Available");
		  }
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  d = new FirefoxDriver();
	  d.get("http://selenium4testing.com/");
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  d.findElement(By.id("closediv")).click();
	  
  }

  @AfterTest
  public void afterTest() {
	  d.close();
  }

}
