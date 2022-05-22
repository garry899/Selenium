package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionsClassTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver(); 	
		driver.get("https://www.ebay.ca/"); 
		
		

	}

}
