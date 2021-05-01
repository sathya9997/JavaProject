package com.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bas.Base;
public class ConfirmPage extends Base {
	public ConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private  WebElement fname;
	@FindBy(id="last_name")
	private  WebElement lname;
	@FindBy(id="address")
	private  WebElement add;
	@FindBy(id="cc_num")
	private  WebElement cardno;
	@FindBy(id="cc_type")
	private  WebElement cardtype;
	@FindBy(id="cc_exp_month")
	private  WebElement month;
	@FindBy(id="cc_exp_year")
	private  WebElement year;
	@FindBy(id="cc_cvv")
	private  WebElement ccvno;
	@FindBy(id="book_now")
	private  WebElement bookbtn;
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCcvno() {
		return ccvno;
	}
	public WebElement getBookbtn() {
		return bookbtn;
	}
}
