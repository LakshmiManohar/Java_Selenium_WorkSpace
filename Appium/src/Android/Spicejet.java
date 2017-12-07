package Android;

import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class Spicejet {
	DesiredCapabilities dc;
	AndroidDriver<WebElement> d;
	
  @Test(description = "two way Search")
  public void test01()throws Exception {
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  d.findElementByAndroidUIAutomator("UiSelector().text(\"No\")").click();
	  d.findElementByAndroidUIAutomator("UiSelector().text(\"Flight Booking\")").click();
	  d.findElementByAndroidUIAutomator("UiSelector().text(\"DEL\")").click();
	WebElement str = d.findElement(By.xpath("//android.widget.TextView[@text='Chennai, MAA']"));
			//findElementByAndroidUIAutomator("UiSelctor().class(\"android.widget.TextView\").text(\"Chennai, MAA\")");
	TouchAction t = new TouchAction(d);
	 t.tap(str).release().perform();
	  d.findElementByAndroidUIAutomator("UiSelector().text(\"BOM\")").click();
	  d.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.vl.spicejet:id/tv_city_name\").text(\"Bengaluru, BLR\")").click();
	  d.findElementByAndroidUIAutomator("UiSelector().text(\"DEPART ON\")").click();
	  d.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.vl.spicejet:id/nextMonthArrowLayout\")").click();
	  d.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.vl.spicejet:id/dateTextView\").text(\"16\")").click();
	  d.findElementByAndroidUIAutomator("UiSelector().text(\"RETURN ON\")").click();
	 // d.findElement(By.xpath("android.widget.ImageView[@index='0']")).click();
	  //d.tap(1, 563, 576, 1000);
	  d.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.vl.spicejet:id/nextMonthArrowLayout\")").click();
	  d.findElementByAndroidUIAutomator("UiSelector().text(\"29\")").click();
	  d.findElementByAndroidUIAutomator("UiSelector().text(\"Search Flights\")").click();
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  dc = new DesiredCapabilities();
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("platformName", "6.0.1");
	  dc.setCapability("deviceName", "Moto G (3rd Generation)");
	  dc.setCapability("appPackage", "com.vl.spicejet");
	  dc.setCapability("appActivity", "com.vl.spicejet.modules.dispatchmodule.SplashScreenActivity");
	  d = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	  
	 // d = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
