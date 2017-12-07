package Android;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class AppBrowser {
	DesiredCapabilities dc;
	AndroidDriver<WebElement> d;
  @Test
  public void f() throws Exception{
	 
	  d.findElement(By.id("closediv")).click();
	  d.findElement(By.linkText("Manual FAQs")).click();
	  Thread.sleep(2000);
	  d.findElement(By.linkText("Selenium FAQs")).click();
	  Thread.sleep(2000);
	  d.findElement(By.linkText("Core Java FAQs")).click();
	  Thread.sleep(2000); 
  }
  @BeforeTest
  public void beforeTest() throws Exception{
	  
	  dc = new DesiredCapabilities();
	  dc.setCapability("platformName","Andriod");
	  dc.setCapability("platformVersion", "6.0.1");
	  dc.setCapability("deviceName", "Moto G (3rd Generation)");
	  dc.setCapability("browserName", "Chrome");
	 // dc.setCapability("appPackage", "com.android.chrome");
	  //dc.setCapability("appActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");
	 // dc.setCapability("appActivity", "org.chromium.chrome.browser.ChromeTabbedActivity");
	  d=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub") ,dc);
	  
	  d.get("http://selenium4testing.com/");
	  
	  //d.navigate().to("http://selenium4testing.com/");
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
	 d.close();
  }

}
