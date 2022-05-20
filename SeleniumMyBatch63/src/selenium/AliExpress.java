package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AliExpress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		driver.findElement(By.xpath("//img[@class='_24EHh']")).click();
		driver.findElement(By.xpath("//img[@class='btn-close']")).click();
		//driver.findElement(By.xpath("//img[@class='pop-picture']")).click();
		
		String s = driver.findElement(By.xpath("//input[@id='search-key']")).getText();
		System.out.println(s);
		
		
	}

}