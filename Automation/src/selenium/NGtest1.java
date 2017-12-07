package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NGtest1 {
	WebDriver d;
	public void xwait(String s ) throws Exception{
		for(int i=0;i<60;i++)
		{
			try{
				d.findElement(By.id(s)).isDisplayed();
				d.findElement(By.id(s)).click();
			}catch(Exception e){
				Thread.sleep(1000);
			}
		}
	}
	void text(String x , String y){
		d.findElement(By.id(x)).sendKeys(y);
	}
	void xpath(String z){
		d.findElement(By.xpath(z)).click();
	}
	void linkText(String z){
	d.findElement(By.linkText(z)).click();}
  @Test
  public void f()throws Exception {
	  xwait("oneway");
	  text("from","Hyderabad, Rajiv Gandhi International Airport, HYD, India");
	  text("to","Bengaluru, Kempegowda International Airport, BLR, India");
	  xpath(".//*[@id='divwithjs']/div/ul[4]/li[3]/div[1]/img");
	  linkText("2");
	  xwait("btnbooking");
	  
  }
  @BeforeTest
  public void beforeTest()throws Exception {
	  d= new FirefoxDriver();
	  d.get("http://www.airindia.in/");
	  Thread.sleep(1000);
  }

  @AfterTest
  public void afterTest() {
	  d.quit();
  }

}
