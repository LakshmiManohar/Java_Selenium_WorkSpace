package Android;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class Print_allApps_Text {
	DesiredCapabilities dc;
	AndroidDriver<WebElement> d;
  @Test
  public void test01() throws Throwable {
	 File f= new File("C:\\Users\\Manohar\\Desktop\\Apps.txt");
	  FileWriter fw = new FileWriter(f);
	  BufferedWriter bw = new BufferedWriter(fw);
	  Thread.sleep(1000);
	  d.tap(1, 351, 1107, 1);
	  for(int j=0;j<5;j++){
	  List<WebElement> str = d.findElements(By.id("com.google.android.googlequicksearchbox:id/icon"));
	  for(int i=0;i<str.size();i++)
	  {
		 bw.write(str.get(i).getText());
		 bw.newLine();
	  
	  }
	  d.swipe(664, 1130, 655, 197, 1000);
	  } 
	bw.close();  
  }
  @Test
  public void test02() throws Exception{
	  
	  File f = new File("C:\\Users\\Manohar\\Desktop\\Apps.txt");
	  FileReader fw = new FileReader(f);
	  BufferedReader bw = new BufferedReader(fw);
	  String str;
	  try{
	  while((str = bw.readLine())!=null)
	  {
		  System.out.println(str);
	  }
	  bw.close();
	  }
	  catch(Exception e){e.printStackTrace();}
  }
  @BeforeTest
  public void beforeTest() throws Throwable {

	  dc = new DesiredCapabilities();
	  dc.setCapability("platFormName", "Android");
	  dc.setCapability("platFormVersion", "6.0.1");
	  dc.setCapability("deviceName", "Moto G (3rd Generation)");
	  dc.setCapability("appPackage","com.google.android.googlequicksearchbox");
	  dc.setCapability("appActivity","com.google.android.launcher.GEL");
	  d= new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
	  d.quit();
  }

}
