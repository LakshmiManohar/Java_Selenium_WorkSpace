package Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class login {
	
 WebDriver d;
  @Test
  public void f() {
	  
	  d.manage().window().maximize();
	  d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  d.findElement(By.name("email")).sendKeys("7799036353");
	  d.findElement(By.name("pass")).sendKeys("Password");
	  d.findElement(By.id("loginbutton")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
	// System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Selenium_library\\geckodriver.exe");
	 //d = new FirefoxDriver();
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium_library\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("https://www.facebook.com/"); 
  }

  @AfterTest
  public void afterTest() {
	  d.quit();
  }

}
