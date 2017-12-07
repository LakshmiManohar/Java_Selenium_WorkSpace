package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Enfec {
	WebDriver d;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	 d = new FirefoxDriver();
	 d.get("http://www.enfec.com/");
	 String title = d.getTitle();
	// System.out.println(title);
	 String url = d.getCurrentUrl();
	 //System.out.println(url);
	 String ps = d.getPageSource();
	 //System.out.println(ps);
	 File f = new File("C:\\Users\\Manohar\\Desktop\\code.txt");
	 FileWriter fw = new FileWriter(f);
	 BufferedWriter bw = new BufferedWriter(fw);
	 bw.write(title);
	 bw.newLine();
	 bw.write(url);
	 bw.newLine();
	 bw.write(ps);
	 bw.close();
  }

  @AfterTest
  public void afterTest() {
	  d.close();
  }

}
