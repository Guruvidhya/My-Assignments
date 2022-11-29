package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Find')])")).click();
		driver.findElement(By.xpath("(//ul[@class='x-tab-strip x-tab-strip-top']/li)[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//input[contains(@class,'x-form')])[36]")).sendKeys("9003260525");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		
		String value = driver.findElement(By.xpath("//td[contains(@class,'x-grid3-col')]/div/a")).getText();
		driver.findElement(By.xpath("//td[contains(@class,'x-grid3-col')]/div/a")).click();
		System.out.println("link clicked");
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Find')])")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(value);
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		String mes = "No records to display";
		String mes1 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(mes.equals(mes1))
		{
			System.out.println("The record is delected successfully");
		}
		else
		{
			System.out.println("The record is not deleted");
		}
		driver.close();
	
	}

}
