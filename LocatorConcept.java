package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\Downloads\\Eclipse\\ChromoDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		//	Thread.sleep(5000); // we can use this timing if the WebPage is not loading ( 5000) we took bcuz this hubspot.com wait for 5 sec to verify.
		
		// 1st Locator --> id: (1st prefernce will give locator  id for finding elemnts as id is unique.)
		
		/*
		WebElement email =driver.findElement(By.id("username"));
		email.sendKeys("ajit.kumar@bigbasket.com");
		
		WebElement pwd =driver.findElement(By.id("password"));
		pwd.sendKeys("Bigbasket@21");
		*/
	
		//we can directly send the keys without storing it into the WebElemnts but first method is gud to practise.
		 
		// 	driver.findElement(By.id("username")).sendKeys("ajit.kumar@bigbasket.com");
		 	
		//	driver.findElement(By.id("password")).sendKeys("Bigbasket@21");
			
		//	driver.findElement(By.id("loginBtn")).click();
		 
		
		// 2nd Locator --> name:  ( 2nd prefernce will be given to name for finding the elements).
			
		//	driver.findElement(By.name("username")).sendKeys("ajit.kumar@bigbasket.com");
			
		//	driver.findElement(By.name("password")).sendKeys("Bigbasket@21");
		
		
		// 3rd Locator --> xpath: (3rd preference for finding the elements).
		
		// driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("ajit.kumar@bigbasket.com");
		
		// driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Bigbasket@21");
		
		
		// 4th Locator --> Css Selector: (3rd preference for finding the elements).
		
		// driver.findElement(By.cssSelector("#username")).sendKeys("ajit.kumar@bigbasket.com");
		
		// driver.findElement(By.cssSelector("#password")).sendKeys("Bigbasket@21");
		
		
		// 5th Locator --> Class Name: (Least priority for finding the elements , is not unique always.)
		
		driver.findElement(By.className("login-email")).sendKeys("ajit.kumar@bigbasket.com");
		
		driver.findElement(By.className("login-password")).sendKeys("Bigbasket@21");
		
		/*	form-control private-form__control login-email
			form-control private-form__control login-password m-bottom-3
			
		Note : we should take uncommon class name from the two field(Username & Password).
		
		*/
		
		
		// 6th Locator --> (link text) : onlu use for links available on webpage.(All the anchor link (a) or (i18) are used for link text locator)
		
		//	driver.findElement(By.linkText("Sign up")).click();
		
		
		// 7th Locator --> (partial link text) : we can pass partial link text of the field. Here we have taken  sign instead of signup.
		
		driver.findElement(By.partialLinkText("Sign")).click();
		
		/**
		 * we should always try to use (link text) locator instead of (partial link text) locator.
		 *
		 *The below case will be confusing for Seleinum if we choose partial link text locator.
		 *
		 * sign up 
		 * sign in
		 */
	}

}
