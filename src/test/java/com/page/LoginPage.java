package com.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bas.Base;
public class LoginPage extends Base {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private  WebElement uname;
	@FindBy(id="password")
	private  WebElement pass;
	@FindBy(id="login")
	private  WebElement lgn;
	public WebElement getUname() {
		return uname;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLgn() {
		return lgn;
	}
	}
	
	
	
	
	
	
	
	
	


