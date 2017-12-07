package webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Sample3 {
	public WebDriver d;
  @Test
  public void f() {
	  d.findElement(By.id("closediv")).click();
	  String str=d.findElement(By.linkText("Manual FAQs")).getText();
	  System.out.println(str);
	  //String s=
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium_library\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("http://selenium4testing.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
