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

public class CallFunctionality {
	
	DesiredCapabilities dc;
	AndroidDriver <WebElement> d;
	
  @Test(description = "Call functionality")
  public void Test01()throws Exception {
	  d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 //d.findElementByAndroidUIAutomator("UiSelector().class(\"android.widget.TextView\").instance(2)").click();
  // d.findElement(By.xpath("//android.widget.TextView[@content-desc = 'Apps']")).click() ; 
	 //d.findElement(By.xpath("//android.widget.TextView[@text='Phone']")).click();
	  Thread.sleep(2000);
// d.findElementByAndroidUIAutomator("UiSelector().package(\"com.google.android.googlequicksearchbox\").class(\"android.widget.TextView\").contentDescription(\"Apps\")").click();
	  
  d.tap(1, 359, 1107, 1);
   //d.navigate().back();
  for(int j=0;j<5;j++){
  List<WebElement> str = d.findElements(By.id("com.google.android.googlequicksearchbox:id/icon"));
  for(int i=0;i<str.size();i++)
  {
	System.out.println(str.get(i).getText());  
  //Thread.sleep(10000);
 //
  }
  d.swipe(664, 1130, 655, 197, 1000);
  }
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  dc = new DesiredCapabilities();
	  dc.setCapability("platFormName", "Android");
	  dc.setCapability("platFormVersion", "6.0.1");
	  dc.setCapability("deviceName", "Moto G (3rd Generation)");
	  dc.setCapability("appPackage","com.google.android.googlequicksearchbox");
	  dc.setCapability("appActivity","com.google.android.launcher.GEL");
	  d= new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	
  }

  @AfterTest
  public void afterTest() {
  }

}
