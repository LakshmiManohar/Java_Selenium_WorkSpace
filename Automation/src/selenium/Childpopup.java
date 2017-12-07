package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Childpopup {
	public WebDriver d ;

	public void openURL() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium_library\\chromedriver.exe");
		d= new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("http://selenium4testing.com/");

}
	public void Login()throws Exception{
		d.findElement(By.linkText("HMS")).click();
		d.navigate().to("http://selenium4testing.com/hms/");
		d.findElement(By.name("username")).sendKeys("user1");
		d.findElement(By.name("password")).sendKeys("user1");
		d.findElement(By.name("submit")).click();
		String str = d.getWindowHandle();
		d.findElement(By.linkText("Feedback")).click();
		d.switchTo().window("mywindow");
		d.manage().window().maximize();
		d.findElement(By.id("name")).sendKeys("Hello");
		Thread.sleep(3000);
		d.close();
		d.switchTo().window(str);
		System.out.println(str);
		d.findElement(By.linkText("Registration")).click();
	
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Childpopup p = new Childpopup();
		p.openURL();
		p.Login();

	}

}
