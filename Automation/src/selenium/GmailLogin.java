package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver d= new FirefoxDriver();
		d.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
        d.findElement(By.id("Email")).sendKeys("veeranki.manohar7@gmail.com");
        d.findElement(By.id("next")).click();
        WebElement d2 = (new WebDriverWait(d, 10))
        		  .until(ExpectedConditions.presenceOfElementLocated(By.id("Passwd")));
        d2.sendKeys("*******");
        		  
        d.findElement(By.id("signIn")).click();
        
		
	}

}
