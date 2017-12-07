package webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class SpiceJetsample {
	public WebDriver d;
  @Test
  public void f() {
	  d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  d.findElement(By.linkText("Goa (GOI)")).click();
	  d.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	  d.findElement(By.linkText("Jaipur (JAI)")).click();
	  d.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[5]/a")).click();
	  //d.findElement(By.cssSelector("css=a.ui-state-default.ui-state-hover")).click();
	  //d.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[2]/a")).click();

	  new Select(d.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']"))).selectByVisibleText("2 Adults");
	  new Select(d.findElement(By.name("ctl00$mainContent$ddl_Child"))).selectByVisibleText("3 Children");
	  new Select(d.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"))).selectByVisibleText("Indian Rupee(INR)");
	  d.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	  String str;
	  str=d.getWindowHandle();
	  d.findElement(By.linkText("popUpConverter")).click();
	  d.switchTo().window("converter");
	  new Select(d.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"))).selectByVisibleText("INR");
	  d.findElement(By.id("ButtonCloseWindow")).click();
	  d.switchTo().window(str);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium_library\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("http://www.spicejet.com/");
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
