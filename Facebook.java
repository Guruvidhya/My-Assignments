package automation;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("first");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("surname");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("password");
		WebElement element = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sel1 = new Select(element);
		sel1.selectByIndex(2);
		WebElement element2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sel2 = new Select(element2);
		sel2.selectByVisibleText("Apr");
		WebElement element3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select sel3 = new Select(element3);
		sel3.selectByValue("2000");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		
		
	}

}
