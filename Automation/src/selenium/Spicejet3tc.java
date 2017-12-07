package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet3tc {
	WebDriver d;
	
	public void openURL(){
		d = new FirefoxDriver();	
	d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	d.get("http://www.spicejet.com/");
	}
	public void click(String s){
		d.findElement(By.id(s)).click();
	}
	public void linkText(String aa){
		d.findElement(By.linkText(aa)).click();
		
	}
	public void select(String as,String a){
		
		new Select(d.findElement(By.id(as))).selectByVisibleText(a);
	}
	public void roundTrip() throws Exception{ // Two Way Search
		d.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		d.findElement(By.linkText("Hyderabad (HYD)")).click();
		 Thread.sleep(1000);
		 d.findElement(By.linkText("Vijayawada (VGA)")).click();
		 d.findElement(By.linkText("14")).click();
		 d.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		 d.findElement(By.xpath("(//a[contains(text(),'16')])[23]")).click();
		 new Select(d.findElement(By.name("ctl00$mainContent$ddl_Adult"))).selectByVisibleText("2 Adults");
		 new Select(d.findElement(By.name("ctl00$mainContent$ddl_Child"))).selectByVisibleText("2 Children");
		 new Select(d.findElement(By.name("ctl00$mainContent$ddl_Infant"))).selectByVisibleText("1 Infant");
		 d.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		 Thread.sleep(1000);
	}
	public void maxPassenger()throws Exception // More than booking 9seats 
	{
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		d.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(1000);
		d.findElement(By.linkText("Vijayawada (VGA)")).click();
		d.findElement(By.linkText("14")).click();
		d.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		d.findElement(By.xpath("(//a[contains(text(),'16')])[23]")).click();
		new Select(d.findElement(By.name("ctl00$mainContent$ddl_Adult"))).selectByVisibleText("9 Adults");
		new Select(d.findElement(By.name("ctl00$mainContent$ddl_Child"))).selectByVisibleText("1 Child");
		new Select(d.findElement(By.name("ctl00$mainContent$ddl_Infant"))).selectByVisibleText("1 Infant");
		 d.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		 Thread.sleep(2000);
		 d.close();
		 
	}
	void close()
	{
		d.quit();
	}
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Spicejet3tc p = new Spicejet3tc();
		p.openURL();
		p.click("ctl00_mainContent_rbtnl_Trip_1");
		p.click("ctl00_mainContent_ddl_originStation1_CTXT");
		p.linkText("Hyderabad (HYD)");
		Thread.sleep(1000);
		p.click("ctl00_mainContent_ddl_destinationStation1_CTXT");
		p.linkText("Vijayawada (VGA)");
		p.linkText("14");
		p.select("ctl00_mainContent_ddl_Adult","2 Adults");
		p.select("ctl00_mainContent_ddl_Child","2 Children");
		p.select("ctl00_mainContent_ddl_Infant","2 Infants");
		p.click("ctl00_mainContent_btn_FindFlights"); 
		p.close();
		p.openURL();
		p.roundTrip(); // Round Trip
		p.close();
		p.openURL();
		p.maxPassenger(); // Booking 9 seats
		
		
	}
       
}
