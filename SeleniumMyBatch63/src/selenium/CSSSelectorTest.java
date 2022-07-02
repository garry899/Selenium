package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorTest {
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("defsvsabhjdn@fcgvhj");
		driver.findElement(By.cssSelector("#pass")).sendKeys("fgedwewrgerwf");
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}
}
