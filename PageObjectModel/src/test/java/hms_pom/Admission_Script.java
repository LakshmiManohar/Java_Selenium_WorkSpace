package hms_pom;

import org.testng.annotations.Test;

public class Admission_Script {
	
	Admission_component c2 = new Admission_component();
  @Test(description = "Only Admission")
  public void test01()throws Exception {
	  
	  c2.login();
	  c2.Admission();
	  c2.quit();
  }
}
