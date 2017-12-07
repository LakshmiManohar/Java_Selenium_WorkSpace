package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Print_all_links_Spicejet {
	public WebDriver driver;
  @Test
  public void f() {
	 // List<String> str;
	  
	List<WebElement> str=driver.findElements(By.tagName("a"));
	System.out.println(str.size());
	for(int i=0; i<str.size(); i++)
	{
		if(!str.get(i).getText().equalsIgnoreCase(""))
		{
		System.out.println(str.get(i).getText()); //str[i]
		}
	}
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium_library\\chromedriver.exe");
	  driver = new ChromeDriver();
	  //driver.manage().window().maximize();
		driver.get("http://spicejet.com/");
		
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
