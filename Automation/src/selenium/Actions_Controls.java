package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Actions_Controls {
	WebDriver d;
  @Test(description = "Mouse Over - Tooltip")
  public void test01() {
	  
	  d.findElement(By.linkText("Tooltip")).click();
	  Actions a = new Actions(d);
	  a.moveToElement(d.findElement(By.id("age"))).build().perform();
	  
  }
  
  @Test(description = "Draggable")
  public void test02(){
	  
	  d.findElement(By.linkText("Draggable")).click();
	  WebElement from = d.findElement(By.xpath(".//*[@id='draggable']"));
	  WebElement to = d.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div/div[1]/div"));
	  Actions a = new Actions(d);
	  a.dragAndDrop(from, to).build().perform();
	  //Action a2 = a.clickAndHold(from).moveToElement(to).release(to).build();
	  //a2.perform();
}
  
  @Test(description = "Droppable")
  public void test03(){
	  d.findElement(By.linkText("Droppable")).click();
	  WebElement from = d.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/div/div/div[1]/div/div[1]/p"));
	  WebElement to = d.findElement(By.xpath(".//*[@id='droppableview']"));
	  Actions a = new Actions(d);
	  a.clickAndHold(from).moveToElement(to).release().build().perform();
	  //Action a2 = a.clickAndHold(from).moveToElement(to).release(to).build();
	 //.perform();
  }
  
  @Test(description ="Selectable")
  public void test04() throws Throwable
  {
	  d.findElement(By.linkText("Selectable")).click();
	  WebElement s1 = d.findElement(By.xpath(".//*[@id='selectable']/li[1]"));
	  WebElement s2 = d.findElement(By.xpath(".//*[@id='selectable']/li[7]"));
	  Actions a = new Actions(d);
	  Action a2 = a.keyDown(Keys.CONTROL).click(s1).doubleClick(s2).build();
	  a2.perform();
	  Thread.sleep(1000);
	  
  }
  @Test(description ="Sortable")
  public void test05()
  {
	   d.findElement(By.linkText("Sortable")).click();
	   d.navigate().to("http://demoqa.com/sortable/");
	  WebElement s1 = d.findElement(By.xpath(".//*[@id='sortable']/li[1]"));
	  WebElement s2 = d.findElement(By.xpath(".//*[@id='sortable']/li[5]"));
	  Actions a = new Actions(d);
	  Action a2 = a.clickAndHold(s1).moveToElement(s2).build();
	  //a.clickAndHold(s1).moveToElement(s2).release(s2).build().perform();
	  a2.perform();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  d = new FirefoxDriver();
	  d.get("http://demoqa.com/");
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
