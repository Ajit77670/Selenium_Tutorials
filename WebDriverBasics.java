package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\Downloads\\Eclipse\\ChromoDriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver(); // 1 step-->open the browser or Launch the browser.
	
driver.get("http://www.google.com"); //2 step -->enter the URL

String title= driver.getTitle(); // 3rd step-->get the title of the Web-page
System.out.println(title);

// 4th step --> Validation point: (To check if the title is correct or not)
if(title.equals("Google")) 
{
	System.out.println("correct title");
}
else 
{
	System.out.println("incorrect title");
}
	
//method to get the currentURL of the web-page
System.out.println(driver.getCurrentUrl());

/*method to view the page source on console.(waste method generally we don't use it)
System.out.println(driver.getPageSource());
*/

// 5th step--> to quit the browser

//driver.quit(); //close the browser
//System.out.println(driver.getTitle()); // Session ID is null. Using WebDriver after calling quit()?

driver.close(); // close the browser
System.out.println(driver.getTitle());	// invalid session id


	
	}

}
 