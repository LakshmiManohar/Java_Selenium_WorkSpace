package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Printall_dropdownlocators_HMS {
	WebDriver d;
  @Test
  public void f() {
	List<WebElement> s= d.findElements(By.tagName("select"));
	System.out.println(s.size());
	for(int i=0;i<s.size();i++){
		System.out.println(s.get(i).getAttribute("name"));
	}
  }
  @BeforeTest
  public void beforeTest() throws Exception{
	  d = new FirefoxDriver();
	  d.get("http://selenium4testing.com/hms/");
	  d.findElement(By.name("username")).sendKeys("user1");
	  d.findElement(By.name("password")).sendKeys("user1");
	  Robot r = new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  d.findElement(By.xpath(".//*[@id='navigation']/li[1]/div")).click();
	  d.findElement(By.partialLinkText("Registra")).click();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  d.close();
  }

}
