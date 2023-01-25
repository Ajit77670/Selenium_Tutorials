package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopHandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Thread.sleep(5000); // just to show the changes we took Thread.sleep method for 5 sec.
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert=driver.switchTo().alert(); // alert() will return an Alert type , which we can store with Alert refernce.
												// Also Alert is an interface.
		// used switchTo() method , to switch the driver from the main web-page to the Alert-popup.
		
		String text=alert.getText(); // getText return a return type String
		System.out.println(text);
		
		//validation point for pop-up text
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct text");
		}
		else {
			System.out.println("incorrect text");
		}
		
		alert.accept(); // it will click on OK button of alert pop-up
		
	// alert.dismiss(); // cancel the alert. (to remove we use ESC , same thing dismiss() method do)
		
	
	// Note: The Alert is only responsible for java script pop-up. 	
	//       Any other pop-up coming on the screen if it is not javascript popup it will not be handle or inspect.
		
	}

}
