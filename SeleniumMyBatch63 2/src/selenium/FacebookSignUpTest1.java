package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookSignUpTest1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("decfvrgrf");
		driver.findElement(By.xpath("//div[@class='_1lch']/button")).click();
	}

}
