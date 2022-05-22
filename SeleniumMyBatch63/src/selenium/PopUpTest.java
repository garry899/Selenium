package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://best.aliexpress.com");
		Thread.sleep(4000);
		
		List<WebElement> popUp1 = driver.findElements(By.className("btn-close"));
		System.out.println(popUp1.size());
		
		if(popUp1.size()>0) {
			popUp1.get(0).click();
		}
		
		List<WebElement> popUp2 =driver.findElements(By.className("_24EHh"));
		System.out.println(popUp2.size());
		
		if(popUp2.size()>0) {
			popUp2.get(0).click();
		}
		
		driver.findElement(By.id("search-key")).sendKeys("laptop");
		//If you get popups --> close both the popups --> type laptop in the search box
		//If you don't get popups , type laptop in the search box
		
		

	}

}
