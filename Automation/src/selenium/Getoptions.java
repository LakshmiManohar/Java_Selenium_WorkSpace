package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Getoptions {
	
	WebDriver d;
	
  @Test
  public void f() {
	  
	 List<WebElement> s = new Select(d.findElement(By.id("ctl00_mainContent_ddl_Adult"))).getOptions();
	 System.out.println(s.size());
	 for(int i=0;i<s.size();i++){
		 if(s.get(i).getText().equalsIgnoreCase("1 Adult")){
		 System.out.println(s.get(i).getText() + " is Available");
	 }else
	 {
		 System.out.println("Not Aviable");
	 }
	 }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  d =new FirefoxDriver();
	  d.get("http://www.spicejet.com/");
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
	  d.close();
	  
  }

}
