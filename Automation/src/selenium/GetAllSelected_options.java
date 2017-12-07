package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class GetAllSelected_options {
	WebDriver d;
  @Test
  public void f() throws Exception{
	 
	  d.findElement(By.xpath(".//*[@id='header']/ul/li[3]/a")).click();
	  d.findElement(By.linkText("Advanced Search")).click();
	  new Select(d.findElement(By.name("product"))).selectByVisibleText("ERP");
	  new Select(d.findElement(By.name("product"))).selectByVisibleText("HMS");
	  new Select(d.findElement(By.name("product"))).selectByVisibleText("Spicejet");
	 List<WebElement> s = new Select(d.findElement(By.name("product"))).getAllSelectedOptions();
	 System.out.println(s.size());
	 for(int i=0;i<s.size();i++){
		 System.out.println(s.get(i).getText());
	 }
  }
  @BeforeTest
  public void beforeTest() {
	  d = new FirefoxDriver();
	 /* d.get("http://selenium4testing.com/");
	  d.findElement(By.id("closediv")).click();
	  d.findElement(By.linkText("Bugzilla")).click();
	  d.navigate().to("http://selenium4testing.org/");*/
	  d.get("http://selenium4testing.org/");
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
	  d.close();
  }

}
