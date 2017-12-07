package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OpenurlTest {
	WebDriver d;
  @Test
  public void f() {
	  d.findElement(By.linkText("Manual FAQs")).click();
	  d.findElement(By.linkText("Selenium FAQs")).click();
	  d.findElement(By.linkText("Core Java FAQs")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium_library\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("http://selenium4testing.com/");
	  d.manage().window().maximize();
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  d.findElement(By.id("closediv")).click();
  }

  @AfterTest
  public void afterTest() {
	d.close();
  }

}
