package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d =new FirefoxDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.name("email")).sendKeys("xyzzz@gmail.com");
		d.findElement(By.id("pass")).sendKeys("xxxxxxxxx*");
		d.findElement(By.id("loginbutton")).click();
		d.findElement(By.id("userNavigationLabel")).click();
		
		

	}
}
