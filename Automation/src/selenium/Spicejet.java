package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {
public WebDriver d;

 		public void openURL(){
 		
 			d = new FirefoxDriver();

 			d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 			d.get("http://www.spicejet.com/");
 		}
 			
	 public void search() throws Exception{
		 d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		 d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 d.findElement(By.linkText("Hyderabad (HYD)")).click();
		 Thread.sleep(1000);
		 //d.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		 d.findElement(By.linkText("Vijayawada (VGA)")).click();
		// d.findElement(By.className("ui-datepicker-trigger")).click();
		 d.findElement(By.linkText("14")).click();
		 new Select(d.findElement(By.name("ctl00$mainContent$ddl_Adult"))).selectByVisibleText("2 Adults");
		 new Select(d.findElement(By.name("ctl00$mainContent$ddl_Child"))).selectByVisibleText("2 Children");
		 new Select(d.findElement(By.name("ctl00$mainContent$ddl_Infant"))).selectByVisibleText("1 Infant");
		 d.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		 
		 
	 }
	 
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	
              Spicejet s = new Spicejet();
              s.openURL();
              s.search();
	}

}
