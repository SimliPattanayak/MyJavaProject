package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class code{
	public static void main(String[] args){
      WebDriver driver = new ChromeDriver();
     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
     driver.manage().window().maximize();
     driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected();
     
     driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
    /* WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
     Select s = new Select(staticdropdown);
     s.selectByValue("ATQ");*/
     
     driver.findElement(By.xpath("//a[@value='ATQ']")).click();
     
     driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
     driver.findElement(By.xpath("//a[@value='DEL']")).click();
     
     
     driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
    
     List<WebElement> dates = driver.findElements(By.className("selectDay"));
     for(int i=0; i<dates.size();i++) {
    	 String text = driver.findElements(By.className("selectDay")).get(i).getText();
    	 if(text.equalsIgnoreCase("10")) {
    		 driver.findElements(By.className("selectDay")).get(i).click();
    	 }
    	 
    	 
     }
     
}
}