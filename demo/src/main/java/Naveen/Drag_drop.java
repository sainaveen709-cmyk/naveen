package Naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(1500);

		driver.switchTo().frame(0);
		
		Actions ac = new Actions(driver);
		WebElement a = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement b = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		ac.dragAndDrop(a,b).perform();
		
		
	}

}
