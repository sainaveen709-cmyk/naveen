package Naveen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logoscreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		// Locate ONLY the Login button
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));

		// Take screenshot of the login button
		File src = loginBtn.getScreenshotAs(OutputType.FILE);

		Thread.sleep(3000);
		// Save file
		File dest = new File("C:\\Users\\saina.000\\OneDrive\\Pictures\\naveen.jpg");
		FileUtils.copyFile(src, dest); // For FileUtils Import you should add appach dependencies in pom

		System.out.println("Screenshot saved at: " + dest.getAbsolutePath());

		driver.quit();
	}
}

