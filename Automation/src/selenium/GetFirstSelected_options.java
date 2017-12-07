package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class GetFirstSelected_options {
	WebDriver d;
	  @Test
	  public void f() throws Exception{
		 
		  d.findElement(By.xpath(".//*[@id='header']/ul/li[3]/a")).click();
		  d.findElement(By.linkText("Advanced Search")).click();
		  new Select(d.findElement(By.name("product"))).selectByVisibleText("ERP");
		  new Select(d.findElement(By.name("product"))).selectByVisibleText("HMS");
		  new Select(d.findElement(By.name("product"))).selectByVisibleText("Spicejet");
		 WebElement s = new Select(d.findElement(By.name("product"))).getFirstSelectedOption();
		 System.out.println(s.getText());
		 
		
	  }
  @BeforeTest
  public void beforeTest() {
	  d =new FirefoxDriver();
	  d.get("http://selenium4testing.org/");
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  d.close();
  }

}
