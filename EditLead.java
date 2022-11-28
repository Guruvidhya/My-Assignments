package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[3]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Firstname");
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[contains(text(),'firstname')])[2]")).click();
		String title1 = driver.getTitle();
		String title2="View Lead | opentaps CRM";
		if(title1.equals(title2)) {
			System.out.println("The title of the page is validated");
		}
		else
			System.out.println("The title of the page is different");
		driver.findElement(By.xpath("(//a[@Class='subMenuButton'])[3]")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Edit");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String  input1= driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).getText();
		String input2 = "Edit";
		if(input1.equals(input2))
				{
			System.out.println("The page is successfully edited");
				}
		else
			System.out.println("The field is not successfully edited");
		driver.close();
	}

}
