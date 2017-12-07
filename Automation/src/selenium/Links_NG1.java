package selenium;

import org.testng.annotations.Test;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Links_NG1 {
	public WebDriver d;
	
	public void linkText(String s){
		d.findElement(By.linkText(s)).click();
	}
	public void screenshot(String s)throws Exception{
		SimpleDateFormat d1 = new SimpleDateFormat("yyyy_mmm_dd hh_mm_ss a");
		Date d2 = new Date();
		String time = d1.format(d2);
		File f = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\WorkSpace\\screenshots\\" +s+time+".png"));
		
	}
	
  @Test(description =  "Manual FAQ's")
  public void test01() throws Exception {
	  try{
		  linkText("Manual FAQs");
		  System.out.println("Manual FAQ's Link pass");
	  }catch(Exception e){
		  System.out.println("Unable to open Manual FAQ's Link");
		  screenshot("Manual_FAQ_Fail");
	  }
  }
  @Test(description ="Selenium FAQ's")
  public void test02()throws Exception{
	  try{
		  linkText("Selenium FAQs");
		  System.out.println("Selenium FAQ's Pass");
	  }catch(Exception e){
		  System.out.println("Selenium FAQ's Fail");
		  screenshot("SeleniumFAQFail");
	  }
  }
  @Test(description = "Corejava FAQ")
  public void test03() throws Exception{
	  try{
		  linkText("java FAQ's");
		  System.out.println("Core Java FAQ's Pass");
	  }catch(Exception e){
		  System.out.println("Core java FAQ's Fail");
		  screenshot("CorejavaFAQFail");
	  }
	  
  }
  
  @BeforeTest(description ="open the Browser")
  public void beforeTest() {
	  d = new FirefoxDriver();
	  d.get("http://selenium4testing.com/");
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  d.findElement(By.id("closediv")).click();
  }

  @AfterTest(description ="Close the Browser")
  public void afterTest() {
	  d.quit();
  }

}
