package Android;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class Makemytrip {
	DesiredCapabilities dc;
	WebDriver d;
  @Test
  public void f()throws Exception {
	  d = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
  }
  @BeforeTest
  public void beforeTest() {
	  
	  dc = new DesiredCapabilities();
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("platformVersion","6.0.1");
	  dc.setCapability("deviceName", "MOTO G3(3rd Generation)");
	  dc.setCapability("appPackage", "com.makemytrip");
	  dc.setCapability("appActivity","com.mmt.travel.app.home.ui.ReferralEarningsActivity");
	  
  }

  @AfterTest
  public void afterTest() {
	  d.quit();
  }

}
