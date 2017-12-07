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
import org.testng.annotations.AfterTest;

public class Login_Multiple_testdata_hms {
	WebDriver d;
	String str;
  @Test
  public void f() throws Throwable {
	  
	  FileInputStream f = new FileInputStream(".\\Testdata\\Login_Testdata.xls");
	  Workbook w = Workbook.getWorkbook(f);
	  Sheet s = w.getSheet("Login");
	  FileOutputStream ff = new FileOutputStream(".\\Testdata\\Login_Testdata_Results.xls");
	  WritableWorkbook wb = Workbook.createWorkbook(ff);
	  WritableSheet ss = wb.createSheet("Login", 0);
	  for(int i=1;i<s.getRows();i++)
	  {
			  d.findElement(By.name("username")).sendKeys(s.getCell(0,i).getContents());
			  d.findElement(By.name("password")).sendKeys(s.getCell(1,i).getContents());
			  d.findElement(By.name("submit")).click();
			  Thread.sleep(1000);
			  try{
			d.findElement(By.linkText("Logout")).click();
			 str = "Pass";
			Thread.sleep(2000);
			 
			  }catch(Exception e){
				  d.switchTo().alert().accept();
				   str = "Fail";
			  }
			  Label Results = new Label(2,i,str);
			  ss.addCell(Results);
			  for(int j=0;j<s.getColumns();j++){
				  
				  System.out.println(s.getCell(j,i).getContents());
				  Label l = new Label(j,i,s.getCell(j, i).getContents());
				  ss.addCell(l);
			  }
		  
	  }
	  Label un = new Label(0,0,"Username");
	  Label pw = new Label(1,0,"Password");
	  Label re = new Label(2,0,"Results");
	  ss.addCell(un);
	  ss.addCell(pw);
	  ss.addCell(re);
	  wb.write();
	  wb.close();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	 
	// System.setProperty("webdriver.geckodriver.driver","C:\\Program Files\\Selenium_library\\geckodriver.exe");
	 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium_library\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("http://selenium4testing.com/hms/");
	  d.manage().window().maximize();
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  
	  d.quit();
  }

}
