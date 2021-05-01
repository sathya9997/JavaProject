package com.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bas.Base;
public class HotelPage extends Base{
	public HotelPage() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="radiobutton_0")
private WebElement rbtn;
@FindBy(id="continue")
private WebElement cbtn;
public WebElement getRbtn() {
	return rbtn;
}
public WebElement getCbtn() {
	return cbtn;
}
}
