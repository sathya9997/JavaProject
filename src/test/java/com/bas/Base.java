package com.bas;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
public class Base {
		public static WebDriver driver;
		public static WebDriver getdriver() {
			ChromeDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			return driver;
		}
		public static void loadurl(String data) {
			driver.get(data);
		}
		public static void type(WebElement ele, String data) {
			ele.sendKeys(data);
		}
		public static void dropdown(WebElement ele, String data) {
			Select s = new Select(ele);
			s.selectByValue(data);
		}
		public static void dropdowni(WebElement ele, int i) {
			Select s = new Select(ele);
			s.selectByIndex(i);
		}
		public static void dropdowntext(WebElement ele, String data) {
			Select s = new Select(ele);
			s.selectByVisibleText(data);
		}
	    public static String getatt(WebElement ele, String value) {
		String text = ele.getAttribute(value);
		return text;
	    }
	}



