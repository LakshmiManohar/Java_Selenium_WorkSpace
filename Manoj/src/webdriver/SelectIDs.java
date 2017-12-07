package webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SelectIDs {
	public WebDriver d;
  @Test
  public void f() {
	  List<WebElement> l=d.findElements(By.tagName("input"));
	  System.out.println(l.size());
	  for(int i=1;i<=l.size();i++){
		 if(l.get(i).getAttribute("type").equalsIgnoreCase("text")){
			 System.out.println(l.get(i).getAttribute("name"));
		 }
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium_library\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("http://selenium4testing.com/hms/");
  }

  @AfterTest
  public void afterTest() {
  }

}
