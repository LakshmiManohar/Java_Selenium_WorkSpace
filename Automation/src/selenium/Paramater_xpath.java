package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Paramater_xpath {

	public WebDriver d;  
	public void openURL(){
		
		d = new FirefoxDriver();
		d.get("https://www.google.co.in/");
	}
	public void reuse(String s){
		
		d.findElement(By.xpath(s)).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paramater_xpath p = new Paramater_xpath();
		p.openURL();
		//p.reuse("html/body/div/div[5]/span/center/div[3]/div/div/a[1]");
		p.reuse("html/body/div/div[5]/span/center/div[3]/div/div/a[2]"); 
		p.reuse("html/body/div/div[5]/span/center/div[3]/div/div/a[3]"); 
		p.reuse("html/body/div/div[5]/span/center/div[3]/div/div/a[4]"); 
		p.reuse("html/body/div/div[5]/span/center/div[3]/div/div/a[5]"); 
		p.reuse("html/body/div/div[5]/span/center/div[3]/div/div/a[6]"); 
		p.reuse("html/body/div/div[5]/span/center/div[3]/div/div/a[7]"); 
		p.reuse("html/body/div/div[5]/span/center/div[3]/div/div/a[8]");
		p.reuse("html/body/div/div[5]/span/center/div[3]/div/div/a[9]");
		
		
	

	}

}
