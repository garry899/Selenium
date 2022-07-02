package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.linkText("About")).click();
		driver.findElement(By.partialLinkText("Abo")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//Thread.sleep(2000);

		wait.until(ExpectedConditions.urlContains("https://about.google"));
		
		String expectedUrl = "https://about.google";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		String expectedTitle = "Google - About Google, Our Culture & Company News";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(actualUrl.contains(expectedUrl) && expectedTitle.equals(actualTitle)) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}

	}

}
