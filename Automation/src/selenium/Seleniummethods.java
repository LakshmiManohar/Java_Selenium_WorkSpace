package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniummethods {
    
	public WebDriver d = new FirefoxDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Seleniummethods t = new Seleniummethods();
		 t.openUrl();
		 t.aboutUs("About us");
		 t.newBatches("New Batches");
		 t.manualFAQ("Manual FAQs");
		 t.seleniumFAQ("Selenium FAQs");
		 t.javaFAQ("Core Java FAQs");
		 t.generalFAQ("General Testing FAQs");
		 t.downloads("Downloads");
		 t.resume("Resumes");
		 t.videos("Videos");
		 t.hms("HMS");
		 t.bugzilla("Bugzilla");
		 
	}
	public void openUrl(){
		
		d.get("http://selenium4testing.com/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.id("closediv")).click();
	}
	public void reuse(String s5){
	    d.findElement(By.linkText(s5)).click();
	}
	
	   public void aboutUs(String s4){
	    d.findElement(By.linkText(s4)).click();
	}
	   public void newBatches(String s4){
		    d.findElement(By.linkText(s4)).click();
	}
		public void manualFAQ(String s4){
	    d.findElement(By.linkText(s4)).click();
	}
		public void seleniumFAQ(String s5){
		d.findElement(By.linkText(s5)).click();
	}
		public void javaFAQ(String s6){
	    d.findElement(By.linkText(s6)).click();
    }
		public void generalFAQ(String s7){
		d.findElement(By.linkText(s7)).click();
    }
		public void downloads(String s8){
	    d.findElement(By.linkText(s8)).click();
    }
		public void resume(String s9){
		 d.findElement(By.linkText(s9)).click();
	 }
		public void videos(String s10){
		 d.findElement(By.linkText(s10)).click();
	 }
		public void hms(String s11){
		 d.findElement(By.linkText(s11)).click();
	 }
		public void bugzilla(String s8){
		    d.findElement(By.linkText(s8)).click();
	    }
}


