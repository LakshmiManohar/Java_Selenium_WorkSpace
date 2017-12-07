package hms_pom;

import org.testng.annotations.Test;

public class Registration_Script {
	login_component c1 = new login_component();
  @Test(description = "Only Registration")
  public void f() {
	  
	  c1.login();
	  c1.Registration();
	  c1.quit();
  }
}
