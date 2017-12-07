package Android;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class WhatsApp_PrintAll {
	DesiredCapabilities dc;
	AndroidDriver<WebElement> d;
  @Test
  public void f()throws Exception {
	  
	  Thread.sleep(1000);
	  d.swipe(695, 309, 10, 340, 1000);
	  for(int i=0;i<10;i++)
	  {
		List<WebElement> t =  d.findElements(By.id("com.whatsapp:id/contactpicker_row_name"));
		for(int j=0;j<t.size();j++){
			
			System.out.println(t.get(j).getText());
		}
		d.swipe(509, 1164, 509, 276, 1000);
	  }
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
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
