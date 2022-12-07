package week3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableCount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		
		//Dimension size = driver.findElement(By.xpath("//table[@class='attributes-list']/tbody/tr")).getSize();
		//System.out.println(size);
		
		List<WebElement> rowsize = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr"));
		int size1 = rowsize.size();
		System.out.println("The row size is "  +  size1);
		
		List<WebElement> colsize = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr[2]/td"));
		int size2 = colsize.size();
		System.out.println("The column size is "  +  size2);
		
	
	}

}
