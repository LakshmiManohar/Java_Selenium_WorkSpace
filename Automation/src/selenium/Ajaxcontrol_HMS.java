package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Ajaxcontrol_HMS {
	
	WebDriver d; 
	
  @Test
  public void f() throws Exception {
	  
	  d.findElement(By.linkText("HMS")).click();
	  d.navigate().to("http://selenium4testing.com/hms/");
	  d.findElement(By.name("username")).sendKeys("user1");
	  d.findElement(By.name("password")).sendKeys("user1");
	  Robot r = new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  d.findElement(By.linkText("ADT")).click();
	  d.findElement(By.name("MR_NO")).sendKeys("PR");
	  Thread.sleep(1000);
	  String s = d.findElement(By.xpath(".//*[@id='results']")).getText();
	  String [] str = s.split("\n");
	  for(int i=0;i<str.length;i++){
		  System.out.println(str[i]+"\n\n");
		  if(str[i].equalsIgnoreCase("PR1656632077")){
			  d.findElement(By.name("MR_NO")).clear();
			  d.findElement(By.name("MR_NO")).sendKeys(str[i]);
		  }else{
			  System.out.println("Not Available");
		  }
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  d = new FirefoxDriver();
	  d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  d.get("https://www.google.co.in/");
	  d.findElement(By.id("lst-ib")).sendKeys("selenium4testing");
	  d.findElement(By.linkText("selenium For Testing")).click();
	  d.findElement(By.id("closediv")).click();
  }

  @AfterTest
  public void afterTest()throws Exception {
	  
	  Thread.sleep(3000);
	  d.close();
  }

}
