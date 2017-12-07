package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class WebElement_Spicejet2 {
	WebDriver d;
  @Test(description = "Click on Hyderabad in spice Jet")
  public void test01()throws Exception {
	  d.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
	  String s;
	   s = d.findElement(By.className("mapbg")).getText();	
	   System.out.println(s+"\n\n\n");
	   String [] str = s.split("\n");
	   for(int i=0;i<str.length;i++)
	   {
		   if(str[i].equals("Hyderabad (HYD)"))
		   {
			   System.out.println(str[i]);
			   d.findElement(By.linkText(str[i])).click();
			  
		   }else{
			   System.out.println("Not Available");
		   }
	   }
	   Thread.sleep(1000);
	   d.findElement(By.linkText("Vijayawada (VGA)")).click();
		
		 
  }
  @BeforeTest
  public void beforeTest() {
	  d = new FirefoxDriver();
	  d.get("http://www.spicejet.com/");
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  d.close();
  }

}
