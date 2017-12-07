package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parameter_GoogleLanguageLinks {
	WebDriver d;

	public void openURL(){
		d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		d.get("https://www.google.co.in/?gfe_rd=cr&ei=9_z8V6TmIYTy8AeyzJ_YAg");
	}
	public void linkText(String s){
		d.findElement(By.linkText(s)).click();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Parameter_GoogleLanguageLinks p = new Parameter_GoogleLanguageLinks();
		p.openURL();
		p.linkText("हिन्दी");
		p.linkText("বাংলা");
		p.linkText("తెలుగు");
		p.linkText("मराठी");
		p.linkText("தமிழ்");
		p.linkText("ગુજરાતી");
		p.linkText("ಕನ್ನಡ");
		p.linkText("മലയാളം");
		p.linkText("ਪੰਜਾਬੀ"); 
	}

}
