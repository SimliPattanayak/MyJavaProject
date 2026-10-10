package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class juiceshop {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://juice-shop.herokuapp.com/#/login");
		driver.manage().window().maximize();
		driver.switchTo().alert().dismiss();
		
		
		
		
	}
	
	
	
	
	
	

}
