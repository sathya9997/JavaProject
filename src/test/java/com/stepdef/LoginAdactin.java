package com.stepdef;
import org.openqa.selenium.WebDriver;
import com.bas.Base;
import com.page.BookingPage;
import com.page.ConfirmPage;
import com.page.HotelPage;
import com.page.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class LoginAdactin extends Base {
	LoginPage lp;
	BookingPage bp;
	HotelPage hp;
	ConfirmPage cp;
	WebDriver driver;
	@Given("user is on adactin page")
	public void user_is_on_adactin_page() {
		driver = getdriver();
		loadurl("https://adactinhotelapp.com/");
	}
	@When("user enters{string} , {string} and click login button")
	public void user_enters_and_click_login_button(String name, String pass) {
		LoginPage lp = new LoginPage();
		type(lp.getUname(), name);
		type(lp.getPass(), pass);
		lp.getLgn().click();
	}
	@When("user enters into booking page {string},{string},{string} ,{string}and click search button")
	public void user_enters_into_booking_page_and_click_search_button(String location, String hotels, String roomtype, String noofroom) {
		BookingPage bp = new BookingPage();
		type(bp.getLocation(), hotels);
		type(bp.getHotel(), location);
		type(bp.getRoomno(), roomtype);
		type(bp.getRoomtype(), noofroom);
		bp.getBtn().click();
	}
	@When("user enters into hotel page to select the hotel")
	public void user_enters_into_hotel_page_to_select_the_hotel() {
		HotelPage hp = new  HotelPage();
		hp.getRbtn().click();
		hp.getCbtn().click();
	}
    @When("user enter into booking hotel page {string},{string},{string},{string},{string},{string},{string}and {string}")
    public void user_enter_into_booking_hotel_page_and(String fname, String lname, String add, String cardno, String type, String month, String year, String ccv) {
	ConfirmPage cp = new ConfirmPage();
	Base.type(cp.getFname(), fname);
	Base.type(cp.getLname(), lname);
	Base.type(cp.getAdd(), add);
	Base.type(cp.getCardno(), cardno);
	Base.type(cp.getCardtype(), type);
	Base.type(cp.getMonth(), month);
	Base.type(cp.getYear(), year);
	Base.type(cp.getCcvno(), ccv);
	cp.getBookbtn().click();
    }
    @Then("user should verify the order id")
    public void user_should_verify_the_order_id() {
    	
    	driver.quit();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	
   }
   }
