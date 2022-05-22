package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		Thread.sleep(12000);
				
		List<WebElement> PopUp = driver.findElements(By.id("closeButton"));
		System.out.println(PopUp.size());
		
		if(PopUp.size()>0) {
			PopUp.get(0).click();
		}
		
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		Thread.sleep(1000);
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//ul[@class='main-nav-links']/li[3]//li"));
		System.out.println(dropdown.size());
		
		for(int i=1;i<dropdown.size();i++) {
			System.out.println(dropdown.get(i).getText());
		}
	}
}


