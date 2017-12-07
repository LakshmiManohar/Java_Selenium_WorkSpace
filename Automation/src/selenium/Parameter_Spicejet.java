package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Parameter_Spicejet {
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
	public void close(){
		d.quit();
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Parameter_Spicejet p = new Parameter_Spicejet();
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
		Thread.sleep(3000);
		p.close();
		
		
	}
       
}
