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

public class Excelsample {
	WebDriver dr;

  @Test
  public void f() throws Exception {
	  FileInputStream fs= new FileInputStream(".\\TestData\\GmailLogin.xls");
	  Workbook wb= Workbook.getWorkbook(fs);
	  Sheet s= wb.getSheet(0);
	  
	  for(int i=0;i<s.getRows();i++)
	  {
		  if(s.getCell(3,i).getContents().equalsIgnoreCase("URL"))
		  {
			  dr.get(s.getCell(4,i).getContents());
		  }
		  
		  else if (s.getCell(3,i).getContents().equalsIgnoreCase("sendkeys"))
		  {
			  dr.findElement(By.id(s.getCell(1,i).getContents())).sendKeys(s.getCell(4,i).getContents());
		  }
		  else if (s.getCell(3,i).getContents().equalsIgnoreCase("click"))
		  {
			  dr.findElement(By.xpath(s.getCell(1,i).getContents())).click();
		  }
		  else
		  {
			  System.out.println("fuck");
		  }
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {

	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium_library\\chromedriver.exe");
	  dr= new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
