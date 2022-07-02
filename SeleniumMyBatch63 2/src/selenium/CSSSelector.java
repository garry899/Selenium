package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelector {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//tagName[attributeName='AttributeValue']
		//CSS Selector syntax
		
		//driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("sadfad@sdsvvs");
		
		//input[placeholder='Email or phone number'][id='email']
		//CSS syntax for multiple attributes
		
		//*[placeholder='Email or phone number'][id='email']
		// * to print any tag name
		
		//input[placeholder*='il or phone num']
		//to put partial content
		//same as contains in xpath
		
		//input[placeholder^='Email or phone num']
		//starts with
		
		//input[placeholder$=' or phone number']
		//ends with
		
		//div[class='_6lux']>input
		//to add parent tag
		
		// #email
		//to find id directly
		
		//.classsName
		//._6lux
		//to find class directly
		
		//._6lux>input
		//to put value in class directly
		
		//Standard - tagName[attributeName='AttributeValue']

		//		*[attributeName='AttributeValue']  - any tagname

		//		tagName[attributeName='AttributeValue'][id='email]  - multiple attributes

		//		input[placeholder*='il or phone num']  - * is for contains
		//		input[placeholder^='Email or phone num']  - ^ is for Starts-With
		//		input[placeholder$=' or phone number']  - $ Ends with

		//		div[class='_6lux']>input  - Mix CSS

		//		#email  - CSS with id
		//		._6lux  - CSS with Class
		//		.inputtext._55r1._6luy  (inputtext _55r1 _6luy)  - replace space with .
		
		
	}

}
