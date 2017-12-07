package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Validation_commands {
	 public WebDriver d;
  @Test(description = "isDispalyed")
  public void test01() {
	  
	  String s = "ctl00_mainContent_txt_Fromdate";
	  Assert.assertEquals(d.findElement(By.id(s)).isDisplayed(),true);
	 // Assert.assertEquals(d.findElement(By.id(s)).isDisplayed(), false);
  }
  @Test(description = "isEnabled")
  public void test02() {
	  
	  String s = "ctl00_mainContent_rbtnl_Trip_0"; //Enabled
	  Assert.assertEquals(d.findElement(By.id(s)).isDisplayed(),true);
	// Assert.assertEquals(d.findElement(By.id(s)).isDisplayed(), false);
	 // String s1 = "ctl00_mainContent_rbtnl_Trip_1"; //Disabled
	//  Assert.assertEquals(d.findElement(By.id(s1)).isDisplayed(),true);
	 // Assert.assertEquals(d.findElement(By.id(s1)).isDisplayed(), false);
  }
  @Test(description = "isSelected")
  public void test03() {
	  
	  String s = "ctl00_mainContent_rbtnl_Trip_0"; 
	 Assert.assertEquals(d.findElement(By.id(s)).isSelected(),true);
	//  Assert.assertEquals(d.findElement(By.id(s)).isSelected(), false);
	 
  }
  @BeforeTest
  public void beforeTest() {
	  d= new FirefoxDriver();
	  d.get("http://www.spicejet.com/");
	  d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
	 d.close();
  }

}
