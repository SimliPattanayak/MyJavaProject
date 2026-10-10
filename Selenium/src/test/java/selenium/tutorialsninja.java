package selenium;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tutorialsninja {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php");
		driver.manage().window().maximize();

		// Euro Selection
		driver.findElement(By.id("form-currency")).click();
		driver.findElement(By.xpath("//button[@name='EUR']")).click();

		// EOS 5D Camera Selection
		driver.findElement(By.xpath("//img[@title='Canon EOS 5D']/../../..//span[text()='Add to Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cart")).click();
		System.out.println(driver.findElement(By.xpath("//*[@class='text-center']")).getText());
		driver.findElement(By.id("cart")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
		driver.findElement(By.xpath("//a[text()='Qafox.com']")).click();
		driver.findElement(By.xpath("//img[@title='iPhone']")).click();
		WebElement iphoneQty = driver.findElement(By.xpath("//input[@id='input-quantity']"));
		iphoneQty.click();
		iphoneQty.clear();
		// driver.findElement(By.xpath("//input[@id='input-quantity']")).sendKeys("2");
		iphoneQty.sendKeys("2");
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		Thread.sleep(2000);
		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		driver.findElement(By.xpath("//span[@id='cart-total']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']")).click();
		Thread.sleep(2000);
		WebElement iphnqtyupdate = driver.findElement(By.xpath("//input[@class='form-control']"));
		iphnqtyupdate.click();
		iphnqtyupdate.clear();
		iphnqtyupdate.sendKeys("3");
		driver.findElement(By.xpath("//i[@class='fa fa-refresh']")).click();
		
		//Printing of ECO Tax and VAT for iphone
		WebElement ecoTax = driver.findElement(By.xpath("//div[@class='row']/div/table/tbody/tr[2]/td[2]"));
		System.out.println("ECO TAX:" + ecoTax.getText());
		WebElement vat = driver.findElement(By.xpath("//div[@class='row']/div/table/tbody/tr[3]/td[2]"));
		System.out.println("VAT:" + vat.getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='buttons clearfix']/div[2]")).click();
		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText());
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='buttons clearfix']/div[1]")).click();
		
		//MacBook Selection
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='image']")).click();
		WebElement macBook = driver.findElement(By.xpath("//input[@id='input-quantity']"));
		String macBookQty = macBook.getAttribute("value");
		if (macBookQty.equalsIgnoreCase("1")) {
			driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		}
		Thread.sleep(1000);
		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		//Coupon Code and Gift Certificate for MacBook
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']")).click();
		driver.findElement(By.xpath("//a[@class='accordion-toggle']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-coupon']")).sendKeys("ABCD123");
		driver.findElement(By.xpath("//input[@id='button-coupon']")).click();
		Thread.sleep(1000);
		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='accordion']/div[2]/div/h4/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-voucher']")).sendKeys("AXDFGH123");
		driver.findElement(By.xpath("//input[@id='button-voucher']")).click();

		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText());
		driver.findElement(By.xpath("//input[@id='input-voucher']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='accordion']/div/div/h4/a")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@name='coupon']")).click();
		driver.findElement(By.xpath("//div[@id='collapse-coupon']/div/div/input")).clear();
		driver.findElement(By.xpath("//div[@class='buttons clearfix']/div[2]/a")).click();
		
		//Select Register Account
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='account']")).isSelected();
		driver.findElement(By.xpath("//input[@id='button-account']")).click();
		
		//Enter Billing Details
		Thread.sleep(2000);
		driver.findElement(By.id("input-payment-firstname")).sendKeys("Simli");
		driver.findElement(By.id("input-payment-lastname")).sendKeys("Pattanayak");
		driver.findElement(By.id("input-payment-email")).sendKeys("sim52@abc.com");
		driver.findElement(By.id("input-payment-telephone")).sendKeys("123456789");
		driver.findElement(By.id("input-payment-password")).sendKeys("Sim@@");
		driver.findElement(By.id("input-payment-confirm")).sendKeys("Sim@@");
		driver.findElement(By.id("input-payment-address-1")).sendKeys("Mulberry St.");
		driver.findElement(By.id("input-payment-city")).sendKeys("Atlanta");
		driver.findElement(By.id("input-payment-postcode")).sendKeys("30012");
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.id("input-payment-country"));
		Select c = new Select(country);
		c.selectByVisibleText("United States");
		Thread.sleep(2000);
		WebElement state = driver.findElement(By.id("input-payment-zone"));
		Select s = new Select(state);
		s.selectByVisibleText("Georgia");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.id("button-register")).click();
		
		
		//Enter Comment, Contact us & submit an enquiry
		Thread.sleep(2000);
		driver.findElement(By.name("comment")).sendKeys("Buying a MacBook");
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-warning alert-dismissible']")).getText());
		driver.findElement(By.linkText("contact us")).click();
		driver.findElement(By.id("input-enquiry")).sendKeys("No payment option available");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		driver.findElement(By.linkText("Continue")).click();

	}
}
