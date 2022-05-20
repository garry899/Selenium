package selenium;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpTest2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Gurinder");
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("326541654");
		driver.findElement(By.id("password_step_input")).sendKeys("sfdsf2");
		driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		
		WebElement dropdownmnth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s = new Select(dropdownmnth);
		s.selectByIndex(0);
		
		
		driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
		WebElement dropdownday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select l = new Select(dropdownday);
		l.selectByIndex(8);
		
		driver.findElement(By.xpath("//select[@name='birthday_year']")).click();
		WebElement dropdownyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y = new Select(dropdownyear);
		y.selectByValue("1993");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
	//	driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		driver.findElement(By.name("websubmit")).click();

		
	}

}