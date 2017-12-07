package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Robotclass {
	WebDriver d;
  @Test
  public void f() throws Exception {
	  d.findElement(By.id("email")).sendKeys("username");
	  d.findElement(By.id("pass")).sendKeys("password");
	  Robot r = new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  d =new FirefoxDriver();
	  d.get("https://www.facebook.com/");
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  d.quit();
	  
  }

}
