package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver(); 	
		driver.get("https://www.ebay.ca/"); 
		
		String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		System.out.println(s); 
		
		driver.findElement(By.id("gh-ac")).sendKeys("wedfrdges");;
		
		String p = driver.findElement(By.id("gh-ac")).getAttribute("value");
		System.out.println(p);

	}

}
