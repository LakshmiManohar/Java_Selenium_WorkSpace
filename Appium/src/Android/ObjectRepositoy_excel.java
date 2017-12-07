package Android;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class ObjectRepositoy_excel {
	WebDriver d;
	String str;
  @Test
  public void f() throws Exception {
	  
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  FileInputStream f = new FileInputStream(".\\Testdata\\ObjectRepository_DataDriven.xls");
	  Workbook b = Workbook.getWorkbook(f);
	  Sheet s = b.getSheet("Sheet1");
	  FileOutputStream fo = new FileOutputStream(".\\Results\\ObjectRepository_DataDriven_Results.xls");
	  WritableWorkbook wb = Workbook.createWorkbook(fo);
	  WritableSheet ws = wb.createSheet("Login", 0);
	  for(int i=0;i<s.getRows();i++)
	  {
		  try{
		  if(s.getCell(2,i).getContents().equalsIgnoreCase("Dropdown"))
		  {
			  new Select(d.findElement(By.name(s.getCell(0,i).getContents()))).selectByVisibleText(s.getCell(3,i).getContents());
			 
		  }else if(s.getCell(2,i).getContents().equalsIgnoreCase("Dropdown -ID")){
			  
			  new Select(d.findElement(By.id(s.getCell(0,i).getContents()))).selectByVisibleText(s.getCell(3,i).getContents());
		  }
		  else if(s.getCell(2,i).getContents().equalsIgnoreCase("Textbox"))
		  {
			  
			  d.findElement(By.name(s.getCell(0,i).getContents())).sendKeys(s.getCell(3,i).getContents());
		  }
		  else if(s.getCell(2,i).getContents().equalsIgnoreCase("Radio")||s.getCell(2,i).getContents().equalsIgnoreCase("Check box")||s.getCell(2,i).getContents().equalsIgnoreCase("button"))
		  {
			  d.findElement(By.name(s.getCell(0,i).getContents())).click();
		  }
		  else if(s.getCell(2,i).getContents().equalsIgnoreCase("URL"))
         {
			  d.get(s.getCell(0,i).getContents());
         }
		  else if(s.getCell(2,i).getContents().equalsIgnoreCase("IDBox"))
        {
    	d.findElement(By.id(s.getCell(0,i).getContents())).sendKeys(s.getCell(3,i).getContents());
	
        }
		  str = "Pass";
		  System.out.println("Pass");
		  }catch(Throwable e)
		  {
			  str = "Fail";
		  }
		  
		  Label Results = new Label(4,i,str);
		  ws.addCell(Results);

		  for(int j=0;j<s.getColumns();j++)
		  {
			  Label l = new Label(j,i,s.getCell(j,i).getContents());
			  ws.addCell(l);
			  
		  }
     }
	  Label oj = new Label(0,0,"Object Repository");
	  ws.addCell(oj);
	  Label display = new Label(1,0,"DisplayName");
	  ws.addCell(display);
	  Label ojt = new Label(2,0,"Object Type");
	  ws.addCell(ojt);
	  Label td = new Label(3,0,"TestData");
	  ws.addCell(td);
	 Label Res = new Label(4,0,"Result");
	  ws.addCell(Res);
	  wb.write();
	  wb.close();
 }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium_library\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("http://demoqa.com/registration/");
	  d.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
