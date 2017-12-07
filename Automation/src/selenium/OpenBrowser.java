package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		//System.setProperty("WebDriver.geckodrive.d","C:\\Program Files\\Selenium_library\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium_library\\chromedriver.exe");
		//WebDriver d = new FirefoxDriver();
		WebDriver d1 = new ChromeDriver();
		 //d1.get("http://selenium4testing.com/");
		d1.manage().window().maximize();
		 d1.get("http://selenium4testing.com/hms/");
		 
		String s = d1.getWindowHandle();
		 System.out.println(s);
	}

}

