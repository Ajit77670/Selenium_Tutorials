package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Concept {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\Downloads\\Eclipse\\ChromoDriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("http://www.google.com");
System.out.println(driver.getTitle());

driver.navigate().to("http://amazon.in/");
System.out.println(driver.getTitle());

driver.navigate().back();
System.out.println(driver.getTitle());

driver.navigate().forward();
System.out.println(driver.getTitle());

driver.navigate().back();
System.out.println(driver.getTitle());

driver.navigate().refresh();


	}

}
