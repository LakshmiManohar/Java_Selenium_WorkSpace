package Android;

import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.URL;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.AfterTest;

public class WhatApp_Advanced {
	
	DesiredCapabilities dc;
	AndroidDriver<WebElement> d;

	
  @Test
  public void f()throws Exception {
	 
	  WebElement str = d.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.whatsapp:id/conversations_row_contact_name\").text(\"Alekhaya\")");
		 TouchAction t = new TouchAction(d);
	  t.longPress(str).release().perform();
	  d.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.whatsapp:id/menuitem_conversations_delete\")").click();
	  d.findElementByAndroidUIAutomator("UiSelector().text(\"Cancel\")").click();
	  
/*	d.findElementByAndroidUIAutomator("UiSelector().text(\"CONTACTS\")").click();
	d.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.whatsapp:id/menuitem_search\").description(\"Search\")").click();
    d.findElementByAndroidUIAutomator("UiSelector().text(\"Search…\")").sendKeys("Sai");
    d.findElementByAndroidUIAutomator("UiSelector().text(\"Sai kishore@ssc\")").click();
    d.navigate().back();
    d.findElementByAndroidUIAutomator("UiSelector().text(\"CHATS\")").click();
    d.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.whatsapp:id/conversations_row_contact_name\").text(\"Alekhaya\")").click();
    d.navigate().back();
    d.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.whatsapp:id/conversations_row_contact_name\").text(\"Enfec....💥⛳❄🍀🏁\")").click();
    d.navigate().back(); 
	  Thread.sleep(2000);
	  d.swipe(649, 350, 140, 342, 1000);
	  Thread.sleep(1000);
    for(int i=0;i<3;i++)
    {	
	List<WebElement> str =   d.findElements(By.id("com.whatsapp:id/contactpicker_row_name"));
         
	 
	 for(int j=0;j<str.size();j++)
	 {	 
	  
	  System.out.println(str.get(j).getText());
	 
	 }
	  
    }   */
  }
  @BeforeTest
  public void beforeTest() throws Exception{
	  
	  dc = new DesiredCapabilities();
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("paltformVersion", "6.0.1");
	  dc.setCapability("deviceName", "Moto G (3rd Generation)");
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.Main");
	  d = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
