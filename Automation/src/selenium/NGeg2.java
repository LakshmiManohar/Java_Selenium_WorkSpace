package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NGeg2 {
	public WebDriver d; 
	
	public void click(String s){
		d.findElement(By.linkText(s)).click();
	}
  @Test
  public void f() {
	  click("Selenium FAQs");
	  click("Core Java FAQs");
	  click("General Testing FAQs");
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  d = new FirefoxDriver();
	  d.get("http://selenium4testing.com/");
	  Thread.sleep(2000);
	  d.findElement(By.id("closediv")).click();
  }

  @AfterTest
  public void afterTest() {
	  d.quit();
  }

}
