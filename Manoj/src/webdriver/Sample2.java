package webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Sample2 {
	public WebDriver d;
  @Test
  public void f() {
	  d.findElement(By.linkText("Demo")).click();
	  d.findElement(By.linkText("Draggable")).click();
	  d.findElement(By.id("draggable")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium_library\\chromedriver.exe");
	  d = new ChromeDriver();
	  //d.manage().window().maximize();
	  d.get("http://demoqa.com/");
	  //d.manage().window().timeouts().
  }

  @AfterTest
  public void afterTest() {
	  //d.close();
  }

}
