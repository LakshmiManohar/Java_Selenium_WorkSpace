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

public class AppiumTest {
	DesiredCapabilities dc;
	WebDriver  d;
  @Test
  public void test01() throws Exception {
	  
	 d.findElement(By.id("android:id/button2")).click();
	 d.findElement(By.id("com.vl.spicejet:id/btn_flight_booking")).click();
	 d.findElement(By.id("com.vl.spicejet:id/radio_oneway")).click();
	 d.findElement(By.id("com.vl.spicejet:id/fromtv")).click();
	  d.findElement(By.id("com.vl.spicejet:id/et_search")).sendKeys("VGA");
	  d.findElement(By.id("com.vl.spicejet:id/tv_city_name")).click();
	  d.findElement(By.id("com.vl.spicejet:id/totv")).click();
	  d.findElement(By.id("com.vl.spicejet:id/et_search")).sendKeys("BLR");
	  d.findElement(By.id("com.vl.spicejet:id/tv_city_name")).click();
	  d.findElement(By.id("com.vl.spicejet:id/find_flights")).click(); 
	  
	  
  }

@BeforeTest
  public void beforeTest()throws Exception {
	  
	  dc = new DesiredCapabilities();
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("platformVersion", "6.0.1");
	  dc.setCapability("deviceName", "Moto G3 (3rd Generation)");
	  dc.setCapability("appPackage", "com.vl.spicejet");
	  dc.setCapability("appActivity","com.vl.spicejet.modules.dispatchmodule.SplashScreenActivity");
	  d = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	  d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest()throws Exception {
	  while(d.findElement(By.className("android.widget.LinearLayout")).isDisplayed()){
		  Thread.sleep(1000);
		  break;
	  }
	d.quit();
  }

}
