package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Printalllinks_selenium4testing {
	WebDriver d;
  @Test
  public void f() {
	 List<WebElement> s = d.findElements(By.tagName("a"));
	 System.out.println(s.size());
	 for(int i=0;i<s.size();i++){
		 System.out.println(s.get(i).getText());
	 }
  }
  @BeforeTest
  public void beforeTest() {
	  
	  d = new FirefoxDriver();
	  d.get("http://selenium4testing.com/");
	  WebElement e = d.findElement(By.id("closediv"));
	  e.click();
  }

  @AfterTest
  public void afterTest() {
	  d.close();
  }

}
