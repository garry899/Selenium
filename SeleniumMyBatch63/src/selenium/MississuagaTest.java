package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississuagaTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		Thread.sleep(3000);
		
			

		try {
		if(driver.findElement(By.id("IPerceptionsEmbed")).isEnabled()==true || driver.findElement(By.id("IPerceptionsEmbed")).isDisplayed()==true) {
		

			driver.switchTo().frame(driver.findElement(By.id("IPerceptionsEmbed")));
			//to select dynamic popup iframe

			driver.findElement(By.id("closeButton")).click() ;		
			driver.switchTo().parentFrame();
		}
	}
		
		
		catch(Exception e) { 
			
		}
		
		WebElement a = driver.findElement(By.xpath("//button[contains(text(),'Our organization')]"));
		a.click();
		Thread.sleep(3000);
		List<WebElement> misisaga = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		System.out.println(misisaga.size());
		for(int i1=0;i1<misisaga.size();i1++) {
			System.out.println(misisaga.get(i1).getText());
		
		
		
		}
				
	
		
	}
}


