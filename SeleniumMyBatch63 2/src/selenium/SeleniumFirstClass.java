package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver(); //Open Firefox
		
		driver.get("https://www.facebook.com/"); //Open Facebook
		
		driver.findElement(By.id("email")).sendKeys("sdgsfgdrthdfgdsfahgsdagsdy"); //Type wrong email
		driver.findElement(By.id("pass")).sendKeys("sdgdgsdfhxfgxhtjdfh");//Type wrong pass
		driver.findElement(By.name("login")).click(); //click on login button

	}

}
