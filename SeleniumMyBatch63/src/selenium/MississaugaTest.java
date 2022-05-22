package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		Thread.sleep(12000);
		
		

			List<WebElement> organisation = driver.findElements(By.id("IPerceptionsEmbed"));
			
			if(organisation.size()>0) {
			

				driver.switchTo().frame(driver.findElement(By.id("IPerceptionsEmbed")));
				//to select dynamic popup iframe

				driver.findElement(By.id("closeButton")).click() ;		
				driver.switchTo().parentFrame();
			}
			
			
			
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		Thread.sleep(1000);
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//ul[@class='main-nav-links']/li[3]//li"));
		System.out.println(dropdown.size());
		
		for(int i=1;i<dropdown.size();i++) {
			System.out.println(dropdown.get(i).getText());
	}
}
}


