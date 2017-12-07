package selenium;

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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DataDriven_1 {
	private static final String NULL = null;
	WebDriver d;
	String Str;
	
  @Test
  public void f()throws Exception {
	  
	  FileInputStream f = new FileInputStream(".//Test-Data//TestData1.xls");
	  Workbook w = Workbook.getWorkbook(f);
	  Sheet s = w.getSheet("TestData");
	  FileOutputStream fo = new FileOutputStream(".//Results//Results.xls");
	  WritableWorkbook wb = Workbook.createWorkbook(fo);
	  WritableSheet sh = wb.createSheet("Results", 0);
	  WritableSheet sh1 = wb.createSheet("Results2",1); 
	
	for(int z=3;z<s.getColumns();z++)
	{
		 
	  for(int i=0;i<s.getRows();i++)
	  {
		 try
		 {
		  if(s.getCell(2,i).getContents().equalsIgnoreCase("Textbox"))
		  {
			  d.findElement(By.id(s.getCell(0,i).getContents())).sendKeys(s.getCell(z,i).getContents());
		  
		  }
		  else if(s.getCell(2,i).getContents().equalsIgnoreCase("Click"))
		  {
			  
			  d.findElement(By.xpath(s.getCell(0,i).getContents())).click();
			 
		  }
		  else if(s.getCell(2,i).getContents().equalsIgnoreCase("Select"))
		  {
			  new Select(d.findElement(By.id(s.getCell(0,i).getContents()))).selectByVisibleText(s.getCell(z,i).getContents());
		  }
		  else if(s.getCell(2,i).getContents().equalsIgnoreCase("Select - Name"))
		  {
			  new Select(d.findElement(By.name(s.getCell(0,i).getContents()))).selectByVisibleText(s.getCell(z,i).getContents());
		  }
		  else if(s.getCell(2,i).getContents().equalsIgnoreCase("URL"))
		  {
			  d.get(s.getCell(z,i).getContents());
			  d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  }
		     Str = "PASS";
		 }catch(Exception e)
		 {
			 Str = "Fail";
		 }
		 for(int t=0;t<wb.getNumberOfSheets();t++)
		 {
			 wb.getSheet(t);
			 Label l = new Label(0,i,s.getCell(0,i).getContents());
			 Label l1 = new Label(1,i,s.getCell(1,i).getContents());
			 Label l2 = new Label(2,i,s.getCell(2,i).getContents());
			   wb.getSheet(t).addCell(l);
			   wb.getSheet(t).addCell(l1);
			   wb.getSheet(t).addCell(l2);
			   
		   
			   Label l3 = new Label(3,i,s.getCell(z,i).getContents());
			   wb.getSheet(t).addCell(l3);
			   Label results = new Label(4,i,Str);
			   wb.getSheet(t).addCell(results);
			   Label res  = new Label(4,0,"Results");
			   wb.getSheet(t).addCell(res);
		       
		    
		 }
	  }
	}  
	 
	  wb.write();
	  wb.close();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  d = new FirefoxDriver();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
