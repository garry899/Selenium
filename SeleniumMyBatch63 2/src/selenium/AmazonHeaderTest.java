package selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		
		List<WebElement> trending = driver.findElements(By.xpath("//a[@class='nav-a  ']"));
	
		System.out.println(trending.size());

		for(int p = 0; p<trending.size(); p++) {
			
			System.out.println(trending.get(p).getAttribute("innerText"));//to print hidden headers

}
	}
}
