package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class WebElement_HMS2 {
	WebDriver d;
	  @Test(description = "HMS, Check the Record in the table")
	  public void Test01() {
		  d.findElement(By.linkText("HMS")).click();
		  d.navigate().to("http://selenium4testing.com/hms/");
		  d.findElement(By.name("username")).sendKeys("user1");
		  d.findElement(By.name("password")).sendKeys("user1");
		  d.findElement(By.name("submit")).click();
		  d.findElement(By.linkText("Registration")).click();
		  String s;
		  s = d.findElement(By.className("box")).getText();
		  System.out.println(s+"\n\n");
		  String [] str = s.split("\n");
		 for(int i=0;i<str.length;i++){
	
			  if(str[i].contains("*")){
				  
				  if(str[i].equalsIgnoreCase("Last Name*"))
				  {
				  System.out.println("\n"+str[i]);
				  }
				  else if(str[i].equalsIgnoreCase("Gender*"))
				  {
					  System.out.println(str[i]);
				  }
			  }
		 }
		  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  d = new FirefoxDriver();
		  d.get("http://selenium4testing.com/");
		  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  d.findElement(By.id("closediv")).click();
		  
	  }

	  @AfterTest
	  public void afterTest() {
		  d.close();
	  }

	}
