package Selenium;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Keyword {
	
	WebDriver d;
	String str;
  @Test
  public void f() throws Exception{
	  FileInputStream f = new FileInputStream(".\\TestData\\Keyword.xls");
	  Workbook wb = Workbook.getWorkbook(f);
	  Sheet s = wb.getSheet(0);
	  FileOutputStream f2 = new FileOutputStream(".\\Testdata\\Login_Testdata_Results.xls");
	  WritableWorkbook wb2 = Workbook.createWorkbook(f2);
	  WritableSheet s2 = wb2.createSheet("Test1", 0);
	  for(int i=0;i<s.getRows();i++)
	  {
		  try
		  {
			  if(s.getCell(3,i).getContents().equalsIgnoreCase("URL"))
			{
	          d.get(s.getCell(4,i).getContents());
			}
			  else if(s.getCell(3,i).getContents().equalsIgnoreCase("click"))
			  {
				  d.findElement(By.xpath(s.getCell(1,i).getContents())).click();
			  }
			  else if(s.getCell(3,i).getContents().equalsIgnoreCase("sendkeys"))
			  {
				  d.findElement(By.id(s.getCell(1,i).getContents())).sendKeys(s.getCell(4,i).getContents());
			  }
			 
			  str = "Pass";
	  }catch(Exception E)
		  {
			  str = "Fail";
		  }
		  Label Results = new Label(5,i,str);
		  s2.addCell(Results);
		  for(int j=0;j<s.getColumns();j++)
		  {
			  Label l = new Label(j,i,s.getCell(j,i).getContents());
			  s2.addCell(l);
			  
		  }
	  }
	  Label er1 = new Label(0,0,"Test Step");
	  s2.addCell(er1);
	  Label er2 = new Label(1,0,"Object Repository");
	  s2.addCell(er2);
	  Label er3 = new Label(2,0,"Locator");
	  s2.addCell(er3);
	  Label e4 = new Label(3,0,"Action");
	  s2.addCell(e4);
	  Label e5 = new Label(4,0,"Test Data");
	  s2.addCell(e5);
	  Label re = new Label(5,0,"Results");
	  s2.addCell(re);
	  wb2.write();
	  wb2.close();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium_library\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.manage().window().maximize();
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
	  //d.quit();
  }

}
