package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Ajaxcontrol {
	WebDriver d;
	
	@Test
  public void test01()throws Exception {
	  
		d.findElement(By.id("sb_ifc0")).sendKeys("Selenium");
		Thread.sleep(1000);
		String s;
		s = d.findElement(By.xpath(".//*[@id='sbtc']/div[2]/div[2]/div[1]/div")).getText();
		String [] str = s.split("\n");
		for(int i=0;i<str.length;i++){
		if(str[i].equalsIgnoreCase("selenium webdriver"))	{
		System.out.println(str[i]);
		d.findElement(By.id("lst-ib")).clear();
		d.findElement(By.id("lst-ib")).sendKeys(str[i]);
		}
	}
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  d = new FirefoxDriver();
	  d.get("https://www.google.co.in");
	  d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 }

  @AfterTest
  public void afterTest() {
	  
	  d.quit();
  }

}
