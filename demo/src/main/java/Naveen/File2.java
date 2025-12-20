package Naveen;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.foundit.in/upload");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('file-upload').click()");

		Thread.sleep(2000);

		String filepath = "\"C:\\Users\\saina.000\\OneDrive\\INTERIOR\\REPORT OF INTERIOR.pdf\"";
		StringSelection ss = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Thread.sleep(2000);

		Robot robo = new Robot();
		robo.delay(1000);

		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);

		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		System.out.println("file has been uploaded successfully");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='pop_upload']")).click();
		Thread.sleep(2000);

	}

}
