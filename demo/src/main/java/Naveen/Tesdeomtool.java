package Naveen;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tesdeomtool {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/inventory.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"user-name\"]")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"login-button\"]")).click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();

		a.accept();
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//img[@class='inventory_item_img']"))).perform();

		driver.findElement(By.xpath("//img[@class='inventory_item_img']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='back-to-products']")).click();

		Thread.sleep(1000);

		driver.navigate().to("https://www.saucedemo.com/");
		
	}

}
