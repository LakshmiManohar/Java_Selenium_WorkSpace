package pageObjectModel;

import org.openqa.selenium.By;

public class Gmail_Locators {
	
	public By username = By.xpath("//input[@id = 'Email']");
	public By next  = By.xpath("//input[@id='next']");
	public By password = By.xpath("//input[@id = 'Passwd' and @name='Passwd' ]");
	public By Signin = By.xpath("//input[@id = 'signIn']");



}
