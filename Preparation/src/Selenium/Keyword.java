package Selenium;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Keyword {
	
	WebDriver d;
	
  @Test
  public void f() throws Exception {
	  
	  FileInputStream f = new FileInputStream(".\\testdata\\Keyword.xls");
	  Workbook b = Workbook.getWorkbook(f);
	  Sheet s = b.getSheet(0);
	  for(int i=1;i<s.getRows();i++)
	  {
		  try{
			  if(s.getCell(2,i).getContents().equalsIgnoreCase("URL"))
			  {
				  d.get(s.getCell(4,i).getContents());
				  d.manage().window().maximize();
				  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  }
		  else if(s.getCell(2,i).getContents().equalsIgnoreCase("click"))
			  {
				 
				 d.findElement(By.xpath(s.getCell(1,i).getContents())).click();
				
			}
			  else if(s.getCell(2,i).getContents().equalsIgnoreCase("text"))
			  {
				  d.findElement(By.name(s.getCell(1,i).getContents())).sendKeys(s.getCell(4,i).getContents());
			  }
			  System.out.println("Pass");
			  
		  }catch(Exception E)
		  {
			  System.out.println("Fail");
		  }
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium_library\\chromedriver.exe");
		 d = new ChromeDriver();
	
  }

  @AfterTest
  public void afterTest() {
	  
	  d.quit();
	  
  }

}
