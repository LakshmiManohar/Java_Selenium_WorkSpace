package webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class HMS {
	public WebDriver d;
  @Test
  public void test1() {
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  d.findElement(By.id("closediv")).click();
	  d.findElement(By.linkText("HMS")).click();
	  d.navigate().to("http://selenium4testing.com/hms/");
	  d.findElement(By.name("username")).sendKeys("admin");
	  d.findElement(By.name("password")).sendKeys("admin");
	  d.findElement(By.name("submit")).click();
	  d.findElement(By.linkText("ADT")).click();
	  d.findElement(By.linkText("Admission")).click();
	  d.findElement(By.linkText("Admission Work List")).click();
	  
  }
  /*@Test
  public void test2(){
	  d.findElement(By.xpath("//*[@id='navigation']/li[3]/a")).click();
	  String str=d.getWindowHandle();
	  d.switchTo().window("mywindow");
	  //d.findElement(By.linkText("Logout")).click();
	  //d.quit();
	  d.switchTo().window(str);
	  d.findElement(By.linkText("ADT")).click();
  }*/
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
