package Naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");

		WebElement country = (driver.findElement(By.xpath("//div[@class='col-md-6 col-sm-12']")));
		Thread.sleep(15000);
		Select sel = new Select(country);

		sel.selectByVisibleText("Group 2, option 1");

	}

}
