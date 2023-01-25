package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager_Concept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://amazon.in");
		System.out.println(driver.getTitle());

		
	}

}

/**
 * Note : WebDriverManager.chromedriver().setup(); --> is the third party dpendency which manage the .exe file.
 * Once we use this dependency in POM.xml file , no need to setProperty for .exe web-broweser all the time.
 * https://bonigarcia.dev/webdrivermanager/ -- this is the third party who mange WebDriverManger.
 */
