package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");

		Thread.sleep(2000);

		//type Canada
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Canada");
		Thread.sleep(2000);
		//size - 10
		List<WebElement> google = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(google.size());
		
		//print text
		/*
		 * for(int i=0;i<google.size();i++) {
		 * System.out.println(google.get(i).getText()); }
		 */
		
		for(WebElement a :google) {
			System.out.println(a.getText());
		}
	}

}
