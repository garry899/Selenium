package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/Best-Sellers-generic/zgbs/?ref_=nav_cs_bestsellers");

		JavascriptExecutor js = (JavascriptExecutor) driver; 
		//js.executeScript("","window.scrollBy(0,350)");

		//Locating element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.linkText("Video Games"));

        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //scroll to bottom
	}

}
