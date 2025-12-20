package Naveen;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
 
		driver.get("https://www.google.com");
 
		// Step 1: Enter text in Search Box
		WebElement GoogleSearch = driver.findElement(By.name("q"));
		GoogleSearch.sendKeys("Selenium");
 
		Thread.sleep(2000);
 
		// Step 3: Capture all dynamic dropdown suggestions
		List<WebElement> EL = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
 
		// Step 4: Print them (optional)
		for (WebElement s : EL) {
			System.out.println(s.getText());
		}
		Thread.sleep(3000);
		// Step 5: Click the first suggestion
		EL.get(2).click();
 
		// Step 6: Close browser
		// driver.quit();
	}
}
 
 
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


