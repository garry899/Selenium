package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AliExpressSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");

		Thread.sleep(2000);

		List<WebElement> popUp1 = driver.findElements(By.className("btn-close"));
		//System.out.println(popUp1.size());
		
		if(popUp1.size()>0) {
			popUp1.get(0).click();
		}
		
		List<WebElement> popUp2 =driver.findElements(By.className("_24EHh"));
		//System.out.println(popUp2.size());
		
		if(popUp2.size()>0) {
			popUp2.get(0).click();
		}
		
		List<WebElement> popUp3 =driver.findElements(By.className("close-btn"));
		//System.out.println(popUp3.size());
		
		if(popUp3.size()>0) {
			popUp3.get(0).click();
		}
		
		//type Canada
		driver.findElement(By.className("search-key")).sendKeys("Canada");
		Thread.sleep(2000);
		//size - 10
		List<WebElement> ali = driver.findElements(By.className("ui-autocomplete"));
		System.out.println(ali.size());
		
		//print text
		
		 for(int i=0;i<ali.size();i++) {
		 System.out.println(ali.get(i).getText()); 
		 }
		 
		
		/*
		 * for(WebElement a :ali) { System.out.println(a.getText()); }
		 */
	}

}
