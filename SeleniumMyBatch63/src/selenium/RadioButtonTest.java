package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> radbutton = driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(radbutton.size());
		for(int i=0;i<radbutton.size();i++) {
			System.out.println(radbutton.get(i).getAttribute("value")+"----------"+radbutton.get(i).isSelected());
		}
		System.out.println("================");
		Thread.sleep(3000);
		
	//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		radbutton.get(2).click();
		System.out.println("---------------------------");
	}

}
