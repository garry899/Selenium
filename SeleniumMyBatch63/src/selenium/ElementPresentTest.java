package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();		
		driver.get("https://www.google.com/");
		
		
		//Using WebElement we can not verify element present or not
		//if(driver.findElement(By.linkText("About")).isDisplayed()) {
		//System.out.println("Element Present");
	//}else {
	//	System.out.println("Element not Present");
	//}
		
		
		//Only use list to find web element
		List<WebElement> element = driver.findElements(By.linkText("About"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}
	}
}
