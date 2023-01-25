package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver_get_driver_navigate_method_browser_launch_difference {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\Downloads\\Eclipse\\ChromoDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://amazon.in");
		System.out.println(driver.getTitle());
		
			
		driver.navigate().to("http://amazon.in");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
/**
 *  Note : Both driver.get() and driver.navigate() method used to launch the browser.
 *   
 *    driver.get() :The main difference is that if we use driver.get() method for browser launching and will try to get the title of that page
 *  				and if the page not get load fully then it will not give the title of the page.
 *  
 * 		driver.navigation.to() : in this if the page is not loaded fully it will still  gives you the title , if the title of the page is visible.
 * 								Although navigate().to() method used to navigate from one webPage to another.
 */
		

	}

}
