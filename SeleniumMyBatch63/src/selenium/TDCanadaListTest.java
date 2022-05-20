package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDCanadaListTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.td.com/ca/en/personal-banking/");
		
		List<WebElement> tdList = driver.findElements(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']/a"));

		System.out.println(tdList.size());
		for(int i=0;i<tdList.size();i++) {
			System.out.println(tdList.get(i).getText());
		}
	}

}
