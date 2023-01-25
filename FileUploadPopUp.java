package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin.bigbasket.com/admin/product/products_upload_new/");
		
		driver.findElement(By.name("xlsx")).sendKeys("C:\\Users\\Ajith Kumar\\Downloads\\Final SP Report.xlsx");
		 

		// Note : This is the Testing we are doing for upload file button inspection.
		
		// This is the only case where we are not using .click() for buttons, instead we are using sendKeys() method. Remember this point.
		
		//Also we can use this property if type="file" will be there in inspection section of file upload button.
		
	}

}
