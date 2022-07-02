package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		Thread.sleep(10000);

		WebElement careers = driver.findElement(By.linkText("Careers"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//this is selenium class, not java class
		
		//option 1 - Using X and Y coordinates
		/*
		 * System.out.println(careers.getLocation());
		 * jse.executeScript("window.scrollBy(0,5000)"); careers.click();
		 */
		
		//option 2 - Scroll until element is in the view
		/*
		 * jse.executeScript("arguments[0].scrollIntoView(true);",careers);
		 * careers.click();
		 */
		
		//option 3 - direct click using javaScriptExecutor class
		jse.executeScript("arguments[0].click();",careers);

		//jse.executeScript("arguments[0].value='sdfvf'",careers);
		//To type into any input box
	}

}
