package selenium;

public class xPathTest {
	//Download chropath in browser to find the xpath in inspect of any html tag

	//Xpath

	//Rel XPath - //button[contains(@id=‘u_0_d_’)]   -  to find the changing part of the page

	//div[@class=‘_6lux'][1] - if the id is working for 2 xpaths [1] will print the first one

	//input[@placeholder='Password' and @id=‘pass'] - works when both are correct

	//button[@data-testid='royal' or @type=‘submit'] - when one of them is correct

	//Mix xpath - //div[@class=‘_6lux’]/div/input - in order to find the attribute inside the div

	//html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1] - to use the relative x path

	//Xpath using text - //h2[text()=‘Sign Up’]
	//h2[contains(text(),’Sign Up’)]
	
	//1. Absolute xpath or Position xpath
	//2. Attribute xpath or Relative xpath

	//1. Absolute xpath or Position xpath

	//html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]  - use only tags and always unique

	//2. Attribute xpath or Relative xpath

	//a. Standard - //TagName[@attributeName='AttributeValue']  -  //input[@data-testid='royal_email']

	//b. //*[@attributeName='AttributeValue'] - //*[@data-testid='royal_email']  - Any Tag name - doesn't scan the tag name(only attribute)


	//c. //TagName[@attributeName='AttributeValue' and @attributeName='AttributeValue'] - Both attributes should present
	//TagName[@attributeName='AttributeValue' or @attributeName='AttributeValue']  - Either should present


	//d. When your entire xpath giving you more than one matching nodes - works with Chrome
	//(//input[@class='inputtext login_form_input_box'])[2]

	//e. Regular expression xpath - Contains, Starts-with
	//div[contains(@id,'js_')]   - id="abcjs_sdfd'
	//div[starts-with(@id,'js_')] - id="js_sdfd'

	//f. Mix xpath
	//div[@id='u_0_e']/div/input

	//e. Xpath using text
	//*[text()='Sign Up']
	//h2[contains(text(),'Sign U')]






















}
