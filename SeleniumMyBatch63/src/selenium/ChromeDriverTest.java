package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/gurindersingh/Selenium/SeleniumJars/chromedriver");
		//ClassName objName = new ClassName();
		ChromeDriver driver = new ChromeDriver(); //Open Firefox
		
		driver.get("https://www.facebook.com/"); //Open Facebook
		
		driver.findElement(By.id("email")).sendKeys("sdgsfgdrthdfgdsfahgsdagsdy"); //Trype wrong email
		driver.findElement(By.id("pass")).sendKeys("sdgdgsdfhxfgxhtjdfh");//Type wrong pass
		driver.findElement(By.name("login")).click(); //click on login button


	}

}
