package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		
		driver.findElement(By.name("B2")).click();
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		//Javascript alert
		al.accept();//click on only button
		//al.dismiss();//to click on cancel button
		

	}

}
