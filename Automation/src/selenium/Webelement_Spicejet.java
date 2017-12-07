/*Program to click on leaving from field and click on Hyderabad and  check that hyderabad is not available in going to field @Test on www.spicejet.com */
package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Webelement_Spicejet {
	public WebDriver d;
  @Test(description = "Two way search")
  public void test01() {
	  d.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		d.findElement(By.linkText("Hyderabad (HYD)")).click();
		String s; 
		s = d.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']")).getText();
		System.out.println(s);
		String [] str = s.split("\n");
		for(int i=0;i<str.length;i++)
		{
			if(str[i].contains("Hyderabad")){
			System.out.println("Available");
			}else{
				System.out.println("Not Available");
			}
		}
		
  }
  @BeforeTest
  public void beforeTest() {
	  d = new FirefoxDriver();
 	 d.get("http://www.spicejet.com/");
 	 d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  d.quit();
  }

}
