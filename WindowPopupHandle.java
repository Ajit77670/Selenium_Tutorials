package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopupHandle {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
		
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.popuptest.com/goodpopups.html"); // 1st window --> Parent Window
		
	driver.findElement(By.linkText("Good PopUp #3")).click(); // 2nd Window --> PopUp window
		
	Set<String> handles =driver.getWindowHandles(); // getWindowHandles() gives the window id for open browsers. And return type is Set<String>
													// we will get 2 window-id one for Webpage(Parent) and another for PopUp(Child).
	
	// And we know set does not maintain insertion order , so to get the window-id of Parent(Webpage) and child(PopUp) window 
	//we need to iterate this so we have to use iterator.(Any collections which not have indexing will use iterator for fetching the details).
	
	Iterator<String> it= handles.iterator(); // iterartor return string bcuz all webPage returns iterator in the form of String.
	
	String parentWindowID=it.next(); // we can do it.hasNext() in while loop whwn we have multiple browsers.
	System.out.println("parent window id is : "+ parentWindowID);	
	
	String childWindowID=it.next();
	System.out.println("Child window id is : "+ childWindowID);
	
	driver.switchTo().window(childWindowID); // the driver will switch to the child window(Popup)
	
	System.out.println(driver.getTitle()); // This will give the tilte of Childwindow as the driver location is in child window now.
	
	driver.close();  // we will use here driver.close() , bcuz we need to close only the child window(PopUp).
	
	// driver.quit(); // we will not use quit() method as it will close all the windows , parent as well as child.
	
	driver.switchTo().window(parentWindowID); // After closing the child window,our driver is lost , so to get it back we need to switch it to parentWindowId
	
	System.out.println("parent window title is : " + driver.getTitle());
	
	//Now we can continue our wrk, what we want to do with parent window.
	
	driver.quit(); // Now we can use quit as our work is done. 
	
	}

}
