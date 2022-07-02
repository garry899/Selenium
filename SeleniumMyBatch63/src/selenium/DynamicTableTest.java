package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		

	    List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		System.out.println(cols.size());
		
		for(int i=2;i<=rows.size();i++) {
			for(int j=1;j<=cols.size();j++) {
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
				System.out.print("  |  ");
			}
			System.out.println();
		}
}
}
