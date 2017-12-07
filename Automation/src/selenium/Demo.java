package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Demo {
	WebDriver d;
  @Test
  public void f() {
	  
	  Dimension dem = d.findElement(By.name("firstname")).getSize();
	  System.out.println("Height:"+ dem.height + "Width:"+dem.width);
	   d.findElement(By.name("firstname")).sendKeys("Manooooooo");
	   d.findElement(By.name("firstname")).clear();
	   Point p = d.findElement(By.name("firstname")).getLocation();
	   System.out.println("x co-ordinate"+p.x+"y Co-ordinate"+p.y);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium_library\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("http://toolsqa.wpengine.com/automation-practice-form/");
	  d.manage().window().maximize();
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
