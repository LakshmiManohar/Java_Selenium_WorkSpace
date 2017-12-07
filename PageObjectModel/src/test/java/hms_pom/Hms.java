package hms_pom;

import org.testng.annotations.Test;

public class Hms {
	
	login_component c1 = new login_component();
	Admission_component c2 = new Admission_component();
	
	
	  @Test(enabled = true)
	  //(description = "Registration Page")
	  public void test01()throws Exception {
		  
		  c1.login();
		  c1.Registration();
		  c1.quit();
	  }	
  @Test(description = "Permanant Registration")
  public void test02()throws Exception {
	  
	  c2.login();
	  c2.Admission();
	  c2.quit();
  }

}
