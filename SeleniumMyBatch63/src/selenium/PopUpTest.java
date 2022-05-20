package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		//If you get popups --> close both the popups --> type laptop in the search box
		//If you don't get popups , type laptop in the search box
		
		

	}

}
