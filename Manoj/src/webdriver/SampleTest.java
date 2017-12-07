package webdriver;

import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.ast.NewExpression;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.nio.NetworkTrafficSelectChannelConnector;
import org.testng.annotations.AfterTest;

public class SampleTest {
	public WebDriver d;
  @Test
  public void f() {
	  d.findElement(By.id("name_3_firstname")).sendKeys("Manoj");
	  d.findElement(By.name("last_name")).sendKeys("Kumar");
	  d.findElement(By.name("radio_4[]")).click();
	  d.findElement(By.name("checkbox_5[]")).click();
	  new Select(d.findElement(By.id("dropdown_7"))).selectByVisibleText("India");
	  new Select(d.findElement(By.id("mm_date_8"))).selectByVisibleText("5");
	  new Select(d.findElement(By.name("date_8[date][dd]"))).selectByVisibleText("10");
	  new Select(d.findElement(By.id("yy_date_8"))).selectByVisibleText("1993");
	  d.findElement(By.id("username")).sendKeys("gjvmanoj");
	  d.findElement(By.id("phone_9")).sendKeys("8500416264");
	  d.findElement(By.id("email_1")).sendKeys("gjvmanoj@gmail.com");
	  d.findElement(By.id("profile_pic_10")).sendKeys("D:\\Manu.png");
	  d.findElement(By.id("password_2")).sendKeys("Guggilam@75");
	  d.findElement(By.id("confirm_password_password_2")).sendKeys("Guggilam@75");
	  d.findElement(By.id("piereg_passwordStrength")).click();
	  d.findElement(By.name("pie_submit")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium_library\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("http://demoqa.com/registration/");
	//d.manage().window().maximize();
	  //d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  d.close();
  }

}
