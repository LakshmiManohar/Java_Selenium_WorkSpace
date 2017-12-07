package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parameterized_Method_Reuse {
	public WebDriver d = new FirefoxDriver();

	public void openUrl(){
		
		d.get("http://selenium4testing.com/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.id("closediv")).click();
	}
	public void reuse(String s5){
	    d.findElement(By.linkText(s5)).click();
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Parameterized_Method_Reuse t = new Parameterized_Method_Reuse();
	 t.openUrl();
	 t.reuse("About us");
	 t.reuse("New Batches");
	 t.reuse("Manual FAQs");
	 t.reuse("Selenium FAQs");
	 t.reuse("Core Java FAQs");
	 t.reuse("General Testing FAQs");
	 t.reuse("Downloads");
	 t.reuse("Resumes");
	 t.reuse("Videos");
	 t.reuse("HMS");
	 t.reuse("Bugzilla");

   }
}