package pageObjectModel;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Methods {
	Gmail_Locators g =new Gmail_Locators();
	public WebDriver d1;
	public void openURL(){
		d1 = new FirefoxDriver();
		d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d1.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
	}
	public void Login() throws Exception{
	
          d1.findElement(g.username).sendKeys("veeranki.manohar7@gmail.com");
          d1.findElement(g.next).click();
          d1.findElement(g.password).sendKeys("*****");
          d1.findElement(g.Signin).click();
          
	
	
	}
	
	
	

}
