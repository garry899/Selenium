package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//not working for alerts
		//only for finding the elements
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.findElement(By.name("B2")).click();
		//Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		wait.until(ExpectedConditions.alertIsPresent());
		//Javascript alert
		al.accept();//click on only button
		//al.dismiss();//to click on cancel button
		


	}

}
