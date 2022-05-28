package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.nike.com/ca/");
		
		driver.navigate().to("https://www.nike.com/ca/");
		//same as driver.get()
		
		driver.navigate().back();
		//to go to previous page
		
		driver.navigate().forward();
		//to go to next page
		
		driver.navigate().refresh();
		//to refresh the page
	}

}
