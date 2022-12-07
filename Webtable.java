package week3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();

		
		driver.findElement(By.xpath("//a[text()='STOCK MARKET ']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		String column = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']/thead/tr/th[3]")).getText();
	
	System.out.println(column);
	
	//String text1 = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']/tbody/tr/td[3]")).getText();
	
	List<WebElement> elements = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']/tbody//td[3]"));
	int size1 = elements.size();
	
	System.out.println(size1);
	List<String> value = new ArrayList<String>();

	for (WebElement name : elements) {
		value.add(name.getText());
		System.out.println(name.getText());
	}
	
	Set<String> column1 = new LinkedHashSet<String>(value);
	int size2 = column1.size();
	
	if(size1==size2)
		System.out.println("No duplicates value");
	else
		System.out.println("Duplicates values are found");
	
	}
	

	}


