package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTab {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.amazon.ca/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		 WebElement customerService = driver.findElement(By.linkText("Customer Service"));
		  customerService.sendKeys(Keys.chord(Keys.COMMAND+"t"+Keys.ENTER));
		  driver.findElement(By.linkText("Customer Service")).click();

	}

}
