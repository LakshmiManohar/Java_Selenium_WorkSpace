package hms_pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HMS_Base {
	
	public WebDriver d;
	
	public void open(){
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium_library\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium_library\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("http://selenium4testing.com/hms/");
		d.manage().window().maximize();
		
	}
	public void send(By loc,String t){ //Send Text
		d.findElement(loc).sendKeys(t);
	}
	
	public void click(By loc){ //  Click
		d.findElement(loc).click();
	}
	
	public void select(By loc,String t){ //Select
		new Select(d.findElement(loc)).selectByVisibleText(t);
	}


public void close(){
	d.close();
}
}
