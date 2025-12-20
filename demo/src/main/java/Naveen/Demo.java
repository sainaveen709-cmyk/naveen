package Naveen;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //
		driver.manage().window().maximize();

		// Step 1 → Open site
		driver.get("https://www.foundit.in/upload");

		// Step 2 → Click the Upload Resume button
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('file-upload').click();");
		Thread.sleep(2000);

//	        // Step 3 → Click actual hidden file upload input
//	        driver.findElement(By.xpath("//button[@class=\"line-btn\"]")).click();
//	        Thread.sleep(2000);

		// File path to upload
		String filePath = "\"C:\\Users\\konda\\Downloads\\full_name_mobile_requirements.pdf\"";

		// Step 4: Copy file path into clipboard
		StringSelection ss = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// Step 5: Robot class to upload /For key words Apis
		Robot robot = new Robot();
		robot.delay(1000);

		// CTRL + V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		// ENTER
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("File Uploaded Successfully!");

		Thread.sleep(5000);
		driver.quit();

	}

}
