package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();		
		driver.get("https://www.google.com/");

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("About")).click();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.titleContains("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.titleContains("Google"));
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.titleContains("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle());

	}

}
