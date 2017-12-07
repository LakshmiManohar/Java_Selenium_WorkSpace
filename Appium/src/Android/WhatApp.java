package Android;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class WhatApp {
	DesiredCapabilities dc;
	WebDriver d;
  @Test
  public void test01()throws Exception {
	  d = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	  d.findElement(By.id("com.whatsapp:id/menuitem_search")).click();
	  d.findElement(By.id("com.whatsapp:id/search_src_text")).sendKeys("sai");
	  d.findElement(By.id("com.whatsapp:id/conversations_row_contact_name")).click();
	  for(int i= 0;i<10;i++){
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	  
	  d.findElement(By.className("android.widget.EditText")).sendKeys("Appium Test");
	  d.findElement(By.id("com.whatsapp:id/send")).click();}
	  

  }
  @BeforeTest
  public void beforeTest() {
	  
	  dc = new DesiredCapabilities();
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("platformVersion", "6.0.1");
	  dc.setCapability("deviceName", "MOTO G3(3rd Generation)");
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.Main");
  }

  @AfterTest
  public void afterTest() {
	  
	  d.quit();
	  
	
  }

}
