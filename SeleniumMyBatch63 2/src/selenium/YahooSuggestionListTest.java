package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		//Thread.sleep(2000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
		//type Canada
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Canada");
		//Thread.sleep(2000);

		//size - 10

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']/li")));
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//ul[@role='listbox']/li"),10));
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
